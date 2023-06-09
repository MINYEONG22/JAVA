package test;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고, 
값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기
-1 부터 100까지의 숫자가 아닌 경우 : 1 과 100사이의 숫자만 입력하세요 메세지출력 
- 숫자가 입력이 안된 경우 :  숫자만 입력하세요  메세지 출력
계속 입력을 받는다.
몇번의 입력만에 숫자를 맞추었는지 출력하기.
단 입력 오류된 입력도 입력 건수에 포함된다.

1. 임의의 수를 저장
2. 반복문으로 데이터 입력 받기.
   정답과 비교
3. 입력횟수 증가         
*/
public class Test1 {

	public static void main(String[] args) {
		
		int ran = (int)(Math.random()*100)+1;		//1~100 임의의 숫자 저장.
		Scanner scan = new Scanner(System.in);		// 값을 입력 받아.
	
		System.out.println("1~100 사이의 숫자를 입력하세요.");
		
		int cnt = 0;
		
		while(true) {
			int num=0;
		
			try {
				cnt++;
				num = scan.nextInt();		// try 안에 있어야힘
				if (num < 1 || num >100 ) {
					throw new InputMismatchException();
				} else if (ran > num){
					System.out.println(num+"보다 큽니다.");
				} else if (ran < num) {
					System.out.println(num+"보다 작습니다.");
				} else if (ran == num) {
					System.out.println("정답입니다!"); 
					System.out.println("count:"+cnt); return;
				} 
			} catch (InputMismatchException e) {
				System.out.println("1~100 사이의 숫자만 가능합니다.");
				scan.next();
			}
			
		}
	
	
	}

}
