package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		System.out.println("--------------------------------");
		((AbstractApplicationContext) context).registerShutdownHook();
		Question q1=(Question) context.getBean("q");
		q1.displayInfo();
	}

}
