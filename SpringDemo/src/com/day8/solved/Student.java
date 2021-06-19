package com.day8.solved;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s1")
@Scope("prototype")
public class Student {
	private int sid;
	private String sname;
	@Autowired
	private Batch batch;
	@Autowired
	private Address addr;

	public Student(int sid, String sname, Batch batch, Address addr) {
		super();
		System.out.println("in parameterised constructor");
		this.sid = sid;
		this.sname = sname;
		this.batch = batch;
		this.addr = addr;
	}

	@PostConstruct
	public void myinit()
	{
		System.out.println("in Student init method");
	}

    @PreDestroy
	public void mydestroy()
	{
		System.out.println("in Student destroy method");
		
	}
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		System.out.println("in setter");
		this.addr = addr;
	}

	public Student() {
		System.out.println("in default");
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public Student(int sid, String sname, Batch batch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", batch=" + batch + ", addr=" + addr + "]";
	}
	
	

}
