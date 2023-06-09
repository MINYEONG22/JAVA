package chap18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 	이미지 파일(바이트형)도 출력 되도록 SimpleWebServerEx1.java 수정된 소스
 	
 	1. 파일을 읽ㅇ르 때 바이트형입력스트림 (InputStream)으로 읽기
 	2. 클라이언트 데이터 전송 시 바이트형 출력 스트림(OutputStream)으로 출력하기
 */
public class Exam1 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8001);
		while(true) {
			System.out.println("클라이언트 접속 대기");
			Socket client = server.accept();	
			HttpThread t = new HttpThread(client);
			t.start();
		}
	}
	static class HttpThread extends Thread {
		private Socket client;
		BufferedReader br;
		OutputStream pw;
		HttpThread(Socket client) {
			this.client = client;
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));	//요청 정보라 텍스트로 받아도 상관없음
				pw = client.getOutputStream();		
				pw.write("HTTP/1.0 200 OK\r\nContent-Type:text/html\r\n\r\n".getBytes());
																	// write는 바이트형만 -> .getByte() 해주면 됨
				//println 말고 write로 출력
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
//			BufferedReader fbr = null;
			FileInputStream fbr = null; // 바이트형

			try {
				String line = br.readLine();	// 클라이언트에서 전송해준 요청 데이터
				// br: 브라우저에서 전송(수신) 된 데이터 , "GET / HTTP/1.1"
				System.out.println("Http Header: "+line);
				int start = line.indexOf("/")+1;	// 위치+1
				int end = line.lastIndexOf("HTTP")-1;	// H앞 빈 문자열
				String filename = line.substring(start,end);
				// 요청 페이지
				if(filename.equals("")) {	// 파일 이름이 비어있으면
					filename = "index.html";	// index.html을 넣어라
				}								//"GET /index.html HTTP/1.1"
//				fbr = new BufferedReader(new FileReader(filename)); 
				fbr = new FileInputStream(filename);	// filename 바이트형으로 읽기
				int len =0;								
				byte[] buf = new byte[8096];
				while((len = fbr.read(buf)) != -1) {
					pw.write(buf,0,len);	
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
