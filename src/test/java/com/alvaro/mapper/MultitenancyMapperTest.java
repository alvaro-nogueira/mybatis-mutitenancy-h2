package com.alvaro.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.alvaro.domain.Multitenancy;
import com.alvaro.mapper.MultitenancyMapper;
import com.alvaro.multitenancy.TenantContext;


@SpringBootTest
@ActiveProfiles("test")
@TestInstance(Lifecycle.PER_CLASS)
public class MultitenancyMapperTest {

	private static final Long IDCLIENTE = 1L;

	@Autowired
	private MultitenancyMapper multitenancyRepository;
	
	@BeforeAll void setup() {
		TenantContext.setCurrentTenant("default");
	}

	@Test
	public void testBuscarPorIDCliente() {

		Multitenancy m = multitenancyRepository.findByIdCliente(IDCLIENTE);

		assertNotNull(m);
		assertEquals("005", m.getEnvironment());
		assertEquals(IDCLIENTE, m.getIdCliente());

	
	}
	
	@Test
	public void testWith() {

		Multitenancy m = multitenancyRepository.pesquisarMultitenancy();

		assertNotNull(m);
		assertEquals("005", m.getEnvironment());
		assertEquals(IDCLIENTE, m.getIdCliente());

	
	}
	
	

}
