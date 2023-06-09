package test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
	src/chap14 폴더의 .java 파일 중 InputStream 관련 모든 소스 내용을  
	InputStream예제.txt  파일 하나에 저장 하기
	InputStream 관련 모든 소스 : XXXInputStreamXXX.java
	
	InputStream예제.txt 파일 참조
*/
public class test2 {
	public static void main(String[] args) throws IOException {
		File f = new File("src/chap14/");		// 상대경로 : 현재 기준 폴더 이후
//		File f = new File("C:\\Users\\gd4\\Desktop\\workspace\\chap14");		// root 폴더부터 절대 경로
		String[] filse = f.list();	// chap14의 하위 파일들
		FileWriter fw = new FileWriter("InputStream.txt");	// 출력
		byte[] buf = new byte[1024];
		for(String f1 : filse) {
			// └ chap14의 하위 파일들 중 한 개
			if(f1.contains("InputStream") && f1.contains(".java")) {	// 포함하는 거
				File f2 = new File(f1);	// 파일로 관리
				System.out.println(f2);
				// 내용 읽기
				FileInputStream fis = new FileInputStream("src/chap14/"+f2);
				BufferedReader br = new BufferedReader(new InputStreamReader(fis));	//한번에 읽기
				String data = null;
				while((data=br.readLine()) != null) {
					System.out.println(data);
					fw.write(data+"\n");
				}
				System.out.println("============InputStream 관련 모든 소스 : XXXInputStreamXXX.java 출력하기==========");
			}
			fw.flush();
		}
	
	}
}
