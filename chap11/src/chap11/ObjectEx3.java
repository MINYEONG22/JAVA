package chap11;

import java.util.IdentityHashMap;

/*
 *	Object 클래스: hashcode() 메서드 
 *
 *		hashcode: 원래 의미는 JVM이 객체를 구별하기위한 고유 ID값(참조값)
 *		객체의 논리적 동등성을 위해 오버라이딩이 필요함.
 *	
 *		내용 비교를 위해서 equals 메서드를 오버라이딩 하는 경우
 *		hashcode 메서드도 오버라이딩 하는 것을 권장함. => 논리적 동등성 (Collection 프레임워크 부분에서 다시 설명)
 *
 */
public class ObjectEx3 {
	public static void main(String[] args) {

		String s01 = new String("abc");
		String s02 = new String("abc");
		
		String s1 = "abc";
		String s2 = "abc";

// 		String s1 = new String("abc"); 과 String s1 = "abc"; 는 다르게 만들어짐	
		
		if(s01 == s02) {
			System.out.println("s01과 s02는 같은 객체임");
		} else {
			System.out.println("s01과 s02는 다른 객체임");
		}
		if(s1 == s2) {
			System.out.println("s1과 s2는 같은 객체임");
		} else {
			System.out.println("s1과 s2는 다른 객체임");
		}
	
		if(s01.equals(s2)) {
			System.out.println("s01과 s02는 같은 내용임");
		} else {
			System.out.println("s01과 s02는 다른 내용임");
		}
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같은 내용임");
		} else {
			System.out.println("s1과 s2는 다른 내용임");
		}
		
		System.out.println("s1.hashCode(): " + s1.hashCode());		// 오버라이딩해서 같은 값 나타나게 만들었음
		System.out.println("s2.hashCode(): " + s2.hashCode());
		System.out.println("s1.hashCode() 원래 값: " + System.identityHashCode(s1) );
		System.out.println("s2.hashCode() 원래 값: " + System.identityHashCode(s2) );
	}
}
