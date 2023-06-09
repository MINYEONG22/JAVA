package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 	FileInputStream 예제
 * 	 - 파일의 내용을 읽어서 화면에 출력하기
 * 	 
 * 	 - 주요 메서드
 * 		1. int read() : 1byte씩 읽어서 내용을 리턴 (char로는 자동 형변환 돼서 char 출력 가능)
 * 		2. int read(byte[] buf) : buf(buffer)의 크기만큼 읽어서 내용을 buf에 저장하고, 실제 읽은 바이트 수를 리턴.
 * 		3. int read(byte[] buf, int start, int len)
 * 			: len만큼 읽어서 내용을 buf에 저장하고 start 인덱스부터 저장 후, 실제 읽은 바이트 수 리턴
 * 
 * 		4. int available() : 읽을 수 있는 바이트 수 리턴
 * 
 * 		buf
 * 		  0	  1   2   3   4   5
 *		│	│	│	│	│	│	│
 * 		  x	  └		leng ....	
 * 		
 * 		0에는 내용 저장이 x, 
 */
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/chap14/InputStreamEx1.java");
		int data = 0;
		System.out.println("--------------- read()메서드를 이용하여 읽기 ---------------");
		while((data=fis.read()) != -1) {	// read()로 읽으면 1byte씩 읽어서 한글 깨짐.
								// -1 : 파일의 끝을 의미. 파일의 끝이 되면 리턴. 끝까지 (EOF:End Of File)
			System.out.print((char)data);
		}
		
		System.out.println("--------------- read(byte[]) 메서드를 이용하여 읽기 ---------------");
		fis = new FileInputStream("src/chap14/InputStreamEx1.java");		// 위에 있어도 안 쓰면 밑에도 안 찍힘. 반드시 있어야함.
		// fis.available()	: 파일로부터 읽기 가능한 바이트 수(= 읽으려는 파일의 바이트 수)
		// 기본 available() byte -> 읽을때마다 바이트 수가 깎임. => 읽고, 실제 읽은 바이트 수를 전달해줌
		// 읽은 길이는 data, 실제 data는 buf가 가지고 있음. 
		// buf: 실제 읽은 데이터
		// data: 실제로 읽은 byte수
		byte[] buf = new byte[fis.available()];	
		while((data=fis.read(buf)) != -1) {					// 위에서 이미 끝까지 읽어서 다시 처음으로 못 돌아감	↑ 다시 한번 만들어줘야함.
			System.out.print(new String(buf,0,data));
		}
		/* new String(buf,0,data): 생성자
		   buf 라는 배열의 0번지부터, data번지 앞까지 문자열로 생성. 
		   버퍼의 index 0부터 data 앞까지 
		*/
		System.out.println("--------------- read(byte[] buf, int start, int len) 메서드를 이용하여 읽기 ---------------");
		fis = new FileInputStream("src/chap14/InputStreamEx1.java");	
		buf = new byte[fis.available()];	
//		read(buf,0,buf.length) : 파일의 내용을 읽어서, buf 0번지부터, buf.length 길이만큼 buf에 내용 저장. 실제로 읽은 byte 수를 리턴.
		while((data=fis.read(buf,0,buf.length)) != -1) {	// start int 변경하면, length도 그만큼 빼주고
			System.out.print(new String(buf,0,data));		// start int와 숫자 맞춰주기
		}


		/*
		 *  FileInputStream은 FileNotFoundException 이라는 예외처리해야하는데 
		 *  read()는 IOException 예외처리를 해야함.
		 *  FileNotFoundException은 IOException의 하위 예외처리라 IOException이나, Exception 해주면 됨.
		 *  
		 */
	}
}
