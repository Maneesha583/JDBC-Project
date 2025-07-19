package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadOneRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjuly25","root","Mani@123");
			
			PreparedStatement st=con.prepareStatement("select *from student where id=?");
			st.setInt(1, 101);
			
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
			System.out.println(rs.getInt(1)+"-"+rs.getString(2)+"-"+rs.getString(3));
			}
			
			con.close();
			st.close();
			rs.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
