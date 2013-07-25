package com.habuma.effectivews.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

@Configuration
public class ProfileConfig {

	@Bean
	@Profile("dev")
	public PasswordEncoder weakEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Bean
	@Profile("prod")
	public PasswordEncoder strongEncoder() {
		return new StandardPasswordEncoder("shhh!");
	}

}
