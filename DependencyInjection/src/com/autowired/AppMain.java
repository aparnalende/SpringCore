package com.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.autowired.model.Driver;
import com.autowired.config.AppConfig;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Driver driver=(Driver) context.getBean("driver");
		System.out.println("Driver Details : "+driver);
	}

}
