package com.habuma.ecws;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes=ExampleConfigurationTestsConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("production")
public class ExampleConfigurationTests {
	
	@Autowired
	private Service service;

	@Test
	public void testSimpleProperties() throws Exception {
		assertNotNull(service);
	}
	
	@Test
	public void testGreeting() {
		assertEquals("Hello world", service.getMessage());
	}
	
}
