package com.jdbc;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCMain {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("jdbcbean.xml");
		
		JDBCDaoImpl jdbcDaoImpl=context.getBean(JDBCDaoImpl.class);
//		System.out.println("Circle count is : "+jdbcDaoImpl.getCircleCount());
//		
//		Circle circle=jdbcDaoImpl.getCircleObject(2);
//		System.out.println("Circle id is: "+circle.getId());
//		System.out.println("Circle name is :"+circle.getName());
		
		List<Circle> circleList=jdbcDaoImpl.getCircleObjectList();
		for(int i=0;i<circleList.size();i++) {
			Circle circle=circleList.get(i);
			System.out.println("Circle id is : "+circle.getId());
			System.out.println("Circle name is : "+circle.getName());
		}
//		Circle circle=new Circle(3,"circle3");
//		jdbcDaoImpl.insertCircleObject(circle);
		
//		jdbcDaoImpl.createTriangle();
	}

}
