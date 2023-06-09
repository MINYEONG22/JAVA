package chap11;

import java.util.Calendar;
import java.util.Date;

// Calendar 클래스로 날짜 설정하기
public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();	//객체 생성
		// 2023-12-31로 설정
		cal.set(2023, (12-1), 31);
		System.out.println("날짜: "+cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DATE));
	
		// 2023-12-31로 ?요일 로 출력
		String[] week = {"","일","월","화","수","목","금","토"}; 
		// 요일은 1:일요일, 2: 월요일 ~ 7:토요일
		// 배열 index는  0부터 시작 => 0은 비움 
	
		System.out.println("날짜: "+cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DATE)+" "
		+ week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		// 공백 안 넣으면 -1 해주면 됨.
		String w = "일월화수목금토";
		System.out.println("날짜: "+cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DATE)+" "
				+ w.charAt((cal.get(Calendar.DAY_OF_WEEK))-1)+"요일");

		
		// Date 객체로 Calendar 객체를 변경
		Date now = new Date();
		now.setTime(now.getTime()+(1000*60*60*24));
		System.out.println(now);
		cal.setTime(now); // 하루 이후로
		System.out.println("날짜: "+cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DATE)+" "
				+ week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		// Calendar 객체로 Date 객체 구하기
		Date day = new Date();
		day.setTime(cal.getTimeInMillis());	// getTimeInMillis() 1970년 이후의 밀리초
		System.out.println(day);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
