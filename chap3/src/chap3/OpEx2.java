package chap3;


/*
 *	단항연산자 : 논리부정(!)
*	부호연산자: +. -
*		+ : 현재 값의 부호를 유지.
*		- : 현재 값의 부호를 변경.
*			ex) 현재 값: 양수 > 음수
*				현재 값: 음수 > 양수
* 
 */


public class OpEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("true="+ !false);			// true는 false가 아니다
		System.out.println("false="+ !true);			// false는 true가 아니다
		System.out.println("5 != 4 : " + (5 != 4));		// 5와 4는 같지 않다 true
		System.out.println("5 == 4 : " + (5 == 4));		// 5는 4와 같다 false
	
		
		
		// 부호연산자
		System.out.println("\n부호 연산자");
		
		int x = -10;
		System.out.println("x= -10");
		System.out.println("+x= " + +x);		//-10	원래 -10이니까 그대로 유지 + , 보통 + 는 생략, 기본값.
		System.out.println("-x= " + -x);		//10	- + - = +
	
		System.out.println("-----------------");
		x = 10;
		System.out.println("x= 10");
		System.out.println("+x= " + +x);		//10
		System.out.println("-x= " + -x);		//-10
		
	}

}
