package chap3;

/*
 * 	단항연산자: 연산자의 피연산자가 한 개인 연산자.
 * 
 * 	1. 증감연산자 : ++, --
 * 		++ : 변수의 값을 1 증가
 * 		-- : 변수의 값을 1 감소
 * 
 * 
 * */

public class OpEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5, y=5;
		
		x++;		// ++, -- 뒤에 붙는 거, 후위형
		y--;
		
		System.out.println("x=" + x + ", y=" + y);
		
		
		// 앞에 붙을 수도 있음, 전위형
		
		++x;
		++y;
		
		System.out.println("x=" + x + ", y=" + y);
		
		
		
		System.out.println("----------------------------------");
		System.out.println("후위형과 전위형의 차이");
		
		// 후위형과 전위형의 차이
		x=y=5;		// x와 y의 값에 전부 5를 대입해라
		
		y = ++x;				// 먼저 x의 값을 먼저 증가 시켜라 =>6, 6을 y에 집어 넣어라 ( = 대입 연산자)
		System.out.println("x=" + x + ", y=" + y);
		
		
		y = x++;				// 후위형은 우선순위가 가장 낮음, x의 값을 먼저 y에 넣은 뒤 = > 6, x를 증가시켜라 =>7
		System.out.println("x=" + x + ", y=" + y);
		
		System.out.println("x=" + x++);		// x=7,		화면에 이미 "x="+ => 7을 출력하고 ++(증감) 돼서 8,
		System.out.println("x=" + ++x);		// x=9,		8에서 ++ (증감) 되고 => 9 출력
		
		
		System.out.println("----------------------------------");
		
		int x2 = 2, y2 = 1;
		
		x2++;
		y2++;
		
		System.out.println(x2+"x"+y2 +"="+ x2*y2 );
		
	
	}

}
