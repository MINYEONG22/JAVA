package chap11;
/*
 *	switch 구문에서 조건값으로 사용할 수 있는 자료형 
 *	 : byte, short, int, char, String	다섯 개만 가능.
 *	 - long, float, double, StringBuffer, StringBild 다 안 됨
 *
 *	 : Byte, Short, Integer, Character 도 가능 Wrapper class이지만 자동 형변환이 가능해서 
 */
public class WrapperEx3 {
	public static void main(String[] args) {

		int data = 0;
		switch(data) {
			default :System.out.println("switch 테스트");
		}
		
		/*
		 *	java.lang 패키지의 클래스
		 *	Object: 모든 클래스의 최상위 클래스 (부모 클래스)
		 *  String: 문자열. 대입연산자, +연산자 사용가능.
		 *  	  : 정적인 문자열, 변경불가 문자열 
		 *  StringBuffer: 문자열의 보조 클래스. 동적인 문자열.
		 *  			: equals 메서드 오버라이딩 x, ∴ 내용 비교를 위해서는 toString() 이용해야함.
		 *  Math: 수치 계산을 위한 기능. 모든 멤버들은 static 멤버라 객체화가 필요없고, 객체를 만들 수 없다.
		 *  Wrapper: Boolean, Byte, Short, Integer, Long, Character, Float, Double 8개의 클래스 통칭.
		 *  	   : 기본자료형과 자동 형변환 가능 -> auto Boxing이나 auto UnBoxing이 됨
		 *   
		 */
		
		
		
		
		
	}
}
