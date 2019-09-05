package com.alvaro.multitenancy;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultiTenantRoutingDataSource extends AbstractRoutingDataSource {
	@Override
	protected Object determineCurrentLookupKey() {
		return TenantContext.getCurrentTenant();
	}
}