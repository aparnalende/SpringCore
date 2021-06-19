package com.demo.MethodInjection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicatioContextAwareTest implements ApplicationContextAware,BeanNameAware {
 ApplicationContext context;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context=applicationContext;
		
	}
	public ApplicationContext getContext() {
		return context;
	}
 public Employee getEmpolyeeBean() {
	 System.out.println("###### Custom class : "+this.context);
	 Employee empObj=(Employee) this.context.getBean("emp");
	 empObj.disp_emp();
	 return empObj;
 }
@Override
public void setBeanName(String name) {
	// TODO Auto-generated method stub
	System.out.println("Name of the bean is: "+name);
	
}
}
