package com.alvaro.multitenancy;

public class TenantContext {

	public final static String DEFAULT_TENANT = "default";

	private static ThreadLocal<Object> currentTenant = new ThreadLocal<Object>() {
		@Override
		protected String initialValue() {
			return DEFAULT_TENANT;
		}
	};
	
	public static void setCurrentTenant(Object tenant) {
		currentTenant.set(tenant);
	}

	public static Object getCurrentTenant() {
		return currentTenant.get();
	}

}