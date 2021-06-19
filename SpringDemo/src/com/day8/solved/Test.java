package com.day8.solved;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");           
		System.out.println("container started");
		Student ob1=ctx.getBean("student",Student.class);
		System.out.println(ob1);
//		System.out.println("hashcode "+ob1.hashCode());
//		Student ob2=ctx.getBean("s2",Student.class);
//		System.out.println("hashcode "+ob2.hashCode());
		ctx.close();
	}

}
