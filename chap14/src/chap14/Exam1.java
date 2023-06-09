package chap14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *	FileWriter 클래스를 이용하여 화면에서 입력 된 내용을 data2.txt 파일에 저장하기
 *	 
 */
public class Exam1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter("data2.txt");
		System.out.println("저장할 내용을 입력하세요 (종료:exit)");
		
		while(true) {
			String data = scan.nextLine();
			if(data.equals("exit")) break;
			fw.write(data+"\n");
		}
		fw.flush();
		fw.close();
	}
}
