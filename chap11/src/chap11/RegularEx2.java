package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 *	정규 표현식 예제 (인터넷 찾아보면 많음)
 *	.	: 문자 1개
 *	?	: 0 또는 1개
 * 	* 	: 0개 이상. 없어도 되고 여러개 있어도 되고. 모두.
 * 	+	: 1개 이상. 없으면 안 됨.
 * 	^[]	: 문자열의 시작	
 * 	[^]	: 지정된 문자를 제외
 * 	|	: 또는, or
 * 	&	: and
 * 	()	: 그룹
 * 	\s	: 공백 1개
 * 	\S	: 공백이 아닌 거
 * 	\d	: 숫자 한 개	[0-9] = \d
 * 	\D	: 숫자가 아닌 문자
 * 	\w	: 특수문자가 아닌 거	[0-9a-zA-Z]
 * 	\W	: 특수문자
 * 	{n}	: 문자 n개
 * 	{n,}: 문자 n개 이상
 * 	{n,m}: n 개 ~ m 개 까지
 */
public class RegularEx2 {
	public static void main(String[] args) {
		String[] patterns = {".","[a-z]?","[0-9]+","^[0-9]","[a-z]*","[a-z]+",
							 "02|010","\\s","\\S","\\d","\\w","\\W"};	
		String[] datas = {"","a","1","12","012","abc","02"," ","A","5","a","*",};
		for(String d : datas) {
			if(d.equals("")) {
				System.out.print("빈문자 \"\" 의 패턴 => ");
			} else if (d.equals(" ")) {
				System.out.print("공백문자 \"\" 의 패턴 => ");
			} else {
				System.out.print(d + " 문자의 패턴 => ");
			}
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(d);
				if(m.matches()) {
					System.out.print(p+", ");
				}
			}
			System.out.println();
		}
	}
}
