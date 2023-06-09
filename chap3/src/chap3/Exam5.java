package chap3;

import java.util.Scanner;

/*
 *	사과를 담기위한 사과 상자갯수를 구하기 
 *	1개의 상자에 10개의 사과를 담을 수 있다고 가정할 때 필요한 상자의 갯수를 구하기  
 * 
 * [결과]
 * 사과의 갯수를 입력하세요
 * 22
 * 필요한 상자의 갯수:3
 * 
 */
public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("사과 갯수를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		
		// 사과를 10으로 나눠서 나머지가 있으면 +1, 없으면 사과/10의 값
		
		int apple = scan.nextInt();
		
		int a = apple/10;
		int b = (apple/10)+1;
		
		int result = (apple%10 == 0)? a:b;
		int result1 = apple/10+((apple%10==0)?0:1);
		int result2 = (apple%10==0)?0:1;
		
		System.out.println("방법1. 필요한 상자는 "+result+"개 입니다.");
		System.out.println("방법2. 필요한 상자는 "+result1+"개 입니다.");
		System.out.println("방법3. 필요한 상자는 "+ (apple/10 + result2) +"개 입니다.");
												// 괄호 주의
		System.out.println("방법4. 필요한 상자는 " + ((apple%10 == 0) ? apple/10 : apple/10+1) + "개 입니다.");
												// 괄호 주의
		
		
		
	}

}
