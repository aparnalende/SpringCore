package com.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		Triangle triangle=(Triangle) context.getBean("innertri");
		triangle.draw();
	}

}
