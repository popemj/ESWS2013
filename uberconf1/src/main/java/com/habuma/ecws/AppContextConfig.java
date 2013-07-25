package com.habuma.ecws;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan
public class AppContextConfig {

	@Bean
	@Profile("production")
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	@Profile("dev")
	public JdbcTemplate someOtherJdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
