package test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
1. 반복문을 이용하여 
  파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
  파일명에 exit 가 입력되면, 프로그램 종료.
  해당 파일이 없으면 해당 파일이 없습니다. 메세지 출력
[결과]
파일명을 입력하세요(종료:exit)
aaa.txt
aaa.txt=>aaa.bak 복사완료
파일명을 입력하세요(종료:exit)
bbb.txt  
복사할 파일이 없습니다.
파일명을 입력하세요(종료:exit)
exit
*/
public class test1 {
	public static void main(String[] args) throws IOException {
		System.out.println("파일 명을 입력하세요.");
		while(true) {
			Scanner scan = new Scanner(System.in);
			String fileName = scan.next();
			File f = new File(fileName);	//받아 온 파일 이름
			if(fileName.equals("exit")) {
				System.out.println("시스템 종료");	
				break;
			}
			// 파일 내용 복사
			FileInputStream fis = null;
			FileOutputStream fos = null;
			if(f.exists()) {
				// 특정문자 이후의 문자열 제거 (제일 마지막에 있는 . 의 위치 찾기)
				int a = fileName.lastIndexOf(".");
				String fn = fileName.substring(0,a);
				// 해당파일명.bak 파일로 복사
				fis = new FileInputStream(fileName);
				fos = new FileOutputStream(fn+".bak");
				byte[] buf = new byte[8098];
				int len =0;
				while((len=fis.read(buf)) != -1) {	// fis 파일 읽어서
					fos.write(buf,0,len);			// fos에 처음부터 끝까지 쓰기
				}
				System.out.println(f.getName()+"=>"+fn+".bak 복사완료"); 
			} else {
				System.out.println("해당 파일이 없습니다.");
				scan.next();
			}
		}
	}
}
