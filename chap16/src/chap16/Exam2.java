package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 	메뉴를 선택하세요(1~4):
 *	1. member 테이블 생성하기 : id,pass 두 개의 컬럼		- create()
 *	2. 화면에서 id랑 pass를 입력 받아 member 테이블에 저장하기	- insert()
 *	3. 현재까지 등록 된 내용을 화면에 출력하기 					- select()
 * 	4. member 테이블 제거하기							- drop()
 */
public class Exam2 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		while(true) {
			System.out.println("메뉴를 선택하세요 (종료:9)");
			System.out.println("1: 테이블 생성");
			System.out.println("2: 테이블에 id, pass 내용 등록");
			System.out.println("3: 등록 된 정보 조회");
			System.out.println("4: 테이블 제거");
			
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();
			
			if(menu==9) break;
			// 1. 테이블 생성
			if(menu == 1) {
				try {
					Class.forName("org.mariadb.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
					String sql = "create table member ("
															+ "id varchar(10), "
															+ "passwd varchar(10)"
															+ ")";
					pstmt = conn.prepareStatement(sql);
					System.out.println("♬♬♬♬♬♬♬♬♬ member테이블이 생성되었습니다. ♬♬♬♬♬♬♬♬♬");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			// 2 테이블에 id, pass 내용 등록
			if(menu==2) {
				try {
					int result = pstmt.executeUpdate();
					String sql = "insert into member (id, passwd) values (?,?)";	
					pstmt = conn.prepareStatement(sql);
					System.out.println("id를 입력하세요.");
					String idscan = scan.next();
					pstmt.setString(1, idscan);
					System.out.println("비밀번호를 입력하세요.");
					String passScan = scan.next();
					pstmt.setString(2, passScan);	
					result = pstmt.executeUpdate();	
					System.out.println("★★★★★★★★★★등록 되었습니다.★★★★★★★★★★");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			// 3. 등록된 내용 조회
			if(menu==3) {
				try {
					String sql = "select * from member";
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();	
					while(rs.next()){
						int i =0;
						++i;
						System.out.print(i+"번째 등록 된 아이디, 비밀번호 조회\n▶ id: ");
						System.out.print(rs.getString("id")+"\tpassword: ");
						System.out.println(rs.getString("passwd")+"\t");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(menu==4) {
				try {
					String sql = "DROP TABLE member";
					pstmt = conn.prepareStatement(sql);
					pstmt.executeUpdate();	
					System.out.println("================삭제 되었습니다.================");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
		
	}
}
