package com.demo.jdbc;

public class MainEmpolyee {
public static void main(String[] args) {
	Empolyee empObj=new EmpolyeeDaoImpl().getEmpolyee(2);
	System.out.println(empObj);
	System.out.println(empObj.getId());
	System.out.println(empObj.getName());
	System.out.println(empObj.getSalary());
}
}
