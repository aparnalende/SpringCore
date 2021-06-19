package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCDaoImpl {

	DataSource dataSource;

	private JdbcTemplate jdbcTemplate = new JdbcTemplate();

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.dataSource = dataSource;
	}

	public int getCircleCount() throws ClassNotFoundException {

		System.out.println("Creating statement...");
		String sql = "SELECT COUNT(*) FROM CIRCLE";
		jdbcTemplate.setDataSource(dataSource);
		int count = jdbcTemplate.queryForObject(sql, null, Integer.class);
		return count;
	}

	public String getCircleName(int circleId) {
		String sql = "SELECT NAME FROM CIRCLE WHERE ID=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { circleId }, String.class);
	}

	public Circle getCircleObject(int circleId) {
		String sql = "SELECT * FROM CIRCLE WHERE ID=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { circleId }, new CircleMapper());

	}

	public List<Circle> getCircleObjectList() {
		String sql = "SELECT * FROM CIRCLE";
		return jdbcTemplate.query(sql, new CircleMapper());
	}

	public void insertCircleObject(Circle circle) {
		String sql = "INSERT INTO CIRCLE (ID,NAME) VALUES(?,?)";
		jdbcTemplate.update(sql, new Object[] { circle.getId(), circle.getName() });
	}

	public void createTriangle() {
		String sql="create table triangle(id int primary key,name varchar(50));";
		jdbcTemplate.execute(sql);
	}
	private static final class CircleMapper implements RowMapper<Circle> {
		public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
			Circle circle = new Circle(rs.getInt("id"), rs.getString("name"));
			return circle;
		}
	}
}
