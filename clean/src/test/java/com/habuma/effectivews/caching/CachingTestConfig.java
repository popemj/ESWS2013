package com.habuma.effectivews.caching;

import static org.mockito.Mockito.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcOperations;

@Configuration
@Import(CachingConfig.class)
public class CachingTestConfig {
	
	@Bean
	public JdbcOperations fakeJdbcOperations() {
		JdbcOperations mockJdbcOperations = mock(JdbcOperations.class);
		when(mockJdbcOperations.queryForObject("select message from Greeting where id=1", String.class)).thenReturn("Hello world");
		return mockJdbcOperations;
	}
	
}
