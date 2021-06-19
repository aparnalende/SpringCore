package com.spring.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager {
	@Autowired
	EmployeeDao dao;
    
    public EmployeeDTO createNewEmployee()
    {
        return dao.createNewEmployee();
    }
}
