package com.demo.MethodInjection;

public class Employee {
	private String name;
	private String email;
	public Employee(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public void disp_emp() {
		System.out.println("Empolyee Name: "+ name);
		System.out.println("Empolyee email: "+ email);
	}

}
