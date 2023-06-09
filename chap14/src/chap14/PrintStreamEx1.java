package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 *	보조 스트림: PrintStream => 출력 기능을 강화한 스트림
 *	 1. OutputStream 클래스의 하위 클래스 => 바이트형 출력 스트림
 *	 2. write() 기능을 다양하게 확장함.
 *		- print(), println(), printf() : 모든 자료형을 출력할 수 있게 함. 예외처리 생략 가능.
 *	 3. 표준출력(System.out), 표준오류(System.err) 객체의 자료형
 *	 4. 객체 생성 시 출력 스트림을 매개변수로 받음.
 *		new PrintStream(OutputStream)
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("홍길동");
		ps.println("1234");
		ps.println(true);
		ps.println(65);
		ps.write(65); // A로 찍힘 
		ps.println();
		ps.println('A');
		ps.flush();
		ps.close();
	
	}
}
