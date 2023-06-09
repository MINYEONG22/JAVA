package chap4;

import java.util.Scanner;

/*
 *	농장에 강아지, 병아리가 있음. 
 *  강아지 병아리 전체 마리수 입력받고
 *  강아지 다리수와 병아리 다리수 전체를 입력받는다.
 * 
 * 	[결과]
 * 	강아지와 병아리 마리 수를 입력하세요.
 * 	20
 * 
 *  강아지와 병아리 전체 다리수를 입력하세요
 *  30
 *  
 *  
 *  강아지: xx마리,
 *  병아리: yy마리
 *  
 *  
 *  다르면, 계산 안 됨
 *  
 *  
 */
public class Exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
							 
	
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("강아지와 병아리 마리수를 입력하세요");
		int cnt = scan.nextInt();
				
		
		System.out.println("강아지와 병아리 다리수를 입력하세요");
		int leg = scan.nextInt();
		
		
		boolean check = false;
		
		
		for (int x=0; x <=cnt; x++) {
			
			
			for (int y = 0; y<=cnt; y++) {
				
				
				if( (x+y == cnt) && ((4*x)+(2*y) == leg)) {
					
					System.out.println("강아지의 수: "+x+"\n병아리수: "+y);
					
					check = true;
					
				} 			
					
			}
				
				
		} if (!check) { // 체크가 true가 아니면
			
			System.out.println("계산 안됨");	
			
			
		  }
		
		

		
		
		
		
		
		
		

	}

}
