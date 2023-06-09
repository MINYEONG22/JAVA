package chap14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 *	화면에서 파일명을 입력 받고,
 *	출력을 시작할 시작라인,
 *	출력 라인 수 입력 받아서
 *	시작라인부터, 라인 수까지의 내용을 화면에 출력하기. 
 *  src/chap14/InputStreamEx1.java
 * 
 */
public class Exam3 {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일 명을 입력하세요.");
		String filename = stdin.readLine();		// 키보드로부터 1줄씩 읽을 수 있는 객체로 만들어짐 
		System.out.println("시작 라인:");
		String std = stdin.readLine();
		System.out.println("라인 수:");
		String num = stdin.readLine();
		
		int start = Integer.parseInt(std.trim());	// 정수화 - 출력을 시작할 Line index
		int len = Integer.parseInt(num.trim());		// 출력할 line 수
		
		BufferedReader br = new BufferedReader(new FileReader(filename));
		int line = 0;	// 출력을 시작할 파일 라인 수
		String data = null;		// 파일로부터 한줄씩 읽은 데이터
		int cnt = 0;	// 출력할 라인 수 
		// start: 3, len 5
		while((data=br.readLine()) != null) {
			++line;	
			if(line<start) continue;	
			if(cnt >= len) break;      	
			++cnt;					
			System.out.println(line+": "+data);
		}
		br.close();
		stdin.close();
	}
}
