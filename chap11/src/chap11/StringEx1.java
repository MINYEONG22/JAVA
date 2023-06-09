package chap11;
/*
 *	String 클래스: 정적인 문자열(변경 불가 객체)
 * 
 */
public class StringEx1 {
	public static void main(String[] args) {

		String s1 = "abc";							// abc 객체 만들고
		String s2 = "abc";							// 같은 객체를 참조함 => 같은 객체로 나옴 
		
		if(s1 == s2) {
			System.out.println("s1==s2");			// 같은 객체임
		} else {
			System.out.println("s1!=s2");
		}
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2)");	// 내용 같음
		} else {
			System.out.println("!s1.equals(s2)");
		}
		
		
		String s3 = new String("abc");				// 새로운 객체 생성 1
		String s4 =  new String("abc");				// 새로운 객체 생성 2
		
		if(s3 == s4) {
			System.out.println("s3==s4");
		} else {
			System.out.println("s3!=s4");			// 같은 객체 아님
		}
		if(s3.equals(s4)) {
			System.out.println("s3.equals(s4)");	// 내용 같음
		} else {
			System.out.println("!s3.equals(s4)");	
		}
		
	}

}
