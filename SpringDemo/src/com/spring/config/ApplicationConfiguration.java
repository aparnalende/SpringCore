package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

	@Bean(name="demoService")
	public DemoManager helloWorld() {
		return new DemoManagerImpl();
	}
}
