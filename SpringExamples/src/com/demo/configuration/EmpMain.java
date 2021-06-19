package com.demo.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("annotationBean.xml");
	//ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
	Employee emp=context.getBean(Employee.class);
	Employee emp1=context.getBean(Employee.class);
	emp.show();
	System.out.println(emp);
	System.out.println(emp1);
}
}
