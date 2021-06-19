package com.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.resource.config.AppConfig;
import com.resource.controller.Application;

public class AppMain {
	 public static void main(String args[]){
	 ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	 Application app=(Application) context.getBean("bean.xml");
	 System.out.println("Application details : "+app);
	 }
}
