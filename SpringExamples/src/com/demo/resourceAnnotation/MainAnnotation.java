package com.demo.resourceAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {
public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("annotationBean.xml");
	context.registerShutdownHook();
	//SimpleMovieListener movieObj=context.getBean("simple1",SimpleMovieListener.class);
	SimpleMovieListener movieObj=context.getBean("simpleMovieListener",SimpleMovieListener.class);
	movieObj.showMovieFinder();
	
}
}
