package com.habuma.effectivews.profile.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import com.habuma.effectivews.qualifier.Crackable;
import com.habuma.effectivews.qualifier.Impenetrable;

@Configuration
public class BestQualifierTestConfig {

	@Bean
	@Crackable
	public PasswordEncoder weakEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	@Impenetrable
	public PasswordEncoder strongEncoder() {
		return new StandardPasswordEncoder("shhhh!!!");
	}
	
}
