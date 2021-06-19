package com.demo.MethodInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplicationContext {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
 ApplicatioContextAwareTest	appContext=(ApplicatioContextAwareTest) context.getBean("appContext");
 System.out.println(appContext.getEmpolyeeBean());
 System.out.println(appContext.getEmpolyeeBean());
 System.out.println(appContext.getEmpolyeeBean());
}
}
