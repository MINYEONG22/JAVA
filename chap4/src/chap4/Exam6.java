package chap4;

import java.util.Scanner;

/*
 * 
 *		삼각형의 높이를 입력 받아서 *로 삼각형 출력하기 
 * 
 * 
 * 
 * 
 * 
 */
public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("숫자를 입력하세요");
		
		
		Scanner scan = new Scanner(System.in);
		
		int star = scan.nextInt();
		int i = 1, j = 1;
				
		
		
		System.out.println("1");
		
		for(i=1; i <= star; i++) {	//i는 1이다, i는 star보다 작거나 같다, i는 1씩 증가한다.
		
		
			for (j=1; j<=i; j++) {	// j는 1이다, j는 i보다 작거나 같다, j는 1씩 증가한다
				
				
				System.out.print("*");	// j가 i보다 작거나 같아질 때까지 * 을 출력해라. 
				
			}
			
			System.out.println("");	// i가 j와 같아질 때까지 줄바꿈 해줌
			
		}
		
		
		
		
		System.out.println("2");
		
		for(i = star; i >= 1; i--) {	//i는 star이다, i가 1보다 크거나 같을때까지 i를 1씩 줄인다.
			
			
			for (j = i; j >= 1; j--) {	// j는 i와 같다. j가 1보다 크거나 같을때까지 j를 1씩 줄인다.
				
				
				
				System.out.print("*");	// j가 1보다 크거나 작아질 때까지 * 을 출력해라. 
				
			}
			
			System.out.println("");	// i가 1보다 크거나 작아질 때까지 줄바꿈 해줌
			
		}
		
		
		
		
		System.out.println("2-1");
		
		for(i = star; i >= 1; i--) {	//i는 star이다, i가 1보다 크거나 같을때까지 i를 1씩 줄인다.
			
			
			for (j=1; j<=i; j++) {	
				
				
				System.out.print("*");	
				
			}
			
			System.out.println("");	
			
		}
		
		
		
		
		System.out.println("3");
		
		for (i=star; i>=1; i--) {		// i와 입력값은 같다, 1보다 입력값이 크거나 같을때 입력값을 1씩 줄인다. 
										// ex) 5--	 => 5 4 3 2 1
			for(j=1; j<=star; j++) {	// j는 1이다, j는 입력값보다 작거나 같을 때 1씩 증가한다.
										// 	   1 ++  => 1 2 3 4 5
				if(i<=j) {				
					
					System.out.print("*");		// i가 j보다 작거나 같으면  5가 1보다 작거나 같으면 * 입력하고
					
				} else if (i>j) {				// i가 j보다 크면 		  5가 1보다 크면 공백 입력
					
					System.out.print(" ");		
					
				}
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		System.out.println("4");
		

		for (i=1; i<=star; i++) {
			
			for(j=1; j<=star; j++) {
				
				
				if(i<=j) {
					
					System.out.print("*");
					
				} else {
					
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}
		
	
		
		
		System.out.println("5");
		
		int b = star*2-1;		 // 바닥의 * 갯수	(입력값*2)-1 => (5*2)-1 = 9
												// 			  (4*2)-1 => 7
												// 별이 1 3 5 7 9 로 커지니까... 
		
		int m = b/2;			 //  중간 인덱스를 구해야함. 9/2 => 4
		 						 //					   7/2 => 3
		
		
		for(i=0; i<star; i++) {		// i = 0이다. i는<입력갑 보다 작고, 1씩 증가
			
			// i=0;  i가 입력값보다 작을때까지 i 1씩 더해짐      5-> 0 1 2 3 4
			
			for(j=0; j<b; j++) {	// 바닥까지 가야함		
				
				//j는 0; j는 b보다(바닥) 작을때까지 1씩 증가
				
				if(j >= m-i && j<= m+i) {	// j는 >= 4-1(3) and j <= 4+1 (5)	
											//			 4번째 자리에 * 찍고
											//		 3-1(2) and		3+1	(4)
											//				3번째		
					System.out.print("*");
					
				} else {
					
					System.out.print(" ");
					
				}
				
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
