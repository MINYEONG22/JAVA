package chap18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Echo Server 프로그램
 * : 클라이언트 프로그램에서 받은 데이터를 그대로 클라이언트로 전송
 *  
 */
public class EchoServerEx1 {
	public static void main(String[] args) {
		try {
			// ServerSocket: 서버 기능 소켓 5000번 포트를 OS로부터 할당 받아 대기
			ServerSocket server = new ServerSocket(5000);	// 포트 번호 5000
			while(true) {
				System.out.println("클라이언트 접속 대기");
				Socket client = server.accept();	// 서버는 Socket 객체를 기다림 Socket은 클라이언트가 만듦
					// client가 생성한 socket 객체
				// Thread 객체에 Socket객체를 전달하여 Thread에서 해당 클라이언트와 통신
				ServerThread th = new ServerThread(client);	//내부클래스 - 통신
				// 클라이언트가 서버한테 소켓을 보내줄 수 있도록
				th.start();
			} //무한반복 break 없음
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static class ServerThread extends Thread { // 통신은 ServerThread가
		private Socket client;	
		PrintWriter out;
		BufferedReader br;
		// client: 서버가 accept한 Socket 객체. => client 연결 당 하나의 소켓 객체가 생성 됨
		ServerThread(Socket client) {	//생성자를 통해서
			this.client = client;
			System.out.println("client ip: "+ client.getInetAddress());
			System.out.println("client port: " +client.getPort());
			try {
				// client.getOutputStream(): 서버 입장에서, 클라이언트로 데이터 전송 | 서버->클라이언트
				out = new PrintWriter(client.getOutputStream());	 
				// client.getInputStream()) : 서버 입장에서, 클라이언트에서 전송 된 데이터 | 클라이언트 -> 서버
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			String input;
			try {		// 서버 입장에서, 클라이언트한테 받은 데이터를 한 줄씩 읽음
				while ((input = br.readLine()) != null) {
					out.println(input); 	// 한줄씩 읽는데 print 로 하면, 라인이 안 끝나서 이상하게 읽
											// println으로 해야 한 줄씩 출력 됨
					
					out.flush();
					System.out.println("client data: "+input);
				} // 클라이언트가 없어지면 while 끝남
				br.close();
				out.close();
				client.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
