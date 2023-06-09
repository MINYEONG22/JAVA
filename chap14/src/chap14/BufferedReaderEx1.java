package chap14;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *	BufferdReader 보조 스트림
 *	1. 새로운 기능 추가. => 한 줄씩 읽을 수 있는 readLine() 추가.
 *	2. 객체 생성을 할때 다른 스트림을 매개변수로 받음.
 *		└ new BufferdReader(Reader)		매개변수를 Reader로 무조건 받아야함.
 * 
 */
public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		/*
		 *	System.in 타입: InputStream
		 *	InputStreamReader를 통해서 Reader로 변경 
		 * 	new BufferedReader(Reader를 매개변수로 받음)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// InputStreamReader가 Reader로 바뀌고, BufferedReader로 다시 바뀜
		System.out.println("저장할 내용을 입력하세요. 종료(ctrl+z)");
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
					// ┌ 한줄 입력 기능 메서드
		while((data=br.readLine()) != null) {		// enter 기준으로 한 줄씩 (추가 기능)
			System.out.println(data);
			fw.write(data+"\n");
		}
		fw.flush();
		fw.close();
		br.close();
	}
}
