package com.habuma.effectivews.profile.qualifier;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PrimaryTestConfig.class)
public class PrimaryTest {

	@Autowired
	private PasswordEncoder encoder;

	@Test
	public void shouldBeGivenStrongPasswordEncoder() {
		assertTrue(encoder instanceof StandardPasswordEncoder);
	}

}
