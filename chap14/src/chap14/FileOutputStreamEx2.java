package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * 화면에서 내용을 입력 받아서 data.txt 파일에 저장하기 
 */
public class FileOutputStreamEx2 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("data.txt");
		System.out.println("저장할 내용을 입력하세요. (종료:exit)");
		while(true) {
			String data = scan.nextLine();		// 자료형별로 분리, 한 줄씩 데이터를 받아옴
			if(data.equals("exit")) break;
			fos.write((data+"\n").getBytes());	// 한줄 한줄 찍히게 \n  fos는 String 타입이 안 돼서 
					//getBytes: 문자열의 내용을 byte[]로 리턴
		}
		fos.flush();
		fos.close();
		
	}
}
