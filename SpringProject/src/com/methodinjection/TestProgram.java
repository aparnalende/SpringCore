package com.methodinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				new ClassPathXmlApplicationContext("springbeans.xml");
		//			       SingletonBean singleton = (SingletonBean)context.getBean("singletonBean");             
		//			       PrototypeBean prototypeBeanA = singleton.getPrototypeBean();
		//			       PrototypeBean prototypeBeanB = singleton.getPrototypeBean();             
		//			       System.out.println(prototypeBeanA);
		//			       System.out.println(prototypeBeanB);             
		//			       System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA==prototypeBeanB));
		//			       }
		SingletonBean singleton = (SingletonBean)context.getBean("singletonBean");             
		PrototypeBean prototypeBeanA = singleton.getPrototypeBean();
		PrototypeBean prototypeBeanB = singleton.getPrototypeBean();             
		System.out.println(prototypeBeanA);
		System.out.println(prototypeBeanB);             
		System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA==prototypeBeanB));
	}
}


