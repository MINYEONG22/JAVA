package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test1 {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			String sql = "create table car ( "
											+ "mon INT(2), "
											+ "con INT(5), "
											+ "car VARCHAR(10), "
											+ "qty INT(5), "
											+ "remark VARCHAR(10) "
											+ ")";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			pstmt.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
