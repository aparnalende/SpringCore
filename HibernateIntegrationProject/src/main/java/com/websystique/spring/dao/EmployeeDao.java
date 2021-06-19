package main.java.com.websystique.spring.dao;

import java.util.List;

import main.java.com.websystique.spring.model.Employee;

public interface EmployeeDao {

void saveEmployee(main.java.com.websystique.spring.model.Employee employee);
	
	List<Employee> findAllEmployees();
	
	void deleteEmployeeBySsn(String ssn);
	
	Employee findBySsn(String ssn);
	
	void updateEmployee(Employee employee);
}
