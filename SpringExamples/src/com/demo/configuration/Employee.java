package com.demo.configuration;

public class Employee {
 private String name;

public Employee(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void show() {
	System.out.println("Emp_Name: "+this.name);
}
 
}
