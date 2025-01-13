package section_19_Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import program_210.DB;
import program_210.DbException;

public class Inserção_De_Datas {

	public static void main(String[] args) throws DbException, SQLException {
		
		Date a = new Date();
		Connection conn = DB.getConnection();
		PreparedStatement st = conn.prepareStatement("INSERT INTO timestamps(timestamps) VALUES (?)");
		st.setDate(1, new java.sql.Date(a.getTime()));
		int rowsaffected = st.executeUpdate();
	}
	
}
