package chap14;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter : 텍스트 형태의 데이터를 파일에 저장
 * 주요메서드
 *	 - void write(int data) : 1byte만 외부로 출력
 *	 - void write(char[] buf) : buf에 있는 내용을 외부로 출력
 *	 - void write(char[] buf, int start, int len) : buf의 start부터 len만큼 내용 출력
 *	 - void write(String str) : str 내용 출력
 */
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out2.txt에 파일 내용이 저장됩니다.");
		FileWriter fw = new FileWriter("out2.txt");
		fw.write('1');
		fw.write('2');
		fw.write('3');
		fw.write('a');
		fw.write('b');
		fw.write('c');
		fw.write('가');
		fw.write('나');
		fw.write('다');
		char[] buf = "\nFileWriter 예제입니다.\n".toCharArray();
		fw.write(buf);
		fw.write(buf,5,6);
		fw.write("\nFileWriter 예제입니다. String 자료형 출력\n");
		fw.flush();
	}
}
