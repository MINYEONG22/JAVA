package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 	메뉴를 선택하세요(1~4):
 *	1. member 테이블 생성하기 : id,pass 두 개의 컬럼		- create()
 *	2. 화면에서 id랑 pass를 입력 받아 member 테이블에 저장하기	- insert()
 *	3. 현재까지 등록 된 내용을 화면에 출력하기 					- select()
 * 	4. member 테이블 제거하기							- drop()
 */
public class Exam2_1 {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		while(true) {
			System.out.println("메뉴를 선택하세요 (종료:9)");
			System.out.println("1: 테이블 생성");
			System.out.println("2: 테이블에 id, pass 내용 등록");
			System.out.println("3: 등록 된 정보 조회");
			System.out.println("4: id를 입력 받아 레코드 삭제하기");
			System.out.println("5: 테이블 제거");
			
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();
			
			if(menu==9) break;
			switch(menu) {
				case 1 : create(); break;
				case 2 : insert(); break;
				case 3 : select(); break;
				case 4 : delete(); break;
				case 5 : drop(); break;
			}
		};
	}
	private static void delete() throws Exception {
		System.out.println("삭제 할 아이디를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String idscan = scan.next();
		
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement("delete from member where id=? ");
		pstmt.setString(1, idscan);
		System.out.println("삭제 레코드 건수: "+ pstmt.executeUpdate());
		pstmt.close();
		conn.close();
	}
	private static void drop() throws Exception {

		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("DROP TABLE member");
		stmt.close();
		conn.close();
		System.out.println("================삭제 되었습니다.================");
	}
	private static void select() throws Exception {
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		String sql = "select * from member";		// 파라미터 값
//		pstmt = conn.prepareStatement(sql);
//		ResultSet rs = null;
//		rs = pstmt.executeQuery();	
		
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();		// 파라미터 값 받지 않음
		ResultSet rs = stmt.executeQuery("select * from member");
		while(rs.next()){
			System.out.print("▶등록 된 아이디, 비밀번호 조회◀\n id: ");
			System.out.print(rs.getString("id")+"\tpassword: ");
			System.out.println(rs.getString("passwd")+"\t");
		}
	}
	private static void insert() throws Exception{
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into member (id, passwd) values (?,?)";	
		pstmt = conn.prepareStatement(sql);
		
		System.out.println("id를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String idscan = scan.next();
		pstmt.setString(1, idscan);
		System.out.println("비밀번호를 입력하세요.");
		String passScan = scan.next();
		pstmt.setString(2, passScan);	
		pstmt.executeUpdate();	
		System.out.println("★★★★★★★★★★등록 되었습니다.★★★★★★★★★★");

	}
	private static void create() throws SQLException{
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("create table member ("
				+ "id varchar(10), "
				+ "passwd varchar(10)"
				+ ")");
		stmt.close();
		conn.close();
		System.out.println("♬♬♬♬♬♬♬♬♬ member테이블이 생성되었습니다. ♬♬♬♬♬♬♬♬♬");
	}
	private static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
