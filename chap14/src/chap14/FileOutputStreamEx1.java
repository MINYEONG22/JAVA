package chap14;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *	FileOutputStream 예제: 파일에 데이터를 저장.
 *	주요메서드
 *	 - void write(int data) : 1byte만 외부로 출력
 *	 - void write(byte[] buf) : buf에 있는 내용을 외부로 출력
 *	 - void write(byte[] buf, int start, int len) : buf의 start부터 len만큼 내용 출력
 */
public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt에 파일 내용이 저장됩니다.");
		/*
		 * 	fos : out.txt 파일에 내용을 쓸 수 있는 출력 스트림 
		 * 		  out.txt 파일이 없으면 out.txt 파일을 생성하여 내용을 출력함.
		 * 		  out.txt 파일이 있으면, 기존에 파일 생성하여 내용을 출력함. 기존 내용은 사라짐.
		 * 
		 * 	FileOutputStream 객체 생성 시 FileNotFoundException 예외처리가 필요. 
		 * 	 => 파일의 생성권한이 없는 경우 예외가 발생함.
		 * 2
		 * 	new FileOutputStream("out.txt") : out.txt에 내용을 출력하고 기존 내용이 사라지는데,
		 *  기존 내용을 유지하고 싶을 때 ("out.txt",true)를 해주면 됨. 기본값 false
		 */
		FileOutputStream fos = new FileOutputStream("out.txt");
		fos.write('1');
		fos.write('2');
		fos.write('3');
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('가');
		fos.write('나');
		fos.write('다');
		fos.flush();
		
		//byte[] getBytes() 함수	: 문자열 데이터를 byte[]로 리턴
		byte[] buf = "\nFileOutputStream 예제입니다.\n".getBytes();
		fos.write(buf);
		fos.write(buf,5,6);		//index 5부터 6개 
		fos.flush();
		
	}
}
