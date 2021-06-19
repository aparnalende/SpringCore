package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleAutoMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		Triangle tri=(Triangle) context.getBean("triAuto");
		tri.draw();

	}

}
