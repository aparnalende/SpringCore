package com.injection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareTest implements ApplicationContextAware{
	ApplicationContext context;

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}
	
	public Employee getEmpolyeeBean() {
		 System.out.println("###### Custom class : "+this.context);
		 Employee empObj=(Employee) this.context.getBean("emp");
		 empObj.disp_emp();
		 return empObj;
	 }
	
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name of the bean is: "+name);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context=applicationContext;
	}
}
