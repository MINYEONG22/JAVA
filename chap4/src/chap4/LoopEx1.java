package chap4;

import javax.print.attribute.SetOfIntegerSyntax;

/*
 *	반복문 
 * 	
 * 	1.for - 순서나 체계 끝이 있을 때 보통 씀
 *  for(초기값:조건문:증감식) {
 *  	
 *  	문장들
 *  }
 *  						   ┌ ------>------>-----┐
 *   ▶ 실행순서 : 초기값 -> 조건문  참  -> 문장들 수행 -> 증감식 실행		: 조건문의 경우가 참인 경우, 계속 돌아라. 
 *   						   └ ------<------<-----┘
 *   
 *  						  거짓 ->	 for 밖으로 나감. 반복문 종료.
 *  
 *  ====================
 *  
 *  2.while - 언제 끝날지 모를 때 보통 씀
 *  while (조건문) {
 *  
 *  	문장들
 *  
 *  }
 *  			 ┌ --->----┐
 *   ▶ 실행순서: 조건문 참 -> 문장들
 *   			 └ ---<----┘
 *  			  거짓 -> while 밖으로 나감. 반복문 종료
 *
 *	 조건문이 거짓이면 실행도 안 함.
 *
 *  
 *  ===========================
 *  
 *  3. do while
 *  do {
 *  	
 *  	문장들
 *  
 *  } while (조건문);
 *  
 *  		    ┌ --->----┐
 *  ▶ 실행순서: 문장들 -> 조건문 참
 *  			└ ---<----┘		
 *  					  거짓 -> do while 밖. 반복문 종료  
 *
 *  일단 실행은 함. 
 *		
 *  
 */
public class LoopEx1 {

	public static void main(String[] args) {
		System.out.println("for문을 이용해 1~5까지 출력하기");
		for (int i=1; i<=5; i++) {
			// i는 1이다, i은 5보다 크거나 작다. i는 1씩 증가한다.
			// i변수: for 구문 내에서 선언되었으므로, for 구문 내에서만 사용 가능함. => 지역변수
			System.out.println(i);
		}
		
		System.out.println("----- for문으로 구구단 만들기 -----");
	
		for (int a=1; a<=9; a++) {
			if(a==9) {
				for(int b=2; b<=9; b++) {
					System.out.println(b+"x"+ a + " = "+ b*a);
				}
			}
		}
		
		System.out.println("-------------------------");
		
		System.out.println("while 구문으로 1~5까지 출력");
		int i = 1;
		while (i<=5) {
			System.out.println(i);
			i++;
		} 

		System.out.println("-------------------------");
		System.out.println("do while 구문으로 1~5까지 출력");
		i = 10;
		do {
			System.out.println(i);
			i++;
		} while(i<=5);
	}
}
