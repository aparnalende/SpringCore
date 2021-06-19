package com.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployeeBean(EmpolyeeBean e){ 
		 String query="insert into EmployeeBean values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')"; 
		 return jdbcTemplate.update(query); 
		}

	public int updateEmployeeBean(EmpolyeeBean e){ 
		 String query="update EmployeeBean set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' "; 
		 return jdbcTemplate.update(query); 
		}

	public int deleteEmployeeBean(EmpolyeeBean e) {
		String query = "delete from EmployeeBean where id='" + e.getId() + "' ";
		return jdbcTemplate.update(query);
	}

}
