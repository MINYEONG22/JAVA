package chap11;
/*
 *	String 클래스의 주요 메서드
 * 
 */
public class StringEx3 {
	public static void main(String[] args) {

		String s = new String("ABCDEFGH");
		System.out.println("s.charAt(4): " + s.charAt(4));  //index 0부터 시작 - 5번째 문자

		
		/* 정렬에서 사용되는 메서드. - 대소문자 구분
		 *  음수 리턴: s 문자열(ABCDEFGH)이 abc라는 문자열보다 앞쪽(작다)이라고 인식. 
		 *  양수 리턴: s 문자열(ABCDEFGH)이 AAA라는 문자열보다 뒤쪽(크다)이라고 인식.
		 *  0   리턴: 같은 문자열로 인식*/
		System.out.println("s.compareTo('abc'): "+s.compareTo("abc"));
		System.out.println("s.compareTo('AAA'): "+s.compareTo("AAA"));
		
		/* compareTo랑 똑같은데, 대소문자 상관없이 비교 
		 * IgnoreCase: 대소문자 상관없이의 의미.
		 * */
		System.out.println("s.compareToIgnoreCase('abc'): "+s.compareToIgnoreCase("abc"));
		
		// return 값: true or false 
		// s 문자열(ABCDEFGH)이 끝이 GH냐
		System.out.println("s.endsWith('GH'): "+s.endsWith("GH"));
		// s 문자열(ABCDEFGH)이 시작이 AB이냐
		System.out.println("s.startsWith('AB'): "+s.startsWith("AB"));
		// s 문자열(ABCDEFGH)의 내용이 AABCDEFGH이냐
		System.out.println("s.equals('ABCDEFGH'): "+s.equals("ABCDEFGH"));
		// 대소문자 상관없이 s 문자열(ABCDEFGH)의 내용이 AABCDEFGH이냐
		System.out.println("s.equalsIgnoreCase('abCdEfGh'): "+s.equalsIgnoreCase("abCdEfGh"));
		
		s = "This is a String";
		System.out.println("s.indexOf('i') :"+s.indexOf("i"));
		// s라는 문자열에서 i라고하는 문자의 위치값 리턴 0부터 시작.
		
		System.out.println("s.indexOf('i',3) :"+s.indexOf("i",3));
		// s라는 문자열의 3번째 index 이후에 있는 i의 index 값 리턴
		
		System.out.println("s.indexOf('Q') :"+s.indexOf("Q"));
		// 없으면 -1 출력
		
		System.out.println("s.lastIndexOf('i') :"+s.lastIndexOf("i"));
		// s라는 문자열에서 마지막에 있는 i의 index 값 리턴, index의 값은 앞에서부터 시작
		
		System.out.println("s.length(): "+s.length());
		// 문자열의 길이 
	
		System.out.println("s.replace('is','or'): " +s.replace("is","or"));
		// is 문자열을 or 문자열로 치환
	
		System.out.println("s.replace('is',''): " +s.replace("is",""));
		// is 없애기
		
		
		//substring: 부분문자열
		System.out.println("s.substring(5): "+s.substring(5));
		// 5번 index 이후 문자열 리턴
		
		System.out.println("s.substring(5,13): "+s.substring(5,13));
		// 5번 index 부터 13이전까지 => 5번부터~12까지 나옴
		
		
		//대소문자 변경
		//toUpperCase(), toLowerCase()
		System.out.println("s.toUpperCase(): "+s.toUpperCase());
		System.out.println("s.toLowerCase(): "+s.toLowerCase());
	
		
		s= "                 문자열 trim 메서드: 양쪽 공백 제거                  ";
		System.out.println(s);
		System.out.println("s.trim() :"+ s.trim());
		System.out.println("s: "+s.length());
		System.out.println("s.trim() :"+ s.trim().length());
	
		
		//split: 문자열을 분리하여 배열로 리턴
		s="홍길동,이몽룡,김삿갓";
		String[] arr = s.split(",");	//,기준으로 분리
		for(String sr : arr) {
			System.out.println(sr);
		}
				
		
		
		
	
	}

}
