package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/*
 *	조회 된 컬럼 명 출력하기 
 *	ResultSetMetaData: 조회 된 결과의 정보
 */
public class JdbcEx2 {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select p.no, p.name, p.hiredate, p.deptno, m.name 전공 " // 1* 별명 지어주면
											 +"from professor p, major m "			// 공백 없으면 한 줄로 읽혀서 공백 넣어줘야함
											 +"where p.deptno = m.code "
											 +"order by deptno ");
			// 									└ select * from professor 으로 넣으면 MetaData 이름에 전부 출력됨.
			// ResultSetMetaData: 조회 된 결과의 정보 (db에 있는 table이랑은 관련이 없음)
			ResultSetMetaData rsmd = rs.getMetaData();
			for(int i=1; i<=rsmd.getColumnCount(); i++) {	// rsmd.getColumnCount() => 조회된 컬럼의 갯수 4
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println();
			while(rs.next()) {	// ResultSet의 .next()를 해야만 결과값을 가지고 올 수 있음
				System.out.print(rs.getInt("no")+"\t");			// 정수값으로 들어가 있어서 getInt로 가지고 와도 됨
				System.out.print(rs.getString("p.name")+"\t");	
				System.out.print(rs.getDate("hiredate")+"\t");	// 날짜 타입으로 저장돼 있어서 getData로 가지고 올 수 있음	
				System.out.print(rs.getInt("deptno")+"\t");	
				System.out.println(rs.getString("전공"));	// 1* 별명으로 넣어야함.
			}
			// 한 건만 가지고 오려고 해도 반목문에서 빼서, rs.next()를 하나는 넣어줘야함.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
