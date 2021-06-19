package com.springjdbc12;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveStudent(Student s)
	{
		String studquery="insert into Student(sname,email,qualification,exp) values(?,?,?,?);";
		return jdbcTemplate.update(studquery, s.getSname(),s.getEmail(),s.getQualification(),s.getExp());
	}
	
	public int updateStudent(Student s) {
//		String updquery="update Student set sname='"+s.getSname()+"',qualification='"+s.getQualification()+"'where studid="+s.getStudid();
		
		String updquery = "update student set sname=?,qualification=?,email=?,exp=? where studid=?";
		return jdbcTemplate.update(updquery, s.getSname(), s.getQualification(), s.getEmail(), s.getExp(),s.getStudid());
	}
	
	public int deleteStudent(int id) {
		String query = "delete from Student where studid=" + id;
		return jdbcTemplate.update(query);
	}
	
	
	public static class myRowMapper implements RowMapper<Student>{
		public Student mapRow(ResultSet rs,int rowNum) throws SQLException {
			System.out.println("This is rowmapper interface having "+rowNum+" rownumber");
			Student s=new Student();
			s.setStudid(rs.getInt(1));
			s.setSname(rs.getString(2));
			s.setEmail(rs.getString(3));
			s.setQualification(rs.getString(4));
			s.setExp(rs.getInt(5));
			
			return s;
		}
	}
	
	public List<Student> getAllStudent(){
		List<Student> slist=jdbcTemplate.query("select * from Student",new myRowMapper() );
		return slist;
	}
	
	public Map<String, List<String>> getAllStudentsByQualification() {
		Map<String, List<String>> map = jdbcTemplate.query("Select * from student", new StudentMapExtractor());
		return map;
	}
	
	private static final class StudentMapExtractor implements ResultSetExtractor<Map<String,List<String>>>{
		public Map<String,List<String>> extractData(ResultSet rs) throws SQLException{
			System.out.println("in resultSet extractor");
			Map<String,List<String>> smap=new HashMap<>();
			while(rs.next()) {
				String qual=rs.getString("qualification");
				String sname=rs.getString("sname");
				List<String> slist=smap.get(qual);
				if(slist==null) {
					slist=new ArrayList<>();
					slist.add(sname);
					smap.put(qual, slist);
				}
				else {
					slist.add(sname);
				}
			}
			return smap;
		}
	}
}
