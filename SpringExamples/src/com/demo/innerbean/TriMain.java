package com.demo.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriMain {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	 Triangle tri=(Triangle) context.getBean("tri111");
	 tri.draw();
}
}
