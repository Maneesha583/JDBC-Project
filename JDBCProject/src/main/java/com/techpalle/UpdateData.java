package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjuly25","root","Mani@123");
			
			PreparedStatement st=con.prepareStatement("update student set course=? where id=?");
			st.setString(1, "Hibernate");
			st.setInt(2, 102);
			
			int rowsUpdate=st.executeUpdate();
			System.out.println("no of rows:"+rowsUpdate);
			
		
			con.close();
			st.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
