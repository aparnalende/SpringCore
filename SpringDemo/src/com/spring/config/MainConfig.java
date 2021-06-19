package com.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConfig {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		DemoManager dmObj=(DemoManager) context.getBean("demoService");
		System.out.println(dmObj.getServiceName());

	}

}
