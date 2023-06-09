package chap3;

/*
 * 	이항 연산자
 * 	 - 산술연산자: +, -, *, /, %  		// () 괄호 안에 넣고, 부호연산자는 그냥 쓰고.
 * 				/(나누기) : 정수/정수 의 몫은 결과가 정수		
 * 				%(나머지) : 나머지의 결과는 피젯수(나누어지는 수)의 부호를 따른다.
 * 	
 */

public class OpEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10, y = 8;
		
		System.out.println("10+8= "+(x+y));
		System.out.println("10-8= "+(x-y));
		System.out.println("10*8= "+(x*y));
		System.out.println("10/8= "+(x/y));
		System.out.println("10%8= "+(x%y));
		
		// 나누기
		System.out.println("\n나누기");
		System.out.println("10/8= "+(x/y));
		System.out.println("-10/8= "+(-x/y));
		System.out.println("10/-8= "+(x/-y));
		System.out.println("-10/-8= "+(-x/-y));
		
		
		// 나머지 연산자
		System.out.println("\n나머지 연산자");
		System.out.println("10%8= "+(x%y));
		System.out.println("-10%8= "+(-x%y));
		System.out.println("10%-8= "+(x%-y));
		System.out.println("-10%-8= "+(-x%-y));
		// 나누어지는 수의 양수/음수를 따라간다고 생각.
		
	
	}

}
