package test2;

import java.util.Scanner;

/*
삼각형의 높이를 홀수로 입력하세요
5
*****
 ***
  *
 ***
*****
 */
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("삼각형의 높이를 홀수로 입력하세요.");
		
		int len = scan.nextInt();		// 깊이
		int bottom = len*2-1;			// 바닥부터 시작해서
		int m = bottom/2;
		
		
		for(int i = 0; i<=len/2; i++) {				// i는 입력값/2보다 작거나 같고, i는 1씩 증가
			
			for(int j=0; j<len -i; j++) {		//	
				
				if(j<i) {
					
					System.out.print(" ");
					
				} else {
					
					System.out.print("*");
					
				}
				
			}
			
			System.out.println();
				
		}
		
		for(int i = len/2+1; i<len; i++) {				// i는 입력값보다 작고, i는 1씩 증가
			
			for(int j=0; j<=i; j++) {		//
				
				if(j>=len-i -1) {
					
					System.out.print("*");
					
				} else {
					
					System.out.print(" ");
					
				}
				
			}
			
			System.out.println();
				
		}
		
	
		
	}

}
