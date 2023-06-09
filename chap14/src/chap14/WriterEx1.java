package chap14;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws IOException {
	// OutputStreamWriter: 바이트형 출력 스트림(OutputStream 1byte)을 문자형 출력(Writer 2byte) 스트림으로 변경
	// PrintStream System.out
	// Writer 문자형 출력 스트림
	//  └의 메서드 write(int) : 2byte(1char)단위로 출력 char -> int로 자동형변환
		Writer out = new OutputStreamWriter(System.out);
		out.write('1');
		out.write('2');
		out.write('3');
		out.write('a');
		out.write('b');
		out.write('c');
		out.write('가');
		out.write('나');
		out.write('다');
		out.flush(); 	// 버퍼(통로)의 내용을 목적지로 강제 전송해서 출력해줌
	}
}
