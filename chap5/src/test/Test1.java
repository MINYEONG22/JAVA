package test;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 숫자 받아와서
		// 입력한 숫자 비교
		// 대칭수		홀수...
		// index 0 = index 마지막
		// index 1 = index 마지막-1
		
		System.out.println("대칭수를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int temp = num;
		int result = 0;
		
		//0이 될 때까지 한자리수씩 역순으로 잘라줘 ->
		// 거꾸로값을 result에 받아서 num의 값이 같게 나오면 대칭수, 아니면 대칭수 아님
		
		while(temp != 0 ) {			//받아온 num이 0이 아닐 때까지 반복
			
			result *= 10;			// 0 *10 = 0		//  1				// 2			// 1
			result += temp %10;		// 0 += 121%10  	//  1 += 12%10		// 2 + 1%10
			
			temp/=10;				// 121/10 12 	    // 12/10	1		// 반복 끝
			
		}
		
		if (num == result) {
			
			System.out.println("대칭수입니다.");
			
		} else {
			
			System.out.println("대칭수가 아닙니다.");
			
		}
		
		
		// 방법2
		String snum = ""+num; 					// 문자열 형태로 변경
		char[] arr = snum.toCharArray();		// String 타입을 char 문자열 배열로 변환
		int num1 = arr[0]-'0';				    // 원래 수		// index 0 의 수
		int num2 = arr[arr.length-1]-'0';       // 역순의 수
		
		
		
		for(int i=1; i<arr.length; i++) {		// 순서대로
			
			num1 *= 10;							// 1 *= 10 > 10		12*10 > 120	
			num1 += arr[i]-'0';					// 10 += 2 > 12		120+1> 121
			
		}
		
		for(int i=arr.length-2; i>=0; i--) {	// 역순으로
			
			num2 *= 10;							
			num2 += arr[i]-'0';
		}
		

		
		if (num1 == num2) {
			
			System.out.println("대칭수입니다.");
			
		} else {
			
			System.out.println("대칭수가 아닙니다.");
			
		}
		
	
		
		
	}

}
