package com.alvaro.multitenancy;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

public class DatasourceEnvironmentProperties extends DataSourceProperties {

	private Integer initialSize;
	private Integer maxActive;
	private Integer maxIdle;
	private Integer minIdle;
	private String environment;
	private Boolean testOnBorrow;
	private String validationQuery;
	private String jndiName;

	public DatasourceEnvironmentProperties(Integer initialSize, Integer maxActive, Integer maxIdle, Integer minIdle, String environment, Boolean testOnBorrow, String validationQuery, String jndiName) {
		super();
		this.initialSize = initialSize;
		this.maxActive = maxActive;
		this.maxIdle = maxIdle;
		this.minIdle = minIdle;
		this.environment = environment;
		this.testOnBorrow = testOnBorrow;
		this.validationQuery = validationQuery;
		this.jndiName = jndiName;
	}

	public DatasourceEnvironmentProperties(Boolean testOnBorrow) {
		super();
		this.testOnBorrow = testOnBorrow;
	}
	
	public DatasourceEnvironmentProperties () {
		
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public Boolean getTestOnBorrow() {
		return testOnBorrow;
	}

	public void setTestOnBorrow(Boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	public String getValidationQuery() {
		return validationQuery;
	}

	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}

	public Integer getInitialSize() {
		return initialSize;
	}

	public void setInitialSize(Integer initialSize) {
		this.initialSize = initialSize;
	}

	public Integer getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(Integer maxActive) {
		this.maxActive = maxActive;
	}

	public Integer getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(Integer maxIdle) {
		this.maxIdle = maxIdle;
	}

	public Integer getMinIdle() {
		return minIdle;
	}

	public void setMinIdle(Integer minIdle) {
		this.minIdle = minIdle;
	}

	@Override
	public String getJndiName() {
		return jndiName;
	}

	@Override
	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}

}