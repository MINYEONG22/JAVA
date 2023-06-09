package chap4;

import java.util.Scanner;

/*
 *	화면에서 자연수를 입력받아서 각 자리수의 합을 구하기 
 * 	while 사용
 * 	[결과]
 *  자연수 입력
 *  123
 *  6
 * 
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		while(num > 0) {		// num이 0보다 크면 계속 돌아
			sum += num%10;	
			num /= 10;
			
			/*
			 * sum에 
			 * 123을 10으로 나눈 나머지 => 3
			 * sum = 3
			 * 
			 * 123를 10으로 나눈 몫 
			 * 123/10 => 12
			 * 
			 * 12를 10으로 나눈 나머지 => 2
			 * sum = 3+2
			 * 
			 * 12를 10으로 나눈 몫
			 * 12/10 => 1
			 * 
			 * 1을/10으로 나눈 나머지 => 1
			 * sum = 3+2+1 =>6
			 * 
			 **/
		}
		System.out.println("자리수 합:"+sum);
		
	}

}
