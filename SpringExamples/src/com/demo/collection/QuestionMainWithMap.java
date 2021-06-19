package com.demo.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionMainWithMap {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		// String value
	/* QuestionWithMap que=(QuestionWithMap) context.getBean("queMap");
	 que.display();*/
		
		// non string value
	 
	 QuestionWithMap que=(QuestionWithMap) context.getBean("queMapWithObject");
	 que.display();
		 
	}
}
