package chap14;

import java.io.IOException;
import java.io.InputStream;

/*
 	입출력스트림: 데이터 이동통로. 단방향.
 		입력스트림	┌ 바이트형 스트림: 1byte 단위로 읽음 (동영상, 이미지 등)
				│	└ 최상위 스트림: inputStream
				│		└ 하위 클래스: FileInputStream
				│
				└ 문자형 스트림	: 2byte 단위로 읽음	(텍스트 데이터)
					└ 최상위 스트림: Reader
						└ 하위 클래스: FileReader
				
					
		출력스트림	┌ 바이트형 스트림: 1byte 단위로 출력 (동영상, 이미지 등)
				│	└ 최상위 스트림: OutputStream
				│		└ 하위 클래스: FileOutputStream, PrintStream (byte형 출력 스트림)
				│
				└ 문자형 스트림	: 2byte 단위로 출력 (텍스트 데이터)
					└ 최상위 스트림: Writer
						└ 하위 클래스: FileWriter 
						
		InputStreamReader: 바이트형 입력 스트림을 -> 문자형 입력 스트림으로 변경은 가능
		OutputStreamWriter: 바이트형 출력 스트림을 -> 문자형 출력 스트림으로 변경은 가능
								1byte => 2byte
								
	 자바 자체에서 제공하는 표준 입출력 스트림 객체
		 표준 입력 스트림: System.in => 키보드에서 제공(입력) 된 값이 나의 프로그램으로 들어오게 해줌.
		  	└ 자료형: InputStrem System.in
		 표준 출력 스트림: System.out => 콘솔로 출력.
		 	└ 자료형: PrintStream System.out (얘만 PrintStream - OutputStream의 하위 클래스)
		 표준 오류 스트림: System.err => 콘솔로 출력 (출력 스트림)
	 		└ 자료형: PrintStream System.err
 */
public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
		// 키보드에서 바로, InputStream-> byte형 입력 스트림
		// in.read(): 키보드에서 들어오는 입력값을 1byte 단위로 data에 넣어줌
		// 영문, 숫자 -> 2byte여도 1byte만 읽어서도 문자가 돼서 가능하지만, 한글은 2byte가 필요함. => 한글 깨짐
		
		InputStream in = System.in;		
		int data = 0;
						//read는 1byte 읽어서 집어 넣고 읽어서 넣고 반복
		while((data=in.read()) != -1) {	 // 예외처리를 반드시 해야하는 메서드, ctrl+z 로 함수 끝남
			System.out.print((char)data);
		}
	
	}
}
