package com.spring.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.config.AppConfig;
import com.spring.jdbc.dao.PersonDAO;
import com.spring.jdbc.model.Person;

public class Main {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonDAO personDAO = context.getBean(PersonDAO.class);

		System.out.println("\nList of Person is :");
		for (Person p : personDAO.getAllPerson()) {
			System.out.println(p);
		}

		System.out.println("\nGet person with ID :2");
		Person personById = personDAO.getPersonById(2L);
		System.out.println(personById);

		System.out.println("\nCreating person : ");
		Person person = new Person(4L, 40, "Siya", "Sharma");
		System.out.println(person);

		personDAO.createPerson(person);
		System.out.println("\n List of person is: ");
		for (Person p : personDAO.getAllPerson()) {
			System.out.println(p);
		}

		System.out.println("\nDeleteing person with id=2");
		personDAO.deletePerson(personById);
		
		System.out.println("\nUpdate person with id=3");
		Person pr = personDAO.getPersonById(3L);
		pr.setLastName("Yadav");
		personDAO.updatePerson(pr);
		System.out.println("\nList of person is:");
		for (Person p : personDAO.getAllPerson()) {
			System.out.println(p);
		}

		context.close();
	}
}
