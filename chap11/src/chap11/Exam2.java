package chap11;
/*
 *	count() 메서드 구현하기
 *	count(원래 문자열, 찾는 문자열): 원래 문자열에서 찾는 문자열의 갯수 리턴 
 * 
 */
public class Exam2 {
	public static void main(String[] args) {
	
		System.out.println(count("12345AB12AB45AB","12"));	//2개
		System.out.println(count("12345AB12AB45AB","AB"));	//3개
		System.out.println(count("12345","6")); //0
	}

	private static int count(String s1, String s2) {
		int cnt = 0;
		int index =0;

		while(true) {
			index = s1.indexOf(s2,index); // 0은, s1 => 12345AB12AB45AB 중에 s2 12를 index 0부터 찾아라
			if(index < 0) break;		// 0이 크면 break;
			cnt++;						// 
			index++;	
		}
		return cnt;
	}
}
