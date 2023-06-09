package chap4;

import java.util.Scanner;
/*
 * 	★★★★★
 *	if 조건문 예제 
 * 		in(조건문) {
 * 			조건문의 결과가 참인 경우 실행되는 문장들
 * 		} else {
 * 			조건문의 결과가 거짓인 경우 실행되는 문장들
 * 		}
 * 	- 결과가 true 아니면 false로 나올 수 있는 boolean 타입이어야함. 
 *  - 조건문 안에 들어가는 조건문이 하나인 경우 '중괄호 {}: 블럭' 생략 가능.
 *  	if,else 블럭에서 실행되는 문장이 한 개인 경우, {} 생략 가능.
 * 
 */
public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		if(score >= 60) System.out.println("합격!");
//		else 사용 안 하는 경우, score이 60이랑 같거나 큰 경우만 실행됨. 
		// -> 60점 이하면 출력 안 됨
		if(score >= 60) {
			System.out.println("합격!");
		}
		
		
//		점수별 학점 출력하기
		if(score >= 90) {						// 조건 만족 안 하면	
			System.out.println("A학점");			 
		} else if (score >= 80) {				// 내려가고 만족 안 하면
			System.out.println("B학점");
		} else if (score >= 70) {				// 내려가고, 만족하면 여기서 끝.
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
//		------------------------------------------------------
		
	}

}
