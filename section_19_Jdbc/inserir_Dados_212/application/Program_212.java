package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import program_210.DB;
import program_210.DbException;

public class Program_212 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Connection conn = DB.getConnection();
			PreparedStatement st = conn.prepareStatement("INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) " + "VALUES " + "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "Carl Purble");
			st.setString(2, "carl@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 3);

			int rowsaffected = st.executeUpdate();

			if (rowsaffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! id = " + id);
				}

			} else {
				System.out.println("No rown affected!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DbException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
