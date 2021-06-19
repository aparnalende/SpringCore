package com.tq;

public class Triangle {
	private String type;
//	private int height;
	
	public Triangle(String type) {
		System.out.println("string constructor called");
		this.type=type;
	}
//	public Triangle(int height) {
//		System.out.println("int constructor called");
//		this.height=height;
//	}
//	
//	
//public Triangle(String type, int height) {
//		this.type = type;
//		this.height = height;
//	}
//	public Triangle(int type) {
//		System.out.println("int constructor called");
//		this.type=String.valueOf(type);
//	}
	
public void init() {
	System.out.println("I am created "+this);
	System.out.println("before "+this.type);
	this.type="Two sided";
}

public void myDestroy() {
	System.out.println("I am destroyed "+this);
}
	
	public String getType() {
		return type;
	}

//	public int getHeight() {
//		return height;
//	}
//
//
//	public void setHeight(int height) {
//		this.height = height;
//	}


	public void setType(String type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println(this.type+" draw!!");
	}

public void masterInit() {
	System.out.println("In masterInit");
}
 public void masterDestroy() {
	 System.out.println("In master Destroy ");
 }
}
