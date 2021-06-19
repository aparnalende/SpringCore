package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.model.Person;

public interface PersonDAO {
	Person getPersonById(Long id);

	List<Person> getAllPerson();

	boolean deletePerson(Person person);

	boolean updatePerson(Person person);

	boolean createPerson(Person person);
}