package com.spring.stereotype;

import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDao{
public EmployeeDTO createNewEmployee() {
	EmployeeDTO e=new EmployeeDTO();
	e.setId(1);
	e.setFirstName("Neeta");
	e.setLastName("Gupta");
	return e;
}
}
