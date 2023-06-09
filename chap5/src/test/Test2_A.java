package test;

import java.util.Scanner;

public class Test2_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("숫자만 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next(); //문자열 입력
		
		char[] arr = str.toCharArray(); //char[] 
		
		boolean isNumber = true;
        
		for(char ch : arr) {
		
			if(ch < '0' || ch > '9') { //숫자가 아닌 문자
				
				isNumber = false;
				break;
			}
			
        }
		
		if(isNumber) { //true : 숫자.
		
			System.out.println(str + "는 숫자 입니다.");
		
		} else {
		
			System.out.println(str + "는 숫자가 아닙니다.");
		
		}
		
		isNumber = true;
		
		for(int i=0; i < str.length() && isNumber ;i++) {
			
			char ch = str.charAt(i);
			
			if(ch < '0' || ch > '9') {//숫자 아님
			isNumber = false;

			}
		
		}
		
		if(isNumber) {
			
			System.out.println(str + "는 숫자 입니다.");
	
		} else {
		
			System.out.println(str + "는 숫자가 아닙니다.");
		
		}
		
		
	}

}
