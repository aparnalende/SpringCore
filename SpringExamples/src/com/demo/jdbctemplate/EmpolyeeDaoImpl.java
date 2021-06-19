package com.demo.jdbctemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Component
public class EmpolyeeDaoImpl {

	// @Autowired
	DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
//		this.dataSource = dataSource;
	}

	public int getEmpolyeeCount() {

		return jdbcTemplate.queryForObject("select count(*) from employee", null, Integer.class);

		/*
		 * String sql="select count(*) from employee";
		 * jdbcTemplate.setDataSource(dataSource); int
		 * count=jdbcTemplate.queryForObject(sql,null,Integer.class); return count;
		 */
	}

	public String getEmpolyee(int id) {
		String QUERY = "select name from employee where id=?";

		return jdbcTemplate.queryForObject(QUERY, new Object[] { id }, String.class);

	}

	public Empolyee getEmpolyeeObject(int id) {
		String query = "select * from employee where id=?";
		return jdbcTemplate.queryForObject(query, new Object[] { id }, new EmpolyeeMapper());

	}

	private static final class EmpolyeeMapper implements RowMapper<Empolyee> {

		@Override
		public Empolyee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Empolyee emp = new Empolyee(rs.getInt("id"), rs.getString("name"), rs.getInt("salary"));
			return emp;
		}

	}

	public List<Empolyee> getAllEmpolyeeList() {
		String sql = "select * from employee";
		return jdbcTemplate.query(sql, new EmpolyeeMapper());

	}

	public int insertEmpolyeeObject(Empolyee emp) {
		String query = "insert into employee values(?,?,?) ";
		return jdbcTemplate.update(query, new Object[] { emp.getId(), emp.getName(), emp.getSalary() });

	}

	public void createDepartmentTable() {
		String query = "CREATE TABLE `emp`.`dept` (\r\n" + "  `did` INT NOT NULL,\r\n"
				+ "  `DeptName` VARCHAR(45) NULL,\r\n" + "  PRIMARY KEY (`did`));\r\n" + "";
		jdbcTemplate.execute(query);
		System.out.println("Table created......");

	}

	public void updateEmpolyeeName(int id, String name) {
		String query = "update employee set name=? where id=? ";
		int status = jdbcTemplate.update(query, name, id);
		if (status > 0) {
			System.out.println("record update successfully......");
		} else {
			System.out.println("unable to update record? please try again.....");
		}

	}

	@Transactional
	public void insertEmpolyeeObjectByPrepareStatement(Empolyee emp) {
		String query = "insert into employee values(?,?,?) ";
		boolean status = jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, emp.getId());
				ps.setString(2, emp.getName());
				ps.setInt(3, emp.getSalary());
				return ps.execute();
			}
		});
		System.out.println(status);
		if (status == true)
			System.out.println("unable to insert record........");
		else
			System.out.println("Record insert successfully!!!!");
	}

	public List<Empolyee> getAllEmpolyeeListUsingResultSetExtractor() {
		String sql = "select * from employee";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Empolyee>>() {

			@Override
			public List<Empolyee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Empolyee> empList = new ArrayList<Empolyee>();
				while (rs.next()) {
					Empolyee emp = new Empolyee(rs.getInt("id"), rs.getString("name"), rs.getInt("salary"));
					if (emp.getSalary() > 10000) {
						empList.add(emp);
					}

				}
				return empList;
			}
		});

	}

}
