package chap14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *	File 클래스로 파일 읽어오기 
 */
public class FileEx3 {
	public static void main(String[] args) throws IOException {
		File f = new File("bufferd.txt");					// 파일 클래스로 열어주고.
		if(!f.exists()) {		// 존재하지 않으면
			System.out.println("해당 파일은 존재하지 않습니다.");
			return;
		}
		
		FileInputStream fis = new FileInputStream(f);	// 파일 내용 읽기
		byte[] buf = new byte[8096];
		int len;
		while((len = fis.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
		}
		
		fis.close();
		f.delete();
	}
}
