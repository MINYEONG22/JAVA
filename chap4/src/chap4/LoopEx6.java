package chap4;

import java.util.Scanner;

/*
 * 	화면에서 숫자를 여러개 입력 받아 더하기.
 * 
 * */
public class LoopEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum = 0;
		
		System.out.println("숫자 여러개를 입력하세요. 종료:999");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {	//무조건 반복문 실행 => 반복문 문장 내부에 break로 반복 종료함
			
			int num = scan.nextInt();
			if (num == 999) break;	// 999 입력하면 종료 		언제 끝날지 모르니까 while문...
			
			sum += num;
			
		}
		
		System.out.println("입력받은 수의 합: "+sum);
		
	}

}
