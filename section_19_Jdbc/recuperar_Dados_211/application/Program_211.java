package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import program_210.DB;
import program_210.DbException;

public class Program_211 {

	public static void main(String[] args)   {
		
		try {
			Connection conn = DB.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM seller");
			
			while (rs.next()) {
				System.out.println(rs.getString("Name") + " " + rs.getInt("Id"));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DbException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
