package com.demo.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.demo.configuration")

public class EmployeeConfig {

   @Bean
   @Scope("prototype")
   @Qualifier(value="e1")
	public Employee employee() {
		return new Employee("Ansh");
	}
   
   @Bean
   //@Primary
   @Qualifier(value="e2")
 	public Employee employeeSecond() {
		return new Employee("Sara");
	}
	
}
