package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *	1. 화면에서 1~10사이의 숫자를 입력받아, 숫자만큼 * 출력하기
 *	입력값이 숫자가 아닌 경우 InputMissmatchException 예외가 발생.
 *	예외 발생 시, 숫자만 입력하세요. 메세지 출력하고 다시 입력받도록 구현하기
 *	catch 블럭에 scan.next(); 추가하기	
 * 
 *  2. 숫자가 1~10사이의 숫자가 아닌 경우 예외를 강제로 발생하고, 다시 숫자를 입력받기
 *  
 */
public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			try {
				System.out.println("1~10사이의 숫자를 입력하세요");
				int num = scan.nextInt();
				if(num < 1 || num > 10 ) {	
				//	throw new Exception("1~10 사이의 숫자만 가능합니다.");
					throw new Exception();
				}
				System.out.print(num+":");
				for(int i=0; i <num; i++) {
					System.out.print("*");	
				}
				System.out.println();
				break;	// 숫자 넣어주면 별 찍고 프로그램 종료.
			} catch (InputMismatchException e) {				// 상위클래스가 위에 있으면 하위 클래스는 오류
				System.out.println("숫자만 입력하세요.");
				scan.next();			// 없으면 무한 반복 - int 아닌 거 읽고 버림
			} catch (Exception e) {
			    System.out.println(e.getMessage());
				System.out.println("1~10 사이의 숫자만 가능합니다.");
			}
			
		}	
		
		
		
	}

}
