package chap11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 *	년도와 월을 입력 받아서 년월의 마지막 일자와 요일을 출력하기 
 */
public class Exam6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//2월 마지막 날 => 3월을 구해서 하루를 빼

		System.out.println("네 자리수 연도와 두 자리수 월을 입력하세요");
		
		int y = scan.nextInt();
		int m = scan.nextInt();
		
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
		Date day = null;
		try {
			day = sf.parse(y+"-"+(m+1)); //mm에서 +1달
		} catch (ParseException e1) {

		}
		
		//  -1일
		day.setTime(day.getTime()-(1000*60*60*24));
//		System.out.println(sf.format(day));
		System.out.println(y+"년 "+m+"월의 마지막 날은 "+new SimpleDateFormat("yyyy-MM-dd E요일").format(day)+"입니다.");

		
		
	}
}
