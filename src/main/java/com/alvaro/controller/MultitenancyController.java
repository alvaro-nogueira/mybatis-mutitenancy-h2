package com.alvaro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvaro.dao.MultitenancyDao;
import com.alvaro.domain.Multitenancy;
import com.alvaro.mapper.MultitenancyMapper;



@RestController
@RequestMapping("/api")
public class MultitenancyController {

	@Autowired
	MultitenancyMapper multitenancyRepository;
	
	@Autowired
	MultitenancyDao multitenancyDao;
	
	@GetMapping(value = "/multitenancy/{idCliente}")
	public ResponseEntity<Multitenancy> buscarPorCnpj(@PathVariable Long idCliente) throws Exception {
		
		//Multitenancy s = multitenancyRepository.findByIdCliente(idCliente);
		
		Multitenancy m = multitenancyDao.getByIdCliente(idCliente);
		return ResponseEntity.ok(m);
	}
	

}
