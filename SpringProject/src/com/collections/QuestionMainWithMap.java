package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionMainWithMap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		QuestionWithMap que=(QuestionWithMap) context.getBean("queMapWithObject");
		que.display();
	}

}
