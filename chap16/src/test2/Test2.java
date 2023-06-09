package test2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.DataLine;

public class Test2 {
	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		Reader r;
		r = new FileReader("C:\\Users\\gd4\\Desktop\\product.txt");
		BufferedReader br = new BufferedReader(r);	
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
		String sql = "insert into car(mon, con, car, qty, remark) values(?,?,?,?,?)";
		String data;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		br.lines().forEach(line -> {	// 줄로 읽은 걸,
			String[] str = line.split(",");		// 단어로 나눠서 넣고
			try {
				pstmt.setInt(1, Integer.parseInt(str[0]));		// int형태로 바꿔서 
				pstmt.setInt(2, Integer.parseInt(str[1]));
				pstmt.setString(3,str[2] );
				pstmt.setInt(4, Integer.parseInt(str[3]));
				try {
					pstmt.setString(5, str[4]);
				} catch(ArrayIndexOutOfBoundsException e) {
					pstmt.setString(5, " ");
				}
				// if 문으로 바꿔도 됨
			
				pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		});
		pstmt.close();
		conn.close();
	}
}
