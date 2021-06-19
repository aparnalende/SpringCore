package com.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbcbean.xml");
		EmployeeDao dao= (EmployeeDao) ctx.getBean("empdao");
		
		int status=dao.saveEmployeeBean(new EmpolyeeBean(102,"Radha",35000));
		
		System.out.println(status);

	}

}
