package test;

import java.util.Scanner;

/*
1.  다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.
  [결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
  [결과]
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("숫자만 입력하세요.");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();		
		
		char[] arr = str.toCharArray();		
		boolean isNumber = true;
		for(char ch:arr) {
			
			if(ch < '0'  || ch > '9') {
				
				isNumber = false;			//숫자가 아니면 멈추고,
				break;
				
			} 
			
		} if(isNumber) {		//true 숫자

			System.out.println(str+"는 숫자입니다.");
			
		} else {			// false 나오면 숫자가 아닙니다.
			
			System.out.println(str+"는 숫자가 아닙니다.");
			
		}
		
		
		
		
		//방법2
		for(int i=0; i<str.length() && isNumber; i++) {
			
			char ch = str.charAt(i);		// 문자열 i
			

			if(ch < '0'  || ch > '9') {
				
				isNumber = false;
				break;
				
			} 
			
		}
			
		if(isNumber) {		//true 숫자
	
			System.out.println(str+"는 숫자입니다.");
			
		} else {
			
			System.out.println(str+"는 숫자가 아닙니다."); 
			
		}
			
			
		
		
	}

}
