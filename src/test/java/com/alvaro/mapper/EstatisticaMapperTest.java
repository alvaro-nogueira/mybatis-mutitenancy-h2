package com.alvaro.mapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.alvaro.domain.Categoria;
import com.alvaro.multitenancy.TenantContext;


@SpringBootTest
@ActiveProfiles("test")
@TestInstance(Lifecycle.PER_CLASS)
public class EstatisticaMapperTest {

	@Autowired
	private EstatisticaMapper estatisticaMapper;

	@Test
	public void testPesquisarEstatistica() {

		Calendar c = Calendar.getInstance();
		c.set(2019, 1, 1);
		Date dataInicial = c.getTime();
		c.set(2019, 11, 31);
		Date dataFinal =c.getTime();

		TenantContext.setCurrentTenant("006");
		List<Categoria> result = estatisticaMapper.pesquisarEstatistica(5421l, 1, dataInicial, dataFinal, 100,
				"V", 0, 0, 0l, false, 0);
		
		assertNotNull(result);
		
		assertTrue(result.size() > 0);

		
		

//		void pesquisarEstatistica(Long idCliente, Integer agrupamento, Date dataInicial, Date dataFinal,
//				Integer qtdeItensCategoria, String tipoEstatística, Integer filtroAdquirente,
//				Integer agrupamentoMensal, Long idEstabelecimento, Boolean gerarPdfComUmaAdquirente);

	
	}
	
//	@Test
//	public void testWith() {
//
//		Multitenancy m = multitenancyRepository.pesquisarMultitenancy();
//
//		assertNotNull(m);
//		assertEquals("001", m.getEnvironment());
//		assertEquals(IDCLIENTE, m.getIdCliente());
//
//	
//	}
	
	

}