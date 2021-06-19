package com.demo.jdbctemplate;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class SimpleJdbcDaoImpl extends JdbcDaoSupport {
	
	@Transactional
public int getEmpolyeeCount(){
		
		
		return getJdbcTemplate().queryForObject("select count(*) from employee",null,Integer.class);
}	

}
