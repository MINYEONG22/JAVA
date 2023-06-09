package test3;

import java.util.Calendar;
import java.util.Scanner;

public class Test1_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월를 입력하세요");
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year,mon-1,1);
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		System.out.println("\t"+year + "년" + mon + "월");
		System.out.printf("%1s%3s%3s%3s %3s%3s%3s %3s\n",
				          " ,일,월,화,수,목,금,토,일".split(","));
		for(int i=1,day=1;day<=lastday;i++) {
			if(i < firstWeek) System.out.printf("%4s"," ");
			else System.out.printf("%4d",day++);
			if(i%7==0)System.out.println();
		}
	}

}
