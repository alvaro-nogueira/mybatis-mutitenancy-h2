package com.alvaro.dao;

import com.alvaro.domain.Multitenancy;

public interface MultitenancyDao {

	public Multitenancy getByIdCliente(Long idCliente) throws Exception;
	
}