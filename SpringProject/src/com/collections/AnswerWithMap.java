package com.collections;

import java.sql.Date;

public class AnswerWithMap {
	private int id;
	private String name;
	private Date postedDate;
	public AnswerWithMap(int id, String name, Date postedDate) {
		super();
		this.id = id;
		this.name = name;
		this.postedDate = postedDate;
	}
	@Override
	public String toString() {
		return " id:" + id + ", Answer:" + name + ", postedDate:" + postedDate;
	}
	

}
