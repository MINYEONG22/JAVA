package test2;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
 
 높이
 
 3: 5+3+1 = 9
 5: 9+7+5+3+1 = 25
 
 
*/
public class Test4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삼각형의 높이를 입력하세요.");
		
		int len = scan.nextInt();		// 깊이
//		int bottom = len*2-1;			// 바닥부터 시작해서
//		int data = 0;
//		
		
		for(int i=0;i<len;i++){
			
			for(int j=0;j<3-i;j++){
				
				System.out.print(" "); 
				
			}
			
			for(int j=0;j<2*i+1;j++){
				
				System.out.print("*"); 
				
			}
			
			System.out.println("");
		} 
		
		
	}
}
