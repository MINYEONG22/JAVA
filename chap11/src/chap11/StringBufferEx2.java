package chap11;
/*
 	StringBuffer 주요 메서드
 	객체를 계속 만들어내지 않고 한 객체 안에서 수정 됨
 	
 */
public class StringBufferEx2 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		
		sb.delete(2,4);			// index 2부터 4 앞까지 = 2,3 제거
		System.out.println(sb);
		
		sb.deleteCharAt(4);		// 4번 index 한 자만 지워라
		System.out.println(sb);
		
		sb.insert(5,"==");		// 5번 index에 "==" 넣어라
		System.out.println(sb);
		
		sb.insert(6,1.23);		// 6번 index에 1.23 넣어라
		System.out.println(sb);
		
		sb = new StringBuffer("ABCDEFG");	// new = 객체 생성
		sb.replace(0, 3, "abc");	// index 0 부터 3 앞까지 0,1,2 변경 abcDEFG
		
		sb.reverse();
		System.out.println(sb);
	}

}
