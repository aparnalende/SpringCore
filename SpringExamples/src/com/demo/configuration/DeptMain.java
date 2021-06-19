package com.demo.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptMain {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("annotationBean.xml");
		Department dept=(Department) context.getBean("department");
		//ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		///Department dept= context.getBean(Department.class);
		dept.ShowEmpName();
		System.out.println(context.getMessage("msg1",null,null));
		System.out.println(context.getMessage("msg2",null,"welcome to java apps",null));
		
	
	}
}
