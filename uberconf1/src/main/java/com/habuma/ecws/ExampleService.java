package com.habuma.ecws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


/**
 * {@link Service} with hard-coded input data.
 */
@Component
public class ExampleService implements Service {
	
	private JdbcTemplate jdbc;

	@Autowired
	public ExampleService(@Wanted @Fluffy JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return jdbc.queryForObject("select message from Greetings where id=1", String.class);	
	}

}
