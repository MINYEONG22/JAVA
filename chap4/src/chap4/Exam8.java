package chap4;

import java.util.Scanner;

/*
 *	삼각형의 높이를 입력하세요 
 */
public class Exam8 {

	public static void main(String[] args) {
		
		
		System.out.println("삼각형의 높이를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		
		int sum = 0;
		int i=0, j=0;
		
				
		for (i=1; i<=h; i++) {
			sum += i ; 		//합을 구해야함.
			for (i=1; i<=h; i++) {
				for(j=1; j<=h; j++) {
					if(i <= j) {
						System.out.print(sum-- + "\t");
					} else {
						System.out.print("\t");
					}
				}
				System.out.println();
			}
		} 
	}

}
