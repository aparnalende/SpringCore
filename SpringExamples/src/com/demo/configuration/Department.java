package com.demo.configuration;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Department {
	/*@Autowired
	@Qualifier("e1")
	private Employee empName;
	*/
	
/*@Resource(name="employeeSecond")
	private Employee empName;*/
	
	private Employee empName;
	
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private void empCreate(@Qualifier("e2") Employee empObj) {
		if(empObj==null) {
			System.out.println("In emp create method employee object is null !!!!");
		}else {
			System.out.println("In emp create method: employee bean message: "+empObj.getName());
		}
		this.empName=empObj;
	}



	public MessageSource getMessageSource() {
		return messageSource;
	}



	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}



	public void ShowEmpName() {
		if(this.empName==null) {
			System.out.println("Employee object is null !!!!!!");
		}else {
			System.out.println("Emp_Name :"+this.empName.getName());
			System.out.println(this.messageSource.getMessage("msg1",null,null));
			System.out.println(this.messageSource.getMessage("msg3", new Object[] {this.empName.getName(),"jay"},null));
			System.out.println(this.messageSource.getMessage("msg3", new Object[] {this.empName.getName(),"jay"},"have a nice day!!!!",null));
		}
	}
	
	

}
