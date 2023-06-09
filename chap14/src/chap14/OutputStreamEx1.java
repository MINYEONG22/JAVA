package chap14;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		// OutputStream : 바이트형(1byte) 출력스트림
		// write(int) : 1바이트 출력 ∴ 한글 부분 깨짐
		OutputStream out = System.out;
		out.write('1');
		out.write('2');
		out.write('3');
		out.write('a');
		out.write('b');
		out.write('c');
		out.write('가');	// 한글 2byte -> 깨짐
		out.write('나');
		out.write('다');
		out.flush(); 	// 버퍼(통로)의 내용을 목적지로 강제 전송해서 출력해줌
		System.out.println(); 
		//out은 구현은 되는데, 외부거라 오버라이딩 되지 않고 java.io.PrintStream@5ca881b5 이런식으로 출력
		
		Writer out2 = new OutputStreamWriter(System.out);
		out2.write('1');
		out2.write('2');
		out2.write('3');
		out2.write('a');
		out2.write('b');
		out2.write('c');
		out2.write('가');
		out2.write('나');
		out2.write('다');
		out2.flush(); 	// 버퍼(통로)의 내용을 목적지로 강제 전송해서 출력해줌
	
	}
}
