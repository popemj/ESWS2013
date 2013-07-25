package com.habuma.effectivews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.security.crypto.password.PasswordEncoder;


public class ExampleService implements Service {
	
	private JdbcOperations jdbc;
	private PasswordEncoder encoder;

	@Autowired	
	public ExampleService(JdbcOperations jdbc, PasswordEncoder encoder) {
		this.jdbc = jdbc;
		this.encoder = encoder;
	}
	
	/**
	 * Reads next record from input
	 */
	@Cacheable("messageCache")
	public String getMessage() {
		return jdbc.queryForObject("select message from Greeting where id=1", String.class);	
	}
	
	public void createUser(String username, String password) {
		jdbc.update("insert into AppUser (username, password) values (?, ?)", username, encoder.encode(password));
	}

}
