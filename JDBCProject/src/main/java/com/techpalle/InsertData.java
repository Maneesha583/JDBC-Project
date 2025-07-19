package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjuly25","root","Mani@123");
			PreparedStatement st =con.prepareStatement("insert into student values(?,?,?)");
			st.setInt(1,102);
			st.setString(2, "gosling");
			st.setString(3, "Jdbc");
			
			int noOfRows=st.executeUpdate();	
			System.out.println("No of rows "+noOfRows);
			
			st.close();
			con.close();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
