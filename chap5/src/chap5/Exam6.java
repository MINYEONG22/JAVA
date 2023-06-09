package chap5;

import java.util.Scanner;

/*
 *	0 
 *  0 0
 *  0 0 0
 *  0 0 0 0
 *  0 0 0 0 0
 *  
 *  
 */
public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan = new Scanner(System.in);
//		
//		int data = scan.nextInt();
		
		int arr[][] = new int [10][];
		
		
		for(int i = 0; i<arr.length; i++ ) {		//	가변 칸 만들기
			
			arr[i] = new int[i+1];		
			
		}
		
		
		// 기본이 0이니까 출력만 하면 됨
		
		for(int i =0; i<arr.length; i++) {	
			
			for(int j=0; j<arr[i].length; j++) {		
				
				// 0,0
				// 1,0	1,1
				// 2,0	2,1	 2,2
				// 3,0	3,1	 3,2  3,3
				// ....
				
				System.out.printf("%3d",arr[i][j]);
				
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
