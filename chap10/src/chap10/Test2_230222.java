package chap10;

import java.util.Scanner;

public class Test2_230222 {

	public static void main(String[] args) {
	System.out.println("1~10까지의 자연수와, 1~3까지의 숫자를 입력하세요");
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int i = 1, j = 1;
		
		if((n <= 1 || n <= 10) && (m == 1)) {
			
			System.out.println("종류 1");
			
			for(i=1; i <= n; i++) {
				for (j=1; j<=i; j++) {
					System.out.print("*");	
				}
				System.out.println("");	
			}
			
			
		} else if ((n >=1 || n<= 10) && (m == 2)){
			
			System.out.println("종류 2");
			for(i = n; i >= 1; i--) {	
				for (j = i; j >= 1; j--) {	
					System.out.print("*");	
				}
				System.out.println("");	
			}
			
		} else if ((n >=1 || n<= 10) && (m == 3)) {
			
			System.out.println("종류 3");
			int b = n*2-1;		
			int mi = b/2;			
			for(i=0; i<n; i++) {		
				for(j=0; j<b; j++) {		
					if(j >= mi-i && j<= mi+i) {	
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		} else {
			System.out.println("10이하의 자연수와 1~3사이의 자연수를 입력해주세요.");
		}
		
		
		
	}

}
