package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *	교수의 번호, 이름, 입사일, 부서 코드를 출력하기 
 * 
 */
public class Exam1 {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			Statement stmt = conn.createStatement();	// 연결한 객체를 실행하기위한 객체
			System.out.println("교수번호\t "+"이름\t"+"입사일\t\t"+"부서 코드");
			ResultSet rs = stmt.executeQuery("select * from professor");
//			ResultSet rs = stmt.executeQuery("select no, name, hiredate, deptno from professor"); 	로 써도 됨
			while(rs.next()) {
				System.out.print(rs.getString("no")+"\t");	
				System.out.print(rs.getString("name")+"\t");	
				System.out.print(rs.getString("hiredate")+"\t");	
				System.out.println(rs.getString("deptno"));		
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
