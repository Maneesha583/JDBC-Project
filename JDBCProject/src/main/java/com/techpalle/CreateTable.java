package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 1:load driver
				try {
					//step 1:load driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					//step 2:Establish connection
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjuly25", "root", "Mani@123");
					
					//step 3:prepare statement
					Statement st=con.createStatement();
					
					//step 4:Execute query
					st.executeUpdate("create table Student(id int primary key,name varchar(20),course varchar(10))");
					
					//step 5:close connection
					con.close();
					st.close();
					System.out.println("Table is created Successfully,check in database");
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
