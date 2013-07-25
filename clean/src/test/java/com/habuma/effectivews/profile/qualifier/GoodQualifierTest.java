package com.habuma.effectivews.profile.qualifier;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=GoodQualifierTestConfig.class)
public class GoodQualifierTest {

	@Autowired
	@Qualifier("weakEncoder")
	private PasswordEncoder weakEncoder;

	@Autowired
	@Qualifier("strongEncoder")
	private PasswordEncoder strongEncoder;

	@Test
	public void shouldBeGivenWeakPasswordEncoder() {
		assertTrue(weakEncoder instanceof NoOpPasswordEncoder);
	}

	@Test
	public void shouldBeGivenStrongPasswordEncoder() {
		assertTrue(strongEncoder instanceof StandardPasswordEncoder);
	}

}
