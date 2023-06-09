package test;

import java.util.Scanner;

/*
시스템과 가위(1), 바위(2), 보(3)를 하기
 시스템은 1,2,3 중의 한개의 숫자를 저장하고, 
 한개의 숫자를 입력받아 가위바위보 게임하기 
 
 [결과]
 가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
 1
 사용자 승리!
 가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
 1
 시스템 승리!
*/
public class Test2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int rsp = (int)(Math.random()*3) + 1 ;		//시스템
		
		// 사용자 
		Scanner scan = new Scanner(System.in);
		
		int cus = scan.nextInt();
		
		
		boolean win = false; // 변수, true 사용자 승리
		
		
		if(rsp == cus) {
			
			System.out.println(": 비김");
			
		} else {
			
			
			switch(rsp) {
			
			
				case 1 : if (cus == 2) win = true; break;
				case 2 : if (cus == 3) win = true; break;
				case 3 : if (cus == 1) win = true; break;
			
			}
			
			
			if (win) {
				
				System.out.println("사용자 승리");
				
				
			} else {
				
				System.out.println("시스템 승리");
				
			}
			
			
			
		}
		
		
		
	}

}
