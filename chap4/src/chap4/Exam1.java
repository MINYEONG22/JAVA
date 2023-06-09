package chap4;

import java.util.Scanner;

/*
 * 
 *	숫자를 입력 받아,
 *	1. 양수인지, 음수인지, 영인지 출력
 *
 * 	2. 짝수인지, 홀수인지 출력
 * 
 * 
 */
public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("숫자를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
//		양수, 음수
		
		if (num > 0) {
			
			System.out.println("양수입니다.");
			 
		} else if (num < 0) {
			
			System.out.println("음수입니다.");
			
		} else {			// else if로 끝내도 상관은 없음 
			
			System.out.println("영입니다.");
			
		}
		
		System.out.println((num>0)?"양수":(num<0)?"음수":"영");
		
		
//	 	홀수, 짝수
		
		if ( num%2 == 0 ) {				//홀수: if (num%2 !=0)
			
			System.out.println("짝수입니다.");
			
		} else {
			
			System.out.println("홀수입니다.");
			
		}
		
		System.out.println((num%2==0)?"짝":"홀");
		

		
		
//		----------------------------------------------------
	}

}
