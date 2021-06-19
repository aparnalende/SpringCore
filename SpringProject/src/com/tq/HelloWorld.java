package com.tq;

public class HelloWorld implements IWorld {
	private String message;

	public void getMessage() {
		System.out.println("Hello World!!! "+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

public void masterInit() {
	System.out.println("In masterInit Hello world..........");
}
 public void masterDestroy() {
	 System.out.println("In master Destroy hello world.......");
 }
}
