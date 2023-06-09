package chap3;

import java.util.Scanner;

/*
 * 화면(키보드)에서 숫자(초)를 입력 받아, 몇 시간 몇 분 몇 초인지 출력하기
 * 
 * 1. Scanner 생성
 * 2. second = scan.nextInt()
 * 3. 시간 second/3600
 * 4. 분 (second&3600)/60
 * 5. 초 second%60
 * 
 * 
 * [결과]
 * 초를 입력하세요.
 * 3662
 * 1시간 1분 2초
 * 
 */

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.out.println("초를 입력하세요");
	Scanner scan = new Scanner(System.in);			//Scanner는 import 해야함
	
	int second = scan.nextInt();		//int 선언을 해야함

	int h = second/3600 ;
	int m = (second%3600)/60;
	int s = second%60;
	
	System.out.println((second/3600)+"시 "+(second%3600)/60+"분 "+(second%60)+"초");
	System.out.println("-----------------------");
	System.out.println(second/3600+"시 "+ (second%3600)/60+"분 "+ second%60 + "초");
	System.out.println("-----------------------");
	System.out.println(h + "시");
	System.out.println(m + "분");
	System.out.println(s + "초");
	
	
	// 연산 괄호 넣어도 안 넣어도 상관없음
	
	
	}

}
