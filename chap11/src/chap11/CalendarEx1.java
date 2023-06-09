package chap11;

import java.util.Calendar;

/*
 *	Calender 클래스 예제 
 * 	 └ 추상클래스: 객체화 불가 => new Calender() 형식 불가
 * 
 * 	static 메서드: getInstance() 메서드를 통해서 객체화
 * 
 */
public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();		// 현재 일 시를 리턴
		
		System.out.println(today);
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println((today.get(Calendar.MONTH)+1)+"월");
		// 0:1월, 1:2월 ~ 11월:12월
		System.out.println(today.get(Calendar.DATE)+"일");
		System.out.println(today.get(Calendar.DAY_OF_WEEK)+"요일");
		// 1:일요일, 2: 월요일 ~ 7:토요일
		
		System.out.println("년도 기준 몇째주? "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월 기준 몇째주? "+today.get(Calendar.WEEK_OF_MONTH));
	
		System.out.println("월 기준 일자: "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("년 기준 일자: "+today.get(Calendar.DAY_OF_YEAR));
		
		// 월 기준 몇번째 요일인지
		System.out.println("월 기준 오늘의 요일은: "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"번째 주");
		
		// 오전(0)/오후(1)
		System.out.println(today.get(Calendar.AM_PM));
		
		System.out.println("0~11시: "+today.get(Calendar.HOUR)+"시");				// 시간 0~11시
		System.out.println("0~23시: "+today.get(Calendar.HOUR_OF_DAY)+"시");		// 시간 0~23시
		System.out.println(today.get(Calendar.MINUTE)+"분");						// 0~59
		System.out.println(today.get(Calendar.SECOND)+"초");						// 0~59
		System.out.println(today.get(Calendar.MILLISECOND)+"밀리초");				// 0~999초
		
		//타임존 밀리초로 알려줌	시간대를 밀리초로 리턴		표준시간대
		System.out.println("TimeZone:(-12~12): "+today.get(Calendar.ZONE_OFFSET)/(60*60*1000));
		System.out.println("이번달의 마지막 일자: "+today.getActualMaximum(Calendar.DATE));
		
		
		
		
		
		
	}
}
