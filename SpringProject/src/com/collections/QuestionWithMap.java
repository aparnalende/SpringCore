package com.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class QuestionWithMap {
	private int id;
	private String name;
	// map with string
	/*private Map<String,String> answer;
	public QuestionWithMap(int id, String name, Map<String, String> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	public void display() {
		System.out.println("Question Id: "+id );
		System.out.println("Question name:"+name);
		System.out.println("Answer.....:");
		Set<Entry<String,String>> set=answer.entrySet();
		Iterator<Entry<String, String>> itr=set.iterator();
		while (itr.hasNext()) {
			Entry<String,String> entry=itr.next();
			System.out.println("Answer:"+entry.getKey()+"Posted by:"+ entry.getValue());
			
		}
 	}
	
	*/
	// map with object

	private Map<AnswerWithMap,User> answer;
	public QuestionWithMap(int id, String name, Map<AnswerWithMap,User> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public void display() {
		System.out.println("Question Id: "+id );
		System.out.println("Question name:"+name);
		System.out.println("Answer.....:");
		Set<Entry<AnswerWithMap,User>> set=answer.entrySet();
		Iterator<Entry<AnswerWithMap,User>> itr=set.iterator();
		while (itr.hasNext()) {
			Entry<AnswerWithMap,User> entry=itr.next();
			
			System.out.println("Answer:"+entry.getKey()+"Posted by:"+ entry.getValue());
			
		}
 	}

}
