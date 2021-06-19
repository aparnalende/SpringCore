package com.demo.DependentObjectandInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInheritance {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
	/*HellloWorld	hello=(HellloWorld) context.getBean("helloWorld");
	System.out.println(hello);*/
	System.out.println("------------------------------------------------------");
	
	HelloIndia helloindia=(HelloIndia) context.getBean("helloIndia");
	System.out.println(helloindia);
	}

}
