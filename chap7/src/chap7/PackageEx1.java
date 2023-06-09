package chap7;

import java.util.Date;
import java.util.Scanner;
import java.util.*;		// java.util 패키지의 모든 클래스는 패키지명 생략

/*
 *	패키지 예제
 *	package
 *		- 클래스들의 모임
 *		- 클래스의 이름은 패키지 명을 포함 
 *		- 패키지의 설정은 파일의 처음에 한 번만 가능
 *			=> 하나의 파일에 존재하는 모든 클래스는 같은 패키지에 속한 클래스임.
 * 
 * 	import: 클래스 이름의 패키지명을 생략할 수 있도록 미리 사용될 클래스의 이름을 선언함.
 * 
 * 	클래스의 패키지 명을 생략할 수 있는 경우
 * 	1. 같은 패키지에 속한 클래스를 사용 시 생략 가능
 * 	2. java.lang 패키지에 속한 클래스 사용 시 생략 가능
 * 	3. import 구문으로 선언 된 클래스 사용 시 생략 가능
 * 
 * 
 */
class Pack1 {
	void method () {
		System.out.println("chap7.Pack1 클래스의 method() 메소드");
	}
}
public class PackageEx1 {		//chap7.PackageEx1 이 본래 이름

	public static void main(String[] args) {
		Pack1 p = new Pack1();
		p.method();
		java.util.Scanner scna2 = new java.util.Scanner(System.in);
		Scanner scan = new Scanner(System.in);	// 임포트 사용하면 패키지 이름 생략 가능
//		java.util.Date today = new java.util.Date(); 	원래 이름
		Date today = new Date();	// 패키지명 생략
	}

}
