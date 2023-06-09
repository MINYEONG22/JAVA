package chap4;

import java.util.Scanner;

/*
 *	콘솔에서 한 개의 문자를 입력 받아, 대문자인지, 소문자인지, 숫자인지, 기타문자인지 출력 
 * 
 *  [결과]
 *  한 개의 문자를 입력하세요.
 *  A 대문자
 *  a 소문자
 *  
 *  
 */
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("한 개의 문자를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		
		char ch = scan.next().charAt(0);	
		// scan.next() : 문자열로 입력
		// charAt(0) : 문자열에서  0번 index (첫번째) 문자 리턴
		// 문자열로 받아서 첫번째 문자를 받아줘
		// => 5Ac 썼을 때		결과:  5는 숫자
		
		
		System.out.println(ch+":");
		
		
		// 대문자인지 소문자인지, 아스키 코드값 
		// ch >= 'A' && ch <= 'Z' : 대문자
		// ch >= 'a' && ch <= 'z' : 소문자
		// ch >= '0' && ch <= '9' : 숫자		// 그냥 숫자 쓰면 안 됨 char 는 ''로
		// 그 외는 기타문자
		
		// 공백은 인식 x
		
		
		if (ch >= 'A' && ch <= 'Z') {
				
			System.out.println("대문자");
			
		} else if (ch >= 'a' && ch <= 'z') {
			
			System.out.println("소문자");
			
		} else if (ch >= '0' && ch <= '9') {
			
			System.out.println("숫자");
			
		} else {
			
			System.out.println("기타문자");
			
		}
		
		
		// 대문자 A의 코드값 출력하기 
		System.out.println("A="+(int)'A');		//65
		System.out.println("Z="+(int)'Z');		//90
		
	}

}
