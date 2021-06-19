package com.tq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		//		IWorld obj=(IWorld) context.getBean("helloWorld");
		IWorld obj1=(IWorld) context.getBean("helloWorld");
//		obj1.getMessage();
//		
//		System.out.println(obj);
//		System.out.println(obj1);
		
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.draw();
		System.out.println(triangle);
//		triangle=(Triangle) context.getBean("triangle");
//		triangle.draw();
//		System.out.println(triangle);
		
	}

}
