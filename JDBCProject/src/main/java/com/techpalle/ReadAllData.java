package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadAllData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjuly25","root","Mani@123");
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select *from student");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println("********************************");
			}
			
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
