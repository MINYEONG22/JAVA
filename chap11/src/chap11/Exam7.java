package chap11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// 연도와 월을 입력 받아서 년 월의 마지막 일자와 요일 출력하기 
// Calendar 객체 이용하기
public class Exam7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("네 자리수 연도와, 두 자리수 월을 입력해주세요.");
		
		int year = scan.nextInt();
		int mon = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, mon-1, 1); 							// 입력받은 년도, 월로 옮겨야하니까 설정을 해줘야함 
		
		int d = cal.getActualMaximum(Calendar.DATE);		// => 이것만 있으면 이번달의 마지막 날
		
		cal.set(year, mon-1, d); 							// 입력받은 년도, 월로 옮겨서 마지막 날 구하기
		// 0:1월, 1:2월 ~ 11월:12월
	
		String w = " 일월화수목금토";
		System.out.println(year+"-"+mon+"-"+d+" "+w.charAt(cal.get(Calendar.DAY_OF_WEEK))+"요일");
		
		System.out.println(cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DATE)+" "
				+ w.charAt(cal.get(Calendar.DAY_OF_WEEK))+"요일");
		
	}
}
