package chap2;


/*
 *	변수의 형 변환: 8개의 기본자료형 중 boolean을 제외한 나머지 7가지는 서로 형 변환이 가능하다. 
 *
 *	자바의 자료형
 *	기본자료형:
 *		논리형: boolean
 *		문자형: char(2)
 *		정수형: byte(1), short(2), int(4), long(8)
 *		실수형: float(4), double(8)
 *
 *	참조자료형:
 *		배열(array)
 *		클래스(class)
 *		인터페이스(inteerface)
 *
 *	형변환
 *	1. 기본자료형 중에 논리형(boolean)을 제외한 7개의 자료형은 서로 형변환이 됨
 *	2. 기본자료형과 참조자료형 사이에는 형변환이 안 됨. (Wrapper 클래스는 예외)
 *		- ''과 ""는 바꿔 쓸 수 없음 
 *	3. 형변환 연산자 생략 가능 : 자동 형변환  - 작은 자료형이 큰 자료형으로 이동하려고 할 때 자동 형변환 가능 (작은 > 큰 : 가능)
 *	   형변환 연산자 생략 불가 : 명시적 형변환 - 큰 자료형이 작은 자료형으로 이동하려고 할 때 자동 형변환 불가 (큰 > 작은 : 불가능)
 */

public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1 = 10;
		short s1 = 20;
		int i1 = 30;
		long l1 = 40;
		float f1 = i1;					//형 변환: float <- int
		System.out.println("i1="+i1);	
		System.out.println("f1="+f1);
		
		
		System.out.println("f1 + 0.5 = "+(f1+0.5));
		System.out.println("i1 + 0.5 = "+(i1+0.5));
		System.out.println("(int)(i1 + 0.5) = "+(int)(i1+0.5));		//정수로 나오게, 실수로 안 나오게
																	//정수형으로 바꿔라. 형 변환 연산자
		

	
	
	}

}
