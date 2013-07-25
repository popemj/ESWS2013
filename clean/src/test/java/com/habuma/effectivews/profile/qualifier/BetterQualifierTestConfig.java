package com.habuma.effectivews.profile.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

@Configuration
public class BetterQualifierTestConfig {

	@Bean
	@Qualifier("crackable")
	public PasswordEncoder weakEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	@Qualifier("impenetrable")
	public PasswordEncoder strongEncoder() {
		return new StandardPasswordEncoder("shhhh!!!");
	}
	
}
