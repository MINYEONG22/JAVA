package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1_A {
	public static void main(String[] args) throws SQLException {
		Connection conn = getConnection();
		String sql = "create table deptcopy as select * from dept";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int result = pstmt.executeUpdate();
		pstmt.close();
		System.out.println(sql + "======");
		select(conn);
		sql = "insert into deptcopy (deptno,dname,loc) values(?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 9001);
		pstmt.setString(2, "특판1팀");
		pstmt.setString(3, "서울지사");
		pstmt.executeUpdate();
		pstmt.setInt(1, 9002);
		pstmt.setString(2, "특판2팀");
		pstmt.setString(3, "서울지사");
		pstmt.executeUpdate();
		System.out.println(sql + "======");
		select(conn);
		pstmt.close();
		sql = "update deptcopy set loc=? where deptno=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "울산지사");
		pstmt.setInt(2, 9002);
		pstmt.executeUpdate();
		System.out.println(sql + "======");
		select(conn);
		pstmt.close();
	}
	private static void select(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from deptcopy");
		while(rs.next()) {
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getString(3));
		}
		
	}
	private static Connection getConnection() {
		Connection conn = null;
		try {
		   Class.forName("org.mariadb.jdbc.Driver");
		   conn = DriverManager.getConnection
			  ("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
		   return conn;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
