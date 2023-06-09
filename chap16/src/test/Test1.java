package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 문제 :
 * 1. dept 테이블을 복사하여 deptcopy 테이블을 생성
 * 2. deptcopy 테이블에 
 *   deptno :9001  dname:특판1팀 loc : '서울지사' 추가
 *   deptno :9002  dname:특판2팀 loc : '서울지사' 추가
 * 3. dcode 9002인 부서코드의 loc 컬럼의 값을 울산지사 변경
 * 4. 각각의 스텝에 모든 레코드를 조회하는 기능 추가    
 */
public class Test1 {
	public static void main(String[] args) throws Throwable {
		ResultSet rs = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			// dept 테이블 복사하기 -> deptcopy 테이블 생성
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE deptcopy (SELECT * FROM dept)";
//			String sql = "CREATE TABLE deptcopy as SELECT * FROM dept";		같음.
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			System.out.println("create table deptcopy(변경된 수):"+result); //5개 복사해왔으니까
			// 조회하기
			System.out.println("복사 된 deptcopy본");
			sql = "select * from deptcopy";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();	
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getString(3));
			}
			//deptcopy 테이블에 추가
			stmt = conn.createStatement();
			sql = "insert into deptcopy (deptno, dname, loc) values ('9001','특판1팀','서울지사')";
			pstmt = conn.prepareStatement(sql);		//파라미터로 바꿔줌				
			pstmt.executeUpdate();	
			sql = "insert into deptcopy (deptno, dname, loc) values ('9002','특판2팀','서울지사')";
			pstmt = conn.prepareStatement(sql);		//파라미터로 바꿔줌				
			pstmt.executeUpdate();	
			pstmt.close();
			
			// 조회하기
			System.out.println("테이블에 데이터 추가 된 deptcopy");
			sql = "select * from deptcopy";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();	
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getString(3));
			}
			
			
			// 서울지사 => 울산지사로 변경하기
			sql = "update deptcopy set loc=? where deptno =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "울산지사");
			pstmt.setInt(2, 9001);
			pstmt.executeUpdate();
			sql = "update deptcopy set loc=? where deptno =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "울산지사");
			pstmt.setString(2, "9002");
			pstmt.executeUpdate();
			// 조회하기
			System.out.println("서울지사 -> 울산지사 변경");
			sql = "select * from deptcopy";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();	
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getString(3));
			}
			// 삭제하기
			pstmt = conn.prepareStatement("drop table deptcopy");
			pstmt.executeUpdate();
			conn.close();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
