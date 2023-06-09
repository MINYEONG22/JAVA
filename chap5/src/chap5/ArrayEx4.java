package chap5;

import java.util.Scanner;

/*
 *	10진수를 입력받아 2진수로 변환하기 
 * 
 */
public class ArrayEx4 {
	public static void main(String[] args) {
		
		int binary[] = new int[32];
		
		System.out.println("2진수로 변환 할 10진수를 입력하세요.");
		
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		
		while(divnum > 0) {						// divnum 0보다 크면 계속 반복
												
												// binary index에
			binary[index++] = divnum%2;			// 2로 나누고 남은 몫 넣고
			divnum/=2;							// 2로 나눠지면 몫 넣고
												// 0보다 크면 계속 반복, 0되면 끝.
			
		}
		
		System.out.print(num+"의 2진수:");
		
		for(int i=index-1; i>=0; i--) {			// index 거꾸로 출력 => 2진수
			
			System.out.print(binary[i]);
			
		}
		
		System.out.println();
		
	}
}
