package com.habuma.effectivews.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

@Configuration
public class ConditionConfig {

	@Bean
	@Conditional(DevCondition.class)
	public PasswordEncoder devEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Bean
	@Conditional(ProdCondition.class)
	public PasswordEncoder prodEncoder() {
		return new StandardPasswordEncoder("shhh!");
	}

}
