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

public class Test2_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 3 사이의 임의의 정수
		int srp = (int)(Math.random() * 3) + 1; //시스템 값
		System.out.println
     ("가위(1), 바위(2), 보(3) 를 숫자로 입력하세요");
		Scanner scan = new Scanner(System.in);
		int mySrp = scan.nextInt();
		boolean win = false; //true : 사용자 승리
		System.out.print
		   ("시스템:" + srp + ",사용자:" + mySrp);
		if (mySrp == srp) 
			System.out.println("\t비김.");
		else { //승부판단
			switch(srp) { 
			case 1 :
				if(mySrp == 2) win = true; break;
			case 2 :
				if(mySrp == 3) win = true; break;
			case 3 :
				if(mySrp == 1) win = true; break;
			}
			if (win)
				System.out.println(" \t사용자 승리!");
			else
				System.out.println(" \t시스템 승리!");
		}
	}

}
