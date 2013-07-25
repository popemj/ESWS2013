package com.habuma.effectivews.caching;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.interceptor.DefaultKeyGenerator;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import com.habuma.effectivews.ExampleService;
import com.habuma.effectivews.Service;

@Configuration
@EnableCaching
public class CachingConfig implements CachingConfigurer {


	@Bean
	public Service service(JdbcOperations jdbc) {
		return new ExampleService(jdbc, NoOpPasswordEncoder.getInstance());
	}	

	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager();
	}

	public KeyGenerator keyGenerator() {
		return new DefaultKeyGenerator();
	}
	
}
