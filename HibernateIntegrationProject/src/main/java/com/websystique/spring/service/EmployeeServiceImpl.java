package main.java.com.websystique.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.websystique.spring.dao.EmployeeDaoImpl;
import main.java.com.websystique.spring.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDaoImpl dao;

	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}

	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	public void deleteEmployeeBySsn(String ssn) {
		dao.deleteEmployeeBySsn(ssn);
	}

	public Employee findBySsn(String ssn) {
		return dao.findBySsn(ssn);
	}

	public void updateEmployee(Employee employee) {
		dao.updateEmployee(employee);
	}
}
