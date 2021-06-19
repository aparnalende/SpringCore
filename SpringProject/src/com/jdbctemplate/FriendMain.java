package com.jdbctemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class FriendMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("friendbean.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");

		jdbcTemplate.execute("DROP TABLE IF EXISTS FRIENDS");

		jdbcTemplate.execute("CREATE TABLE Friends(Id INT, Name VARCHAR(30),Age INT)");
		jdbcTemplate.update("INSERT INTO Friends VALUES(1, 'Paul', 27)");
		jdbcTemplate.update("INSERT INTO Friends VALUES(2, 'Monika', 34)");
		jdbcTemplate.update("INSERT INTO Friends VALUES(3, 'Peter', 20)");
		jdbcTemplate.update("INSERT INTO Friends VALUES(4, 'Lucy', 45)");
		jdbcTemplate.update("INSERT INTO Friends VALUES(5, 'Roman', 57)");

		int id = 1;
		String sql = "SELECT * FROM Friends WHERE Id=?";
		Friend f = (Friend) jdbcTemplate.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper(Friend.class));

		System.out.println(f);

		List<Friend> allFriends = jdbcTemplate.query("SELECT * FROM Friends", new BeanPropertyRowMapper(Friend.class));

		allFriends.stream().forEach(System.out::println);

	}

}
