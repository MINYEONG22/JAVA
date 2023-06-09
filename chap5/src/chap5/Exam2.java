package chap5;

import java.util.Scanner;

/*
 *	10진수를 입력 받아서 8진수로 변경하기 
 * 
 */
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("10진수 8진수로 변경하기");
		
		
		int[] binary = new int[32];
		
		int num = scan.nextInt();				// 숫자 받아서
		int divnum = num;						// 받은 숫자 divnum 에 넣고
		int index = 0;
		
		while(divnum > 0) {						// index에 8진수 넣기
			
			binary[index++] = divnum%8;	
			divnum/=8;
			
		}										// divnum이 0보다 크면 계속 반복
		
		System.out.print(divnum+"의 8진수:");
		
		for (int i=index-1; i>=0; i--) {	// index에 있는 8진수의 값 출력하기
											// 거꾸로 출력해야하니까 -- index 작아지게
			
											// i=index   => 맨 마지막 값 0 출력
											// i=index=1 => 맨 마지막 값 0 출력 안 됨
			
			System.out.print(binary[i]);
			
		}
		
		
		System.out.println();
		
		
	}

}
