package com.tq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
//	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	System.out.println("container started");
	Student ob1=ctx.getBean("s1",Student.class);
	System.out.println(ob1);
	
	
			
			
			
			
			
			
			
			
			
	
}
}
