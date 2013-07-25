package com.habuma.effectivews.profile;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes=ProfileTestsConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("dev")
public class DevProfileTest {

	@Autowired
	private PasswordEncoder encoder;

	@Test
	public void shouldBeGivenWeakEncoder() {
		assertTrue(encoder instanceof NoOpPasswordEncoder);
	}
	
}
