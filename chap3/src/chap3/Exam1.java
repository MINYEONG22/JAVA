package chap3;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		
		//++ 연산자를 이용하여 x=10 결과가 나오도록 수정
		System.out.println("1.x="+ x++);			//출력하고 11이 된 뒤
		
		// -- 연산자를 이용하여 x=10 결과가 나오도록 수정
		System.out.println("2.x="+ --x);			//11에서 1을 뺀 뒤 출력
		
		
		
		// 화면에서 숫자를 입력 받아 증감 연산자를 이용하여 같은 값이 나오도록 프로그램 작성하기
		// new Scanner(System.in) : 키보드로부터 데이터를 입력 받기 위한 객체 생성
		// nextInt() : 정수형 값을 입력 받는 함수
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);		//System.in : 키보드
		x= scan.nextInt();
		System.out.println("1.x="+ x++);		
		System.out.println("2.x="+ --x);
		
	}

}
