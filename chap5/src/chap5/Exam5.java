package chap5;

import java.util.Scanner;

/*
 *	다음의 결과가 나오도록 프로그램을 작성하시오. 
 * 	2차원 배열을 이용하여 구현하기
 * 
 *  [결과]
 *  5
 *  
 *  15 14 13 12 11
 *  10  9  8  7
 *  6 	5  4
 *  3   2
 *  1   
 * 
 */

public class Exam5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		
		
		int len = scan.nextInt();			
		
		
		int data = 0;	// 첫번째 숫자값 지정
		
		for(int i=1; i<=len; i++) {		// 들어갈 숫자
					
			data += i;
			
		}
	
		
		// 가변 배열로 배열 설정
		int matrix[][] = new int[len][];
		
		
		// 1차원 배열 객체 생성
		for(int i=0; i<len; i++) {		// len = matrix.length;
										
			matrix[i] = new int[len-i]; //0이면 5개, 1이면 4개, 2면 3개, 3이면 2개, 4이면 1개
			
		}
		
		
		// 배열에 값을 설정하기
		for(int i=0; i<len; i++) {
			
			for(int j=0; j<matrix[i].length; j++) {		
				
				matrix[i][j] = data--;
				// 0행 0열에 15 | 1열 14 | 2열 13 | 3열 12 | 4열 11
				// 1행 0열에 10 | 1열 9  | 2열 8  | 3열 7  
				// 2행 0열에 6  | 1열 5  | 5열 4 
				// ...
				
			}
			
		}
		
		
		for(int i=0; i<len; i++) {			
			
			for(int j=0; j<matrix[i].length; j++) {
				
				System.out.printf("%3d\t",matrix[i][j]);
				
			}
			
			System.out.println();
		}
		
		
		/*
		 *	동적할당 
		 *  정적할당 -> 컴파일 시, 메모리 주소 결정
		 * 
		 */
		
		
		
//		for(int i=0; i<arr.length; i++) {		
//			
//			
//			for(int j=0; j>arr[i].length; j++) {
//			
//				sum += i;
//				sum += j;
//				
//				System.out.print(sum);
//			
//			}
//			
//			
//			System.out.println();
//			
//			
//		}
		
		
		
		
		
		
	}

}
