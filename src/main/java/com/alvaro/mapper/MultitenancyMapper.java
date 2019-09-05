package com.alvaro.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.alvaro.domain.Multitenancy;

@Mapper
public interface MultitenancyMapper {
	
	@Select("SELECT IDCLIENTE AS idCliente, DSENVIRONMENT AS environment FROM PLTMULTITENANCY WHERE idCliente = #{idCliente}")
	Multitenancy findByIdCliente(Long idCliente);
	
	Multitenancy pesquisarMultitenancy();

}
