package com.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		System.out.println("--------------------------------");
		HelloIndia helloIndia=(HelloIndia) context.getBean("helloIndia");
		System.out.println(helloIndia);
	}

}
