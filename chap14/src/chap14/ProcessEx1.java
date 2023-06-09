package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 *	다른 프로세스의 결과를 자바에서 받아서 출력하기 
 *	Runtime.getRuntime() : OS(운영체제, window)로 부터 프로세스를 실행할 수 있는 권한을 받아옴.
 *	exec() :를 통해 프로세스가 실행 됨.
 *	 └  리턴 타입: 프로세스. 
 *	p.getInputStream(InputStream, encoding)	: 프로세스 출력 결과를 전달 받을 수 있는 입력 스트림.
 *	 └  리턴 타입: InputStream
 *	 └ 	InputStream 객체의 encoding 방식 설정.
 *	
 */
public class ProcessEx1 {
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("ping 192.168.200.64");	// 예외처리 필요
				 // └ OS로부터 프로세스를 실행할 수 있는 권한을 받아옴
		Reader r = new InputStreamReader(p.getInputStream(),"EUC-KR");  // "EUC-KR"로 바꿔서 읽어라(기본 인코딩 방식이랑 달라서)
		int data = 0;
		while((data=r.read()) != -1) {
			System.out.print((char)data);
		}
	}
}
