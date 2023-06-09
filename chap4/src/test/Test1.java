package test;

import java.util.Scanner;

/*
 * 
 *	1. 화면에서 한 개의 문자를 입력받아 
 * 		
 * 	대문자인 경우는 소문자로,
 * 	소문자인 경우는 대문자로,
 * 	숫자인 경우는 20을 더한 값을 출력	-- 코드값... 아스키값
 * 	그 외의 문자는 기타 문자를 출력
 * 
 *  소문자 = 대문자 +32
 *  대문자 = 소문자 -32
 *  
 *  '0' : 48
 *  '1' : 49 => 21
 *  ('1'-'0') + 20 = 21
 *  ('5'-'0') + 20 = 25
 *
 *
 *	
 *
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("한 개의 문자를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		
		char ch = scan.next().charAt(0);	
	
		
		System.out.println(ch+":");
		
		
		// 대문자인지 소문자인지, 아스키 코드값 
		// ch >= 'A' && ch <= 'Z' : 대문자
		// ch >= 'a' && ch <= 'z' : 소문자
		// ch >= '0' && ch <= '9' : 숫자		// 그냥 숫자 쓰면 안 됨 char 는 ''로
		// 그 외는 기타문자
		
		// 공백은 인식 x
		
		
	
		
		if (ch >= 'A' && ch <= 'Z') {
			
				System.out.println((char)(ch+32));		//ch에 + 해주고, 형변환 해줘야함 (char)
			
		} else if (ch >= 'a' && ch <= 'z') {
			
				System.out.println((char)(ch-32));
			
		} else if (ch >= '0' && ch <= '9') {
			
				System.out.println((ch-'0')+20);		// char에 + 하면 아스키에 하는 거라,
														// 아스키 코드값 0을 빼줘야 숫자의 값이 됨.
														// '1'-'0' = 49 - 48 = 1
														// '3'-'0' = 51 - 48 = 3
			
		} else {
			
			System.out.println("기타문자");
			
		}
		
	}

}
