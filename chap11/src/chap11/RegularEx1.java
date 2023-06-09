package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
	public static void main(String[] args) {

		String[] data = {"bat","baby","bouns","cA","ca","co","c.","car","combat",
							"count","cTT","data","disk","c"};
		
		Pattern p = Pattern.compile("c[a-zA-Z]+");	// 조건1. c로 시작
													// 조건2. [a-zA-Z] 대소문자를 모두 포함하는 알파벳
													// 조건3. ?	: 0 또는 1개 - 없거나 한 개 있는 애 
													//		 *	: 전부 
													// 		 +	: 한 개 이상						=> 조건3. 정규 표현식
		for(String s : data) {						// data s에 다 넣어주고,
			Matcher m = p.matcher(s);				// 만든 p 패턴이랑 매치시켜서 조건에 맞으면
													// c.은 뒤에 .이라서 x, car, combat, cTT은 1개 이상이라 x
			if(m.matches()) {
				System.out.print(s + ",");			// cA,
			}
		}
		System.out.println();
		
		String names = "홍길동,	김삿갓,이몽룡	,	성춘향	,	임꺽정";
		String[] arr = names.split("\\s*,\\s*");	// 공백* 전부	앞에 공백 , 뒤에 공백까지를 잡아서 split : 정규 표현식(모든 언어 공통)
		for(String s : arr) {
			System.out.println(s);
		}
		
	}
}
