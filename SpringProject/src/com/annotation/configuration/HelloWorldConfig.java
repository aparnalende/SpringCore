package com.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld("First helloworld");
	}
	@Bean 
//	@Scope("prototype")
	@Primary
	public HelloWorld helloSecondoWorld() {
		return new HelloWorld("First secondworld");
	}
}
