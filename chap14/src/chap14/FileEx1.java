package chap14;

import java.io.File;

/*
 *	File 클래스
 *	 - 파일이나 폴더의 정보를 관리하는 클래스 
 */
public class FileEx1 {
	public static void main(String[] args) {
		String filePath = "c:/";	// = "c:\\"	 	|		\\, / :윈도우의 기본 폴더(디렉토리) 분리자.  리눅스나 맥은 / 만
		File f1 = new File(filePath);	// 파일이나 폴더를 관리	=>  "c:/" 폴더를 관리하는 애 가지고 와
		String[] files = f1.list();		// f1.list() : f1 파일의 하위 목록 리턴
		for(String f : files) {			// f: 파일 혹은 폴더의 이름 리턴
//			System.out.println(f); 		// f1("c:/") 파일의 하위 목록
			File f2 = new File(filePath,f);		// "c:/"폴더의 하위 파일 이름을 저장하여 객체 관리
			if(f2.isDirectory()) {		// 디렉토리(폴더)면
				System.out.printf("%s: 디렉토리 \n",f);		// <-로 출력
			} else {					// 디렉토리(폴더)가 아니면: 파일이면
				System.out.printf("%s: 파일(%,dbyte) \n",f,f.length());		// <-로 출력
			}						//10진 정수 3자리마다,로 출력	 └ 용량(크기)
		}
	}
}
