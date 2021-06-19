package com.day8.solved;

public class Address {
	private String city;
	private String state;

	public Address() {
		System.out.println("in default constructor of Address");
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

}