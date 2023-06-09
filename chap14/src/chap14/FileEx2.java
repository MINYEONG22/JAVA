package chap14;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 *	File 클래스의 주요 메서드 
 *	- getAbsolutePath()	: 파일의 절대 경로
 *	- mkdir() : 1depth 하위 폴더를 생성 (리턴 타입: boolean) 
 *	- mkdirs() : 2depth, 3depth... 하위 폴더 생성
 *	- createNewFile() : 파일 생성
 *	- getName() : 파일 이름
 *	- length() : 파일의 byte 크기
 */
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		System.out.printf("%s 폴더 생성: %b\n",f1.getAbsolutePath(),f1.mkdir());
		// 이미 있으면 fasle가 나오고, 생기면 true
		
		File f2 = new File("c:/temp1/test.txt");					// ┌ 예외처리 필요
		System.out.printf("%s 파일 생성: %b\n",f2.getAbsolutePath(),f2.createNewFile());
		System.out.printf("파일 이름: %s, 파일 크기: %d \n",f2.getName(),f2.length());
		
		File f3 = new File("c:/temp1/test2.txt");
		if(f3.exists()) {	// 파일이 존재하면,
			System.out.println(f3.getName()+" 파일은 존재함");
		} else {
			System.out.println(f3.getName()+" 파일은 없음");
		}
		System.out.printf("%s->%s 이름 변경: %b%n",f2.getName(),f3.getName(),f2.renameTo(f3));		//변경이 됐으면 true, 안 되면 false
		System.out.printf("%s 파일 최종 수정시간 : %s%n", f3.getName(), new Date(f3.lastModified())); 
		// lastModified(): 1970년부터 현재까지의 시간 밀리초로 리턴	=> Date 객체에 넣어서 형식 변경 
		System.out.printf("%s 파일 삭제: %s%n", f3.getName(), f3.delete());
	}
}
