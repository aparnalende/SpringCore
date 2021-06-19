package com.demo.jdbctemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmpolyee {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("jdbcBean.xml");
	EmpolyeeDaoImpl empDaoImpl=context.getBean(EmpolyeeDaoImpl.class);
/*	Empolyee empObj=empDaoImpl.getEmpolyee(3);
	System.out.println(empObj);
	System.out.println(empObj.getId());
	System.out.println(empObj.getName());
	System.out.println(empObj.getSalary());*/
		
	//System.out.println("Empolyee count is :"+empDaoImpl.getEmpolyeeCount());
	//System.out.println("Emp_Name :"+ empDaoImpl.getEmpolyee(2));
	
	// rowMapper
	/*Empolyee emp=empDaoImpl.getEmpolyeeObject(2);
	System.out.println(emp);*/
	
	//Fetch all record with rowMapper
	List<Empolyee> empList=empDaoImpl.getAllEmpolyeeList();
	for (int i = 0; i < empList.size(); i++) {
		Empolyee e=empList.get(i);
		System.out.println(e);
		System.out.println("\n-----------------------------------------\n");
	}
	
	
	// insert record
//	Empolyee emp1=new Empolyee(4, "Yash", 150000);
//	int status=empDaoImpl.insertEmpolyeeObject(emp1);
//	if(status>0) {
//		System.out.println("Record insert successfully........");
//	}else {
//		System.out.println("Unable to insert record.....");
//	}
	
	// create table
//	empDaoImpl.createDepartmentTable();
	
	// update record
//	empDaoImpl.updateEmpolyeeName(4,"Amar");
	
	// insert record using prepareStatement
//	Empolyee emp1=new Empolyee(9, "shree", 150000);
//	empDaoImpl.insertEmpolyeeObjectByPrepareStatement(emp1);
	
	// ResultSetExtractor
	
//	List<Empolyee> empList=empDaoImpl.getAllEmpolyeeListUsingResultSetExtractor();
//	for (int i = 0; i < empList.size(); i++) {
//		Empolyee e=empList.get(i);
//		System.out.println(e);
//		System.out.println("\n-----------------------------------------\n");
//	}
	
	// using jdbcDaoSupport
//	SimpleJdbcDaoImpl simpleObject=context.getBean(SimpleJdbcDaoImpl.class);
//	System.out.println("Empolyee count= "+simpleObject.getEmpolyeeCount());
}
}
