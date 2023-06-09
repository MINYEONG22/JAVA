package test;

import java.util.Scanner;

/*
1.  화면에서 한개의 문자를 입력받아
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을   출력하기
     그외의 문자는 기타 문자 를 출력하세요 
     
     소문자 = 대문자 + 32
     대문자 = 소문자 - 32
     '0'  : 48
     '1' : 49 => 21
     ('1'-'0')+20 = 21
     ('5'-'0')+20 = 25
*/
public class Test1_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		char ch = scan.next().charAt(0);	
		
		if(ch >= 'A' && ch <= 'Z') { //대문자
			 System.out.println((char)(ch+32));
		} else if (ch >= 'a' && ch <= 'z') { //소문자
			 System.out.println((char)(ch-32));
		} else if (ch >= '0' && ch <= '9') { //숫자
			 System.out.println(ch + 20); //ch 코드값+20
			 // '1'-'0' = 49 - 48 = 1
			 // '3'-'0' = 51 - 48 = 3
			 System.out.println((ch-'0') + 20);
		} else {
			System.out.println("기타문자 입니다.");
		}

	}
}