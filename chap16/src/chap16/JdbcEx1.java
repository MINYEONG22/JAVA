package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *	DBMS에 연결하기
 *	1. 드라이버 설정: Build Path > classpath 설정
 *	2. jdbc 사용
 *		- java.sql 패키지의 import
 *		- 드라이버 선택: Class.forName("클래스명")
 *		- 연결객체 Connection 생성: DriverManager.getConnection(url,user,password)
 *		- 명령전달객체: Statement
 */
public class JdbcEx1 {
	public static void main(String[] args) {
		try {
			// "이름"을 가지고 있는 클래스 파일을 메모리에 로드하기
			Class.forName("org.mariadb.jdbc.Driver");
			// 오라클이었다면
//			Class.forName("oracle.jdbc.driver.oracleDriver");			  ┌ 현재 컴퓨터
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			// └ dbms와 연결된 연결 객체(interface)		
			// "jdbc:mariadb://localhost:3306/gdudb","gdu","1234"		
			// jdbc로 mariadb연결// 로컬 호스트(dbms서버의 ip주소): 포트번호(3306)/gdudb(데이터베이스 이름),"사용자","비밀번호"
			// 포트번호: 1~1000까지는 공동, 1001번부터는 개인 (보안에서 봤던 거...)
			System.out.println("마리아db 연결 완료");
			// 명령전달객체				┌ 객체를 가지고 옴
			Statement stmt = conn.createStatement();
			// sql 명령실행			┌ 객체의 값 반환
			ResultSet rs = stmt.executeQuery("select * from student");
			// └ select 구문의 실행 결과를 저장한 객체
			while(rs.next()) {	// 가지고 올 거 있으면 true, 조회된 레코드를 선택하고 있음
				System.out.print(rs.getString("studno")+"\t");		// 컬럼 이름 or 몇 번째 컬럼으로 불러올 수 있음
				System.out.print(rs.getString(2)+"\t");		// 두번째 컬럼 => 이름
				System.out.print(rs.getString(3)+"\t");		// 세번째 컬럼 => 아이디
				System.out.print(rs.getString(4)+"\t");		// 네번째 컬럼 => 학년
				System.out.println(rs.getString(5));		// 다섯번째 컬럼 주민등록번호 가지고 오고 한줄 띄기
				// jdbc index 1부터 시작. 0없음.
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
