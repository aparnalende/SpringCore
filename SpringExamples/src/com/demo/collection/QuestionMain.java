package com.demo.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionMain {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	// String value
	/* Question que=(Question) context.getBean("que");
	 que.display();*/
	
	// non string value
	 Question que=(Question) context.getBean("qq");
	 que.display();
	 
}
}
