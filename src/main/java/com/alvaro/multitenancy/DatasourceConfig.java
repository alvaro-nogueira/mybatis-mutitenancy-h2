package com.alvaro.multitenancy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="spring.multitenancy")
public class DatasourceConfig {

	@NestedConfigurationProperty
	private List<DatasourceEnvironmentProperties> datasource = new ArrayList<>();

	public List<DatasourceEnvironmentProperties> getDatasource() {
		return datasource;
	}

	public void setDatasource(List<DatasourceEnvironmentProperties> datasource) {
		this.datasource = datasource;
	}

}