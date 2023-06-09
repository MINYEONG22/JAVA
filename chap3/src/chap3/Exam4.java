package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력 받아서
 * 양수인 경우는 "양수",
 * 음수인 경우는 "음수"
 * 0인경우 "영"
 * 
 * 출력 
 * 
 * 
 **/


public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);		// 키보드 받기
		
		int num = scan.nextInt();
		
		String result = (num > 0)?"양수":(num == 0)?"영":"음수";
		
		System.out.println(num + "은/는 " + result);	// 결과 출력
		System.out.println(num + "은/는 " +((num > 0)?"양수":(num == 0)?"영":"음수"));	// 결과 출력
		

		String result1 = (num%2==0)?"짝수":"홀수";
		
		System.out.println(num+"은/는 "+result+"이고, "+result1+"이다.");
		
		
		
		
	}

}
