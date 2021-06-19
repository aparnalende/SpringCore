package com.demo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("annotationBean.xml");
	SimpleMovieListener movieObj=context.getBean("simple",SimpleMovieListener.class);
	movieObj.showMovieFinder();
	
}
}
