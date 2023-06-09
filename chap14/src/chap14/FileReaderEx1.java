package chap14;

import java.io.FileReader;
import java.io.IOException;
/*
 * 	FileReader 클래스: 파일에서 데이터 2byte 단위로 읽는 기능
 * 	
 * 	주요메서드
 * 	 - int read() : 파일에서 데이터를 읽어서 1char로 리턴
 * 	 - int read(char[] buf) : byte형 buf가 아닌, char형 buf => buf의 크기만큼 읽어서 buf에 내용 저장 후
 * 							  실제 읽은 char 수를 리턴
 * 	 - int read(char[] buf, int start, int len) : 파일에서 데이터를 len 크기만큼 읽어서, buf에 start 인덱스부터 내용저장 후
 * 												  실제 읽은 char 수를 리턴
 */
public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("src/chap14/InputStreamEx1.java");
		int data = 0;
		System.out.println("--------------- read()메서드를 이용하여 읽기 ---------------");
		while((data = fis.read()) != -1) {
			System.out.print((char)data);	//char로 읽으니까 2byte
		}
		System.out.println("--------------- read(char[])메서드를 이용하여 읽기 ---------------");
		fis = new FileReader("src/chap14/InputStreamEx1.java");
		char[] buf = new char[8000];		// 수 지정
		while((data = fis.read(buf)) != -1) {
			System.out.print(new String(buf,0,data));
		}
		System.out.println("--------------- read(char[], int start, int len) ---------------");
		fis = new FileReader("src/chap14/InputStreamEx1.java");
		buf = new char[8000];		// 수 지정
		while((data = fis.read(buf,0,buf.length)) != -1) {
			System.out.print(new String(buf,0,data));
		}
	}
}
