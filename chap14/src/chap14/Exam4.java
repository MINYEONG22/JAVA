package chap14;

import java.io.File;

/*
 *	c:\window 폴더의 하위폴더 갯수와, 파일의 갯수, 파일의 총 크기 출력 
 */
public class Exam4 {
	public static void main(String[] args) {
		File f = new File("C:\\Windows");
		String[] files = f.list();
		int dcnt = 0;
		int fcnt = 0;
		long fsize = 0;
		for(String ff : files) {
			System.out.println(ff);		// 이름만 나오니까
			File f2 = new File(f,ff);	// "c:\\Windows"폴더의 하위 파일 이름을 저장하여 객체 관리
			if(f2.isDirectory()) {		// 폴더면
				dcnt++;
			} else {					// 파일이면	f2.isFile()	
				fcnt++;
				fsize += f2.length();
			}
		}
		System.out.printf("폴더의 갯수: %d \n",dcnt);
		System.out.printf("파일의 갯수: %d \n",fcnt);
		System.out.printf("파일의 크기: %,dbyte \n",fsize);
	}
}
