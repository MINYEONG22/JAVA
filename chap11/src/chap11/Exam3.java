package chap11;
/*
 *	delChar 메서드 구현하기
 *	StringBuffer delChar(원본문자열,삭제문자열)
 *	: 원본문자열에서 삭제 문자열을 제거하고 나머지 문자열 리턴 
 * 
 */
public class Exam3 {
	public static void main(String[] args) {
	
		System.out.println(delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println(delChar("(1!2@3^4~5)","12345"));
		
	}

	private static StringBuffer delChar(String string, String string2) {
		
		StringBuffer sb = new StringBuffer();
		
		String s1 = string;
		String s2 = string2;
		
		for(int i=0; i<s1.length(); i++) {		// "(1!2@3^4~5)"의 길이만큼 i 0부터 ++
			char ch = s1.charAt(i);				// ch는 (1!2@3^4~5)의 index 0부터 하나하나 단어
			if(s2.indexOf(ch)<0) {				// 만약 (1!2@3^4~5)에 ~!@#$%^&*()가 없으면 
				sb.append(ch);					// 없는 것만 더해라 1234
			}
		// 방법2	
//		 if(! s2.contains(s1.charAt(i)+"")) {	s2에 s1의 단어가 포함되지 않았다면
//		  		sb.append(s1.charAt(i));		sb에 더해라
//		  } 
//		 
		}
		
		return sb;	
		
		
	}
}
