package chap3;

import java.util.Scanner;

/*
 * 
 *	화면에서 3자리 정수를 입력받아 100자리 미만을 버리고 출력하기 
 * 	1. Scanner 객체 생성	
 * 	2. num = scan.nextInt()
 * 	3. 원래 수에서 방법1 num-(num%100),		321-21 = 300
 * 				방법2 (num/100)*100		321/100 => 3*100 = 300
 * 
 * [결과]
 *  세자리 정수를 입력하세요
 *	321 입력했을 때
 *	300
 * 
 */
public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("세자리 정수를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		num = num-(num%100);
	
		System.out.println(num);
		
		
	}

}
