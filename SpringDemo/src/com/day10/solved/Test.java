package com.day10.solved;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Person p=ctx.getBean("p1",Person.class);
		System.out.println(p);
		p.getV().move();
	}

}
