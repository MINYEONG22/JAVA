package test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Test3 {
	public static void main(String[] args)  {
		try {
			 Class.forName("org.mariadb.jdbc.Driver");
			 Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery("select * from car WHERE car = '그랜저' and con=2");
			 ResultSetMetaData rsmd = rs.getMetaData();
			 for(int i=1; i<rsmd.getColumnCount(); i++) {
				 System.out.print(rsmd.getColumnName(i)+"\t");
			 }
			 System.out.println();
			 while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
}
