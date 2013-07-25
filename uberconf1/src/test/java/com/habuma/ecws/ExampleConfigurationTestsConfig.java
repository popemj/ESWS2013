package com.habuma.ecws;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.*;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@Configuration
@Import(AppContextConfig.class)
public class ExampleConfigurationTestsConfig {

	@Bean
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder()
			.setType(H2)
			.addScript("classpath:/testdata.sql").build();
	}
	
}
