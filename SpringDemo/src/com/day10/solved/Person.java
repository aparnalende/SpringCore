package com.day10.solved;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	String name;
	String email;

	Vehicle v;
	Car c;

	public Person() {
		System.out.println("in person default constructor");
	}
	@Autowired
	public Person(String name, String email, Vehicle v, Car c) {
		super();
		this.name = name;
		this.email = email;
		this.v = v;
		this.c = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	public Car getC() {
		return c;
	}

	public void setC(Car c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", v=" + v + ", c=" + c + "]";
	}

}
