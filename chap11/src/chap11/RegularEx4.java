package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx4 {
	public static void main(String[] args) {
		String data = "번호:1, 이름:홍길동, 국어:100, 영어:70, 수학:85, 과학:95";
		// 원래 \d가 맞는데 \\ 특수문자 없애줌
//		Pattern p = Pattern.compile("\\d{2,3}");	// 두 세자리 숫자 번호 1은 포함 안 됨
		Pattern p = Pattern.compile("[0-9]{2,3}");	// [0-9]도 숫자고, \d도 숫자고
//		Pattern p = Pattern.compile("100");			// 100인 애 가지고 와.
		Matcher m = p.matcher(data);				// p패턴에 맞는 data 찾을 것
		
		int sum = 0;
		int i = 0;
		
		while(m.find()) {							// m패턴에 일치하는 문자열 찾기.find()
			System.out.print(m.group()+", ");		// 찾은 데이터 전부 가지고 오기
			i++;									// data의 인덱스 부터 ++	몇 개 찾았는지 찾기
			sum += Integer.parseInt(m.group());		// 문자열 int형으로 바꿔서 sum에 더해줌
		}
		System.out.println("총점: "+sum +", 평균:"+ (double)sum/i);
	}
}
