package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

/*
 *	InputStreamEx1.java 소스를 읽어 InputStreamEx1.bak 파일로 생성하기
 *	FileInputStream을 이용하고, 한글 부분은 깨지지 않도록 한다. 
 */
public class Exam2 {
	public static void main(String[] args) throws Exception {
		String infile = "src/chap14/InputStreamEx1.java";
		String outfile = "src/chap14/InputStreamEx1.bak";
		
		FileInputStream fis = new FileInputStream(infile);
		FileOutputStream fos = new FileOutputStream(outfile);
		
		byte[] buf = new byte[fis.available()];	
		int len = 0;
		while((len=fis.read(buf)) != -1) {		
			fos.write(buf,0,len);
		}
		
		fos.flush();
		fos.close();
		fis.close();
	}
}
