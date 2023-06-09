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
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("가위(1),바위(2),보(3)");
		
		
		Scanner scan = new Scanner(System.in);
		
		int cus = scan.nextInt();
		int rsp = (int)(Math.random()*3) + 1 ;		//랜덤
		
		
		switch(rsp) {
		
			case 1: System.out.println("시스템: 가위");
					break;
			case 2: System.out.println("시스템: 바위");
					break;
			case 3: System.out.println("시스템: 보");
		
		
		}
		
	
		
		
		switch(cus) {
		
			case 1: System.out.println("사용자: 가위");
					break;
			case 2: System.out.println("사용자: 바위");
					break;
			case 3: System.out.println("사용자: 보");
	
			
		}
		
	
	
		if(cus == rsp) {
			
			System.out.println("비겼습니다");
			
		} else if (rsp == 1) {
			
				if(cus == 2) {
					System.out.println("사용자 승");
				} else {
					System.out.println("시스템 승");
				}
			
			
		} else if (rsp == 2) {
			
				if(cus == 1) {
					System.out.println("시스템 승");
				} else {
					System.out.println("사용자 승");
				}
		
			
		} else {
			
			if(cus == 1) {
				System.out.println("사용자 승");
			} else {
				System.out.println("시스템 승");
			}
	
			
		
		}
		
	}

}
