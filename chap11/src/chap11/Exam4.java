package chap11;
/*
 *	double round (double 실수값, int 자리수) 
 *	double truncate (double 실수값, int 자리수)
 *
 */
public class Exam4 {
	public static void main(String[] args) {

		System.out.println(round(3.1215,1));
		System.out.println(round(3.1215,2));
		System.out.println(round(3.1215,3));
		
		System.out.println(truncate(3.15345,1));
		System.out.println(truncate(3.15345,2));
		System.out.println(truncate(3.15345,3));
		System.out.println(truncate(3.15345,4));
		
	}

	private static double round(double d, int i) {
		
		String sf = String.format("%."+i+"f", d);  // 자체가 반올림 해줌
		// %.+i+f: 소숫점 이하 2자리까지 표시 (자동 반올림)
		
		
		return Double.parseDouble(sf);
	
		// String 연산자는 대입 연산자로, 객체화가 가능.
	}

	private static double truncate(double d, int i) {
		
		double num = Math.pow(10,i);
		return (int)(d*num)/num;
		
		// 문자열로 변경
//		String sd = d+"";
//		int dot = sd.indexOf(".");
//		return Double.parseDouble(sd.substring(0,dot)+sd.substring(dot,dot+1+i));
																	// 내 앞에까지 
	}
}
