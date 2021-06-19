package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpolyeeDaoImpl {

	private static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost/emp";
	private static final String USERNAME="root";
	private static final String PASSWORD="root";
	private static final String QUERY="select * from employee where id=?";
	
	public Empolyee getEmpolyee(int id) {
		Empolyee empolyee=null;
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("connecting to database.........");
			connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Creating statement........");
			
			preparedStatement=connection.prepareStatement(QUERY);
			preparedStatement.setInt(1, id);
			
			resultSet=preparedStatement.executeQuery();
			System.out.println(preparedStatement.toString());
			
			while (resultSet.next()) {
			int id1=resultSet.getInt("id");
			String name=resultSet.getString("name");
			int salary=resultSet.getInt("salary");
			empolyee=new Empolyee(id1, name, salary);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet!=null)
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(preparedStatement!=null)
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(connection!=null)
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Goodbye.........");
		return empolyee;
		
	}
	
}
