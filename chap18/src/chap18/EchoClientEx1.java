package chap18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 *	Echo Client 프로그램
 * 	키보드에서 데이터를 입력 받아, 서버로 데이터 전송 
 * 	서버에서 데이터를 수신하여 화면에 출력
 */
public class EchoClientEx1 {
	public static void main(String[] args) throws IOException {
		int port = 5000;
		String ip = "192.168.200.64";
		Socket client = null;
		PrintWriter out = null;
		BufferedReader br = null;
		String input;
		// stdin: 키보드에서 입력을 받을 수 있는 stream - 자료형: BufferedReader (한 줄씩 읽을 수 있음: readLine())
																		// scanner로 해도 상관 없음
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		// Socket 객체 생성. 
		// ip: 서버 ip 주소
		// port: 서버 port 번호
		client = new Socket(ip, port);
		br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		// 클라이언트: client.getInputStream(): 서버에서 데이터를 받는 스트림 (수신)
		// 서버: 데이터를 송신 함. (발신)
		out = new PrintWriter(client.getOutputStream());
		// 클라이언트: client.getOutputStream(): 서버에 데이터를 보내는 스트림 (발신)
		// 서버: 데이터를 수신함 (수신)
		
		System.out.println("local port: " + client.getLocalPort());	 // 로컬(클라이언트) 포트, ip
		System.out.println("local ip: "+client.getLocalAddress());
		System.out.println("server port: "+client.getPort());		 // 서버 포트, ip
		System.out.println("server ip: " + client.getInetAddress());
		System.out.println("메세지 입력 종료(bye)");
		
		// stdin.readLin()이 키보드로부터 입력받는 거라 
		while((input = stdin.readLine())!=null) {
			if(input.equals("bye")) break;
			out.println(input);		// 서버로 데이터 전송
									// out의 목적지: 서버
			out.flush();			// 버퍼를 비워줌. => 버퍼의 내용 강제 전송
			// br.readLine() : 서버에서 데이터를 수신
			System.out.println("server echo: "+br.readLine()); // 서버로부터 데이터를 수신
			System.out.println("메세지 입력");
			
		}
		out.close();
		br.close();
		stdin.close();
		client.close();
	}
}
