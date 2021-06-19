package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController controller=(EmployeeController) context.getBean("employeeController");
		System.out.println(controller.createNewEmployee());

	}

}
