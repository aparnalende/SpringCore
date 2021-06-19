package com.annotation.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld=ctx.getBean(HelloWorld.class);
		System.out.println(helloWorld);
		helloWorld=ctx.getBean(HelloWorld.class);
		System.out.println(helloWorld);

	}

}
