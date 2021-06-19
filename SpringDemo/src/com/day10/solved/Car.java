package com.day10.solved;

public class Car implements Vehicle {

	public Car()
	{
		System.out.println("in car constructor");
	}
	@Override
	public void move() {
		System.out.println("Driving car");
		
	}

}
