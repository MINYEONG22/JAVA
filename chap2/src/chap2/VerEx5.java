package chap2;

/*
 * 	String 클래스의 연산
 * 	1. 참조자료형. 문자열 객체
 *  2. 클래스 중 유일하게 대입연산자(=)를 이용해서 객체 생성이 가능.
 * 	3. 클래스 중 유일하게 더하기연산자(+) 사용 가능
 * 		ex) String+기본자료형 => String
 * 
 */


public class VerEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc"; 					// "abc" 객체, 대입연산자를 이용한 객체생성
		String str1 = new String("abc");		// 다른 건 이게 기본 객체생성 공식
		
		String str2 = str+100;
		System.out.println(str2);
		
		str2=str+true;							// boolean 타입, boolean 타입도 문자열로 만들어버림
		System.out.println(str2);
		
		str2 = str+1+2+3;
		System.out.println(str2);
		
		str2 = 1+2+3+str;
		System.out.println(str2);
		
		
		// 덧셈이 되는 게 아니라 문자열로 더해짐
		
		
		
		
	}

}
