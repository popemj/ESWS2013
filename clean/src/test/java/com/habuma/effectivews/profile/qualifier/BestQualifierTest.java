package com.habuma.effectivews.profile.qualifier;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.habuma.effectivews.qualifier.Crackable;
import com.habuma.effectivews.qualifier.Impenetrable;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BestQualifierTestConfig.class)
public class BestQualifierTest {

	@Autowired
	@Crackable
	private PasswordEncoder weakEncoder;

	@Autowired
	@Impenetrable
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
