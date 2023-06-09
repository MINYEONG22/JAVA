package test3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3_A {

	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890","099-2456-7980", 
				"088-2346-9870","013-3456-7890" };
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("찾고자 하는 번호를 입력하세요(종료:q)");
			String input = s.nextLine().trim();
			if (input.equals(""))
				continue;
			else if (input.equalsIgnoreCase("Q"))break;
			String pattern = input;
			Pattern p = Pattern.compile(pattern);
			int cnt = 0;
			for (int i = 0; i < phoneNumArr.length; i++) {
				cnt = 0;
				String phoneNum = phoneNumArr[i];
				String tmp = phoneNum.replace("-", "");
				Matcher m = p.matcher(tmp);
				if (m.find()) { 
					System.out.println(phoneNum);
					cnt++;
				}
			}
			if(cnt == 0)
		     	System.out.println("찾는 번호가 없습니다.");
		}		
	}

}
