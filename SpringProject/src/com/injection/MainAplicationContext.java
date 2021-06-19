package com.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAplicationContext {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		
		ApplicationContextAwareTest appContext=(ApplicationContextAwareTest) context.getBean("appContext");
		System.out.println(appContext.getEmpolyeeBean());
		System.out.println(appContext.getEmpolyeeBean());
		System.out.println(appContext.getEmpolyeeBean());
	}

}
