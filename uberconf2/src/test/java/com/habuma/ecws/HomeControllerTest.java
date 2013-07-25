package com.habuma.ecws;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import java.util.Locale;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.ExtendedModelMap;

public class HomeControllerTest {

	@Test
	public void homeTest_asPOJO() {
		HomeController controller = new HomeController();
		ExtendedModelMap model = new ExtendedModelMap();
		String viewName = controller.home(new Locale("en", "US"), model);
		assertEquals("home", viewName);
		assertTrue(model.containsAttribute("serverTime"));
		assertEquals("RIGHT NOW", model.get("serverTime"));
	}
	
	@Test
	public void homeTest_asController() throws Exception {
		HomeController controller = new HomeController();
		MockMvc mockMvc = standaloneSetup(controller)
				.build();
		
		mockMvc.perform(get("/")
					.locale(new Locale("en", "US")))
			   .andExpect(view().name("home"))
			   .andExpect(model().attributeExists("serverTime"))
			   .andExpect(model().attribute("serverTime", "RIGHT NOW"));
		
	}
	
}
