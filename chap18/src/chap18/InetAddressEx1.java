package chap18;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*
 *	InetAddress 클래스의 생성자의 접근제한자: default
 *	 									└ java.net 패키지에서만 가능
 *										  ∴ new InetAddress()로 객체 생성 불가
 *
 *	 객체 생성을 위한 static 메서드
 *		1. InetAddress getByName(도메인 이름)
 *			└ 리턴
 *		2. InetAddress[] getAllByName(도메인 이름) : 같은 도메인을 쓰고 있는 다른 물리적인 서버의 주소값을 배열로 
 *		3. InetAddress getLocalHost(): 내 컴퓨터의 IP 주소
 *		4. InetAddress getByAddress(byte[])
 */	
public class InetAddressEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.gdu.co.kr");
		System.out.println("hostname: "+ ip.getHostName());
		System.out.println("hostaddress: " +ip.getHostAddress());	// ip 주소값
		byte[] ipAddr = ip.getAddress();	// ip 주소값을 4자리의 byte 배열형으로 리턴
		for(byte b : ipAddr) { // byte = -128~127 값까지 표현, 
			System.out.print(((b<0)?256+b:b)+".");
							// └ 127까지 넘어가면 양수로 바꾸려고 256 더해줌
		}
		System.out.println();
		InetAddress[] ips = InetAddress.getAllByName("www.amazon.com");
		for(InetAddress a : ips) {
			System.out.println("IP 주소: "+a);
		}
		System.out.println("내 컴퓨터: "+ InetAddress.getLocalHost());
		
	}
}
