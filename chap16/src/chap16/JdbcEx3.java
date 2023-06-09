package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *	PreparedStatement
 *	int 	  executeUpdate(sql) : insert, update, delete, create ... 
 *									- 변경 된 레코드의 건수를 정수로 리턴
 *	ResultSet executQuery(sql)	 : select 구문을 실행할 때 사용 (데이터 조회)
 * 
 *  Statement의 하위 인터페이스 중에 PreparedStatement,	똑같은데 문장이 넘어가지 않음
 *  int 	  executeUpdate() : insert, update, delete, create ... 
 *									- 변경 된 레코드의 건수를 정수로 리턴
 *	ResultSet executQuery()	 : select 구문을 실행할 때 사용 (데이터 조회)
 */
public class JdbcEx3 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			String sql = "create table jdbctemp ("
												+ "id varchar(10), "
												+ "passwd varchar(10)"
												+ ")";
			pstmt = conn.prepareStatement(sql);		// 실행해라
			int result = pstmt.executeUpdate();		// 업데이트(레코드 변경의)의 결과값 0 => 테이블만 생성해서 레코드의 변경이 없어서 0 
			System.out.println("결과: "+result);
			pstmt.close();	// 취소해라, 끝내라 create 문장 실행 끝
			
			sql = "insert into jdbctemp (id, passwd) values ('toy','1111')";	// id, 비밀번호 값 넣어라
			pstmt = conn.prepareStatement(sql);		//파라미터로 바꿔줌				// sql 전달 받아서
			result = pstmt.executeUpdate();	
			System.out.println("결과: "+result);		// 결과 1
			pstmt.close();	// insert 문장 실행 끝
			
			sql = "insert into jdbctemp (id, passwd) values (?,?)";			// prepareStatement만 (?,?)가능
			pstmt = conn.prepareStatement(sql);		//파라미터로 바꿔줌			
			pstmt.setString(1, "kim");				// id		- 첫번째 물음표
			pstmt.setString(2, "2222");				// 비밀번호	- 두번째 물음표
			result = pstmt.executeUpdate();									// 업데이트 실행해라
			System.out.println("결과: "+result);		
			
			pstmt.setString(1, "lee");				// id
			pstmt.setString(2, "3333");				// 비밀번호
			result = pstmt.executeUpdate();									// 업데이트 실행해라
			System.out.println("결과: "+result);									
			pstmt.close();													// insert 실행 끝
			
			sql = "select * from jdbctemp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();										// 실행되는 문장이 select니까, executeQuery()
																			// 리턴값이 resultSet이 나와야해서.
			while(rs.next()){
				System.out.print(rs.getString("id")+"\t");
				System.out.println(rs.getString("passwd")+"\t");
			}
			System.out.println("update: lee의 비밀번호를 1234로 변경하기");
			sql = "update jdbctemp "			// 업데이트 테이블명
					+ "set passwd =? "			// set 페스워드 값 ?
					+ "where id=? ";			// id 값 ?
			pstmt = conn.prepareStatement(sql);	// 연결 값을 prepareStatement로 (sql)에전달
			System.out.println("결과: "+result);	
			pstmt.setString(1, "1234");
			pstmt.setString(2, "lee");
			pstmt.executeUpdate();
			
			// 조회하기
			sql = "select * from jdbctemp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();										// 실행되는 문장이 select니까, executeQuery()
																			// 리턴값이 resultSet이 나와야해서.
			while(rs.next()){
				System.out.print(rs.getString("id")+"\t");
				System.out.println(rs.getString("passwd")+"\t");
			}
			
			// 레코드 삭제
			System.out.println("delete 명령어 실행");
			System.out.println("아이디가 lee 인 레코드 제거하기");
			sql = "delete from jdbctemp where id=? ";			// id 값 ?
			pstmt = conn.prepareStatement(sql);	// 연결 값을 prepareStatement로 (sql)에전달
			pstmt.setString(1, "lee");
			pstmt.executeUpdate();
			System.out.println("결과: "+result);	
			pstmt.close();
			
			// 삭제 됐는지 조회
			sql = "select * from jdbctemp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();										// 실행되는 문장이 select니까, executeQuery()
																			// 리턴값이 resultSet이 나와야해서.
			while(rs.next()){
				System.out.print(rs.getString("id")+"\t");
				System.out.println(rs.getString("passwd")+"\t");
			}
			
			// 테이블 지우기
			sql = "drop table jdbctemp";										// 지워라. 변경이 아니니까 결과값 0
			pstmt = conn.prepareStatement(sql);									// sql 전달 받아서
			result = pstmt.executeUpdate();										// 업데이트 실행
			System.out.println("결과: "+result);									// 결과 0
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
