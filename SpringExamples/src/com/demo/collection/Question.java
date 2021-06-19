package com.demo.collection;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	// string value
	//private List<String> answer;
/*public Question(int id, String name, List<String> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}*/
	//non string value
	private List<Answer> answer;
	public Question(int id, String name, List<Answer> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public void display() {
		System.out.println(id+"  "+name);
		System.out.println("Answers are: ");
		Iterator<Answer> itr=answer.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
	
}
