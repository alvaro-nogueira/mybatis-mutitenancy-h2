package com.alvaro.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.alvaro.domain.Multitenancy;
import com.alvaro.multitenancy.TenantContext;

@Repository
public class MultitenancyDaoImpl implements MultitenancyDao {

	// private Logger logger = LogManager.getLogger(this.getClass());

	@Autowired
	private PlatformTransactionManager transactionManager;


	private SqlSession sqlSession;

	public MultitenancyDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Multitenancy getByIdCliente(Long idCliente) {

		try {

			TenantContext.setCurrentTenant("default");

			DefaultTransactionDefinition def = new DefaultTransactionDefinition();
			def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);

			TransactionStatus status = transactionManager.getTransaction(def);
			Multitenancy multitenancy;

			try {
				multitenancy = sqlSession.selectOne("findByIdCliente", idCliente);
			} catch (Exception ex) {
				transactionManager.rollback(status);
				throw ex;
			}

			transactionManager.commit(status);

			return multitenancy;

		} catch (Exception e) {

			//logger.error("Erro ao buscar multitenancy para o cliente: " + idCliente);
			throw e;

		}

	}

}