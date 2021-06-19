package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotaion {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		SimpleMovieListener movieObj=context.getBean("simple",SimpleMovieListener.class);
		movieObj.showMovieFinder();

	}
	

}
