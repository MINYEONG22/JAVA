package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {
	public static void main(String[] args) {
		String source = "핸드폰: 010-1111-1111, 집: 02-123-5678, 이메일: regular@aaa.bbb, 계좌번호:301-01-123456";
		/*
		 	()	: 그룹
		 	0\\d{1,2} 	:	0으로 시작, 숫자가 1개 ~ 2개인 데이터를 
	 		\\d{3,4}	:	숫자 3~4개인 데이터
	 		\\d{4}		: 	숫자 4개인 데이터
		 */
		String telPattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(telPattern);
		Matcher m = p.matcher(source);
		int i = 0;
		System.out.println("전화번호: ");
		while (m.find()) {
			System.out.println(++i + ":" + m.group() + " => "+ m.group(1)+ ","+m.group(2)+ ","+m.group(3));
		}

		// 이메일 형식 데이터 찾기
		// \\w+	: [0-9a-zA-Z]+		문자 1개 이상
		// 길이제한 할 수 없음. 
		i=0;
		String emailPattern = "(\\w+)@(\\w+).(\\w+)";
		System.out.print("이메일: ");
		p = Pattern.compile(emailPattern);
		m = p.matcher(source);
		while (m.find()) {
			System.out.println(++i + "개 :" + m.group() + " -> "+ m.group(1)+ ","+m.group(2)+ ","+m.group(3));
		}
		
		// 계좌번호 형식 데이터 찾기 계좌번호:301-01-123456
		i = 0;
		String accountNumber = "(\\d{3})-(\\d{2})-(\\d{6})";
		System.out.print("계좌번호: ");
		p = Pattern.compile(accountNumber);
		m = p.matcher(source);
		while (m.find()) {
			System.out.println(++i + "개 :" + m.group() + " => " + m.group(1) + "," + m.group(2)+ "," + m.group(3));
		}
		
	}
}
