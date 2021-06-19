package com.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.model.Person;
import com.spring.jdbc.model.PersonMapper;

public class PersonDAOImpl {
	JdbcTemplate jdbcTemplate;
	private final String find_person = "select * from people where id=?";
	private final String delete_person = "delete from people where id=?";
	private final String update_people = "update people set first_name=?,last_name=?,age=? where id=?";
	private final String get_all = "select * from people";
	private final String insert_records = "insert into people(id, first_name, last_name, age) values(?,?,?,?)";

	@Autowired
	public PersonDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Person getPersonById(Long id) {
		return jdbcTemplate.queryForObject(find_person, new Object[] { id }, new PersonMapper());
	}
	
	public List<Person> getAllPerson(){
		return jdbcTemplate.query(get_all, new PersonMapper());
	}
	
	public boolean updatePerson(Person person) {
		return jdbcTemplate.update(update_people, person.getFirstName(),person.getLastName(),person.getAge(),person.getId())>0;
	}
	
	public boolean createPerson(Person person) {
		return jdbcTemplate.update(insert_records, person.getId(),person.getFirstName(),person.getLastName(),person.getAge())>0;
	}
	public boolean deletePerson(Person person) {
		return jdbcTemplate.update(delete_person, person.getId()) > 0;
	}
}

