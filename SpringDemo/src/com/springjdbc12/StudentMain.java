package com.springjdbc12;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		StudentDao dao = ctx.getBean("sdao", StudentDao.class);
//		int status = dao.saveStudent(new Student("aparna","aparna@gmail.com","MCS",5));
//		System.out.println("Records inserted"+status);

//		int updatestatus = dao.updateStudent(new Student(1,"siya","siya@gmail.com","MCA",5));
//		System.out.println("record update successfully ... "+updatestatus);

//		int deleterow = dao.deleteStudent(25);
//		if (deleterow > 0) {
//			System.out.println("Records deleted " + deleterow);
//		} else {
//			System.out.println("Record is not present..");
//		}

//		List<Student> lst=dao.getAllStudent();
//		for(Student s:lst) {
//			System.out.println(s);
//		}
		
		
		Map<String,List<String>> map=dao.getAllStudentsByQualification();
		for(String key:map.keySet()) {
			System.out.println(key+"\t"+map.get(key));
		}
		
		ctx.close();
	}

}
