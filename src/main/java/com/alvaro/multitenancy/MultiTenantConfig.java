package com.alvaro.multitenancy;

import java.util.HashMap;
import java.util.Map;

import javax.naming.NamingException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class MultiTenantConfig {

	static Logger logger = LogManager.getLogger(MultiTenantConfig.class);

	@Autowired
	private DatasourceConfig datasourceConfig;

	@Bean
	public MultiTenantRoutingDataSource dataSource() throws NamingException {


		Map<Object,Object> resolvedDataSources = new HashMap<>();

		MultiTenantRoutingDataSource multiTenantDataSource = new MultiTenantRoutingDataSource();

		for (DatasourceEnvironmentProperties dataSourceEnvironmentProperties : this.datasourceConfig.getDatasource()) {

			HikariDataSource dataSource = new HikariDataSource();

			dataSource.setDriverClassName(dataSourceEnvironmentProperties.getDriverClassName());
			dataSource.setJdbcUrl(dataSourceEnvironmentProperties.getUrl());
			dataSource.setUsername(dataSourceEnvironmentProperties.getUsername());
			dataSource.setPassword(dataSourceEnvironmentProperties.getPassword());
			//dataSource.setDataSourceProperties(dataSourceEnvironmentProperties);


			//			dataSource.setTestOnBorrow(dataSourceEnvironmentProperties.getTestOnBorrow());
			//			dataSource.setValidationQuery(dataSourceEnvironmentProperties.getValidationQuery());
			//			dataSource.setInitialSize(dataSourceEnvironmentProperties.getInitialSize());
			//			dataSource.setMaxActive(dataSourceEnvironmentProperties.getMaxActive());
			//			dataSource.setMaxIdle(dataSourceEnvironmentProperties.getMaxIdle());
			//			dataSource.setMinIdle(dataSourceEnvironmentProperties.getMinIdle());
			//			dataSource.setDataSourceJNDI(dataSourceEnvironmentProperties.getJndiName());
			//			dataSource.setRemoveAbandoned(true);
			//			dataSource.setRemoveAbandonedTimeout(120);
			//initCtx.bind(dataSourceEnvironmentProperties.getName(), dataSource);
			resolvedDataSources.put(dataSourceEnvironmentProperties.getEnvironment(), dataSource);

		}

		multiTenantDataSource.setTargetDataSources(resolvedDataSources);
		// Call this to finalize the initialization of the data source.
		multiTenantDataSource.afterPropertiesSet();

		return multiTenantDataSource;

	}

	@Bean
	public DataSourceTransactionManager transactionManager() throws NamingException {

		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());

		return transactionManager;

	}

//	@Bean
//	public DataSourceInitializer dataSourceInitializer(DataSource datasource) {
//
//		ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
//		resourceDatabasePopulator.addScript(new ClassPathResource("schema.sql"));
//		resourceDatabasePopulator.addScript(new ClassPathResource("data.sql"));
//
//		DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
//		dataSourceInitializer.setDataSource(datasource);
//		dataSourceInitializer.setDatabasePopulator(resourceDatabasePopulator);
//
//		return dataSourceInitializer;
//	
//	}

}