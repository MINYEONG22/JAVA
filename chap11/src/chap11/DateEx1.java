package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *	Date 클래스 예제 
 *	SimpleDateFormat : 형식화 클래스	=> java.text 패키지의 클래스
 *					   기능 1. Date 객체를 형식화 된 문자열로 변경.
 *						ex) String format(Date)
 *					   기능 2. 형식화 된 문자열로 이루어진 날짜 형태를 Date 객체로 변경
 *						ex) Date parse(String)
 * 날짜 format에 사용되는 문자
 * yyyy	: 년 4자리
 * MM	: 월 2자리
 * dd	: 일 2자리
 * HH	: 시 2자리
 * mm	: 분 2자리
 * ss	: 초 2자리
 * E	: 요일
 * a	: 오전/오후 표현
 * 
 */
public class DateEx1 {
	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 \t a HH시 mm분 ss초 E요일");
		System.out.println(sf.format(now));				// 대소문자 구별, 
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		// 위 아래 형식 똑같아야함 dstr이랑 띄어쓰기까지
		String dstr = "2023-12-25 10:00:00";
		Date day = null;
		try {
			day = sf2.parse(dstr); 	// parse 메서드는 반드시 예외처리 필요	월은 13 14로 되면 안 되니까 예외처리 해줘야함
		} catch (ParseException e) {
			e.printStackTrace();
		}	
		System.out.println(day);
		
		// day라고하는 날짜를 2023-12-25 월요일이라는 형식으로 출력
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd E요일");		// 위 아래 형식 똑같아야함 dstr이랑 띄어쓰기까지	
		System.out.println(sf3.format(day));
		
	}
}
