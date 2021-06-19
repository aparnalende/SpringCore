package com.annotation.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("springbeans.xml");

		Employee emp = ac.getBean("myemployee", Employee.class);
		System.out.println(emp.toString());
	}
}
