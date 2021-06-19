package com.tq;

public class Student {
	private int sid;
	private String sname;
	
	
	public Student() {
		System.out.println("In student default constructor");
	}
	
	
	public Student(int sid, String sname) {
		super();
		System.out.println("In student parameterised constructor");
		this.sid = sid;
		this.sname = sname;
		
	}


	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
		System.out.println("setter if sid");
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
		System.out.println("setter if sname");
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	

}
