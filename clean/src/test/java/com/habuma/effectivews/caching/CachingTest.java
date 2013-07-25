package com.habuma.effectivews.caching;

import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.habuma.effectivews.Service;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CachingTestConfig.class)
public class CachingTest {
	
	@Autowired
	private Service service;
	
	@Autowired
	private JdbcOperations jdbc;
	
	@Test
	public void shouldOnlyHitDatabaseOnce() {
		for (int i=0; i < 10; i++) {
			assertEquals("Hello world", service.getMessage());
		}	
		verify(jdbc, times(1)).queryForObject(anyString(), (Class<?>) any());
	}
 
}
