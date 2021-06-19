package com.springjdbc10.solved;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//Lookup method injection
				Car car=ctx.getBean("car",Car.class);
				Engine e1=car.getEngine();
				Engine e2=car.getEngine();
				
				System.out.println(e1.hashCode());
				System.out.println(e2.hashCode());
			

	}

}
