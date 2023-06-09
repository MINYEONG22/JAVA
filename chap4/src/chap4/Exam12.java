package chap4;

/*
 * 	숫자 맞추기
 * 	컴퓨터가 1~100 사이의 임의의 수를 저장하고,
 *  사용자는 숫자를 입력하여 컴퓨터가 저장한 숫자 맞추기
 * 
 * 
 * 	시스템: 37 가정
 * 	
 * 
 *  [결과]
 * 	1~100 사이의 숫자를 입력하세요.
 *  50
 *  작은 수 입니다.
 *  
 *  25
 *  큰 수 입니다.
 *  
 *  40
 *  작은 수 입니다. 
 * 
 *  37
 *  정답입니다. 프로그램 종료
 * 
 */

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		do while 로
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100사이의 숫자를 입력하세요.");	//반복문 안에 들어가면 계속 뜸

		int sys = (int)(Math.random()*100)+1;

		
		do {
			
			int num = scan.nextInt();			// while문 안에 있어야함
			
			if(num > sys) {
				
				System.out.println(num+" 보다 작은 수 입니다.");	
				
			} else if (num < sys) {
				
				System.out.println(num+" 보다 큰 수 입니다.");
				
			} else if (num == sys) {			
				
				System.out.println("정답입니다.\n프로그램 종료합니다.");  break; 
			
			}
			
			
		} while(true);		// while(num != sys) 넣어도 됨. 넣으려면 do while 문 밖에 int num = 0; 넣어줘야함. 
													  // do while 문 안에 있는 거, 밖에서 사용 못 해서
	
	}

}
