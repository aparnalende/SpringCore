package com.demo.DependentObjectandInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriMain {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
	 Triangle tri=(Triangle) context.getBean("tri");
	 tri.draw();
}
}
