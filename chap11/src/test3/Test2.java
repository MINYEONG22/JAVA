package test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2023-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2023-01-03
2023-01-03 -2023-01-01 일자의 차이 : 2  
 */
public class Test2 {
	public static void main(String[] args) {
			
		System.out.println("날짜를 입력하세요");
		
		Scanner scan = new Scanner(System.in);

		Pattern p = Pattern.compile("(\\d{4})-(\\d{1,2})-(\\d{1,2})");	
		String day1 = scan.next(p);
		String day2 = scan.next(p);

		String date1 = day1;
		Matcher m = p.matcher(date1);
		String date2 = day2;
		Matcher m2 = p.matcher(date2);
		
	
		while (m.find()) {
			
			
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			
			int year = Integer.parseInt(m.group(1));
			int mon = Integer.parseInt(m.group(2));
			int dd = Integer.parseInt(m.group(3));
			Calendar cal = Calendar.getInstance();
			cal.set(year, mon, dd); 
		
			int year2 = Integer.parseInt(m2.group(1));
			int mon2 = Integer.parseInt(m2.group(2));
			int dd2 = Integer.parseInt(m2.group(3));
			Calendar cal2 = Calendar.getInstance();
			cal2.set(year2, mon2, dd2); 
			
			
			Date firstDay = null;	
			Date seconDay = null;
			
			try {
				firstDay = sf.parse(date1); 
				seconDay = sf.parse(date2); 
			} catch (ParseException e1) {
	
			}
			
			System.out.println(date1+" "+date2+"의 날짜 차는");
		}
		
		
		
	}
}
