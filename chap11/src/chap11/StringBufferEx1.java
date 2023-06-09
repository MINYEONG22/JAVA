package chap11;
/*
 *	StringBuffer / StringBuilder 클래스 : 동적 문자열 
 * 	 - 두 개의 클래스는 같은 메서드를 가지고 있음
 * 	 - equals 메서드가 오버라이딩 되어있지 않음 => 내용 비교가 안 됨. 객체가 같아야해서. 	
 * 	 	└ 내용 비교를 위해서는 문자열로 변경해서 비교해야함.
 * 
 * 	StringBuffer 클래스를 문자열(String)로 변경	// final class
 * 	 - toString()으로 바꾸고 equals
 * 
 * 	쓰레드 - 병렬 환경을 만들 수 있는
 * 	 └  Buffer에는 있고, Builder에는 없는...
 */
public class StringBufferEx1 {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		if(sb1 == sb2) {							
			System.out.println("sb1 == sb2");
		} else {
			System.out.println("sb1 != sb2");		//객체 다름
		}
		
		if(sb1.equals(sb2)) {		// equals: 내용 비교를 위한 메서드
			System.out.println("sb1.equals(sb2)");
		} else {
			System.out.println("!sb1.equals(sb2)");	 // 오버라이딩 되지 않아서 다르게 나옴. toString 해야 내용 비교 가능
		}
		
		if(sb1.toString().equals(sb2.toString())) {		// 내용 비교를 위해 String 타입으로 변관
			System.out.println("sb1.toString().equals(sb2.toString())");	// 내용 같음
		} else {
			System.out.println("!sb1.toString().equals(sb2.toString())");		
		}
		
	}
}
