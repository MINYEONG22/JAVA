package test;

import java.util.Scanner;

/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=10*20 / 2
 */

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("밑변과 높이를 입력해주세요");
		
		int bottom = scan.nextInt();	//scan.nextDouble();	- 콘솔에 입력 된 숫자를 실수로 저장
		int height = scan.nextInt();	//scan.nextDouble();
		
		System.out.println("밑변의 길이: "+bottom+"\n높이의 길이: "+height+"\n너비: " + (bottom*height)/2d);
		
//		소숫점을 가지고 올 수 없어서 실수형으로 만들어줘야함 =>	 2f, 2d, 2.0
	
		
	}

}
