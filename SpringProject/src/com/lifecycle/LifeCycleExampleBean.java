package com.lifecycle;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class LifeCycleExampleBean implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean,String beanName) {
		System.out.println("########=>BeforeInitialization:"+beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean,String beanName) {
		System.out.println("########=>AfterInitialization:"+beanName);
		return bean;
	}
}
