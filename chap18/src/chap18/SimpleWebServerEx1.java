package chap18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *	간단한 웹서버 프로그램
 *	브라우저에서 요청한 데이터를 처리 
 */
public class SimpleWebServerEx1 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8000);
		while(true) {
			System.out.println("클라이언트 접속 대기");
			Socket client = server.accept();	
			// client: 브라우저. url: http://localhost:8000
			HttpThread t = new HttpThread(client);
			t.start();
		}
	}
	static class HttpThread extends Thread {
		private Socket client;
		BufferedReader br;
		PrintWriter pw;
		HttpThread(Socket client) {
			this.client = client;
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				pw = new PrintWriter(client.getOutputStream());
				pw.println("HTTP/1.0 200 OK\r\nContent-Type:text/html\r\n\r\n");
				/*
				 *  응답 헤더 전송
				 *  html err 코드. 200번대면 정상이다 라는 걸 알려줘야함.
				 *  html을 보낼 거다 라는 명령어
				 *  HTTP/1.0: 응답 버전
				 *  200 : 응답 코드 (정상처리다)	- 500: 오류 발생, 404: 해당페이지 없음
				 *  Content-Type:text/html : 전송할 데이터가 html 형식이다.
				 * 								└ 브라우저는 html 번역기 준비.
				 * 	text타입을 html로 변경해라
				 * 	text/html : 문서의 종류 표현 => MIME 타입
				 */
				
			} catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("server ip: "+ client.getLocalAddress());
			System.out.println("server port: "+client.getLocalPort());
			System.out.println("client ip: "+client.getInetAddress());
			System.out.println("client port: "+client.getPort());
		}
		@Override
		public void run() {
			BufferedReader fbr = null;
			try {
				String line = br.readLine(); // 클라이언트에서 전송해준 요청 데이터
				// br: 브라우저에서 전송(수신) 된 데이터 , "GET / HTTP/1.1"
				System.out.println("Http Header: "+line);
				int start = line.indexOf("/")+1;	// 위치+1
				int end = line.lastIndexOf("HTTP")-1;	// H앞 빈 문자열
				String filename = line.substring(start,end);
				// 요청 페이지
				if(filename.equals("")) {	// 파일 이름이 비어있으면
					filename = "index.html";	// index.html을 넣어라
				}								//"GET /index.html HTTP/1.1"
				fbr = new BufferedReader(new FileReader(filename)); // filename 읽기
				String fline = null;
				while((fline = fbr.readLine()) != null) {
//					System.out.println(fline);
					pw.println(fline);	// 출력 스트림. 파일 읽은 한 줄 한 줄을 브라우저로 출력해라.
										// 브라우저의 소스 보기로 확인 가능
					pw.flush();
				}
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(fbr != null) fbr.close();
					if(br != null) br.close();
					if(pw != null) pw.close();
					if(client != null) client.close();
				} catch(IOException e) {
					
				}
			}
		}
	}
}
