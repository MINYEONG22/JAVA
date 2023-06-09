package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx1 {
	public static void main(String[] args) throws IOException {
					// ┌ InputStream(1byte)을 (Reader(2byte):문자형 입력스트림)로 변경
		Reader in = new InputStreamReader(System.in);
										// InputStream 타입
		
		int data = 0;
						// 2byte(1char) 단위로 읽기
		while((data=in.read()) != -1) {	 // 예외처리를 반드시 해야하는 메서드, ctrl+z 로 함수 끝남
								//-1: 끝 -> 키보드에서 끝을 ctrl+z로 
			System.out.print((char)data);
		}
	}
}
