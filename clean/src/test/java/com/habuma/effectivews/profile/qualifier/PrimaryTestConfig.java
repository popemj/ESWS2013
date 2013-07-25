package com.habuma.effectivews.profile.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

@Configuration
public class PrimaryTestConfig {

	@Bean
	public PasswordEncoder weakEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	@Primary
	public PasswordEncoder strongEncoder() {
		return new StandardPasswordEncoder("shhhh!!!");
	}
	
}
