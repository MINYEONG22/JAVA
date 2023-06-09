package test3;
import java.util.Calendar;
import java.util.Scanner;
/*
년도와 월를 입력하세요
2023 02
	2023년2월
   일  월  화   수  목  금   토
               1   2   3   4
   5   6   7   8   9  10  11
  12  13  14  15  16  17  18
  19  20  21  22  23  24  25
  26  27  28
 
 *	2월 1일의 요일을 구해서 
 *	요일 앞은 공백 찍고,
 *	요일에 맞는 수부터 ++
 *	요일에 해당하는 수가 7이 되면 다음라인으로 출력
 *	마지막 날짜까지.
 * 
 * 
 */
public class Test1 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("년도와 월를 입력하세요");
//		
//		int year = scan.nextInt();
//		int mounth = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();	//객체 생성
//		cal.set(year, mounth-1, 1);
		cal.set(2023, 2-1, 1);
		String[] week = {"일","월","화","수","목","금","토"}; 
		// 요일은 1:일요일, 2: 월요일 ~ 7:토요일
		// 배열 index는  0부터 시작 => 0은 비움 
	
//		System.out.println(cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DATE)+" "
//		+ week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		System.out.println(cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월");
		
		int sta = cal.get(Calendar.DATE);
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		

		int dat = 0;

		
		for(String w : week) {
			System.out.print(w+"\t");
		}
		System.out.println();

		int dow = cal.get(Calendar.DAY_OF_WEEK);
		
		// 0: 일, 1:월, 2:화, 3:수 4:목
		
		for(int i = 0; i<dow-1; i++) {
			System.out.print("\t");
		}
			
		while(sta <= lastDay) {
			
			dat += 1;
			System.out.print(dat+"\t");		
			
			
			
			if (dat%7 ==0) {
				System.out.println();
			}
			
			
			if(dat == lastDay) {
				break;
			}
			
		}
	
		
		
		
		
		
	}
}
