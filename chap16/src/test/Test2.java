package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
[결과]  
sql 문장을 입력하세요
select deptno, dname, loc from dept 를 입력했을 때
select * from dept
조회된 컬럼 수:3
deptno	dname	loc	
10	대표이사	서울	
20	기획부	서울	
30	기술부	서울	
40	영업부	서울	
50	운용팀	울산	
 */
public class Test2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
		System.out.println("sql 문장을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();		// 한 줄 읽기
		// 연결
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(str);

		//조회된 컬럼
		ResultSetMetaData rsmd = rs.getMetaData();
		int num=1;
		for(num=1; num<=rsmd.getColumnCount(); num++) {	
			System.out.print(rsmd.getColumnName(num)+"\t");
		}
		// for문이 닫힐 때 길이가 3인데,  4 되고 조건이 안 맞아서 num이 4가 된 뒤에 for문을 나옴. 
		
		System.out.print("=> 조회 된 컬럼 수: "+ --num);		// 여기서 하나 빼주고 출력한 다음에 조회
		System.out.println();
		
		// 조회하기
		while(rs.next()) {
			for(int i=1; i<=num; i++) {
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
		}
	}
}
