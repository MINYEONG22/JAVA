package chap3;

/*
 * 	대입연산자: =, +=, -=, *=, ....
 * 
 * 	a = 10 : a에 10을 대입
 * 	a == 10 : a는 10이다.	결과:true|false
 * 
 *  a+b = 10  (x) : 대입연산자의 왼쪽은 반드시 변수여야함.
 *  10 = a	  (x) : 대입연산자의 왼쪽은 반드시 변수여야함.
 *  a = 10	  (o) : lvalue는 변수만 가능함
 *  a = 10+20 (o) : rvalue는 변수, 상수, 수식 모두 가능
 *  
 */


public class OpEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		System.out.println(num);
		
		num += 10;	// 원래 num의 값에 10을 더해서 다시 num에 대입해라
//	=	num = num + 10;
		System.out.println(num);
		
		num -= 10; 					// 110에서 10을 빼서 다시 대입해라
		System.out.println(num);
		
		num *= 5;					// 100에서 5를 곱해서 다시 대입해라
		System.out.println(num);
		
		num /= 10;					// 500을 10으로 나눠라
		System.out.println(num);
			
		num %= 3;					// 50을 3으로 나눈 뒤 나머지를 대입해라
		System.out.println(num);
		
		num += 2+3;					// 2에 2+3을 더해서 대입해라
		System.out.println(num);	
		
		
		System.out.println("--------byte--------");
		
		byte b = 1;
		System.out.println(b);		// 1
		
		b *= 2;						// 변수값 
		
/*		b = b*2;					에러, b값을 가지고 와서 곱셈을해서 다시 b에 넣어야해서... 
									byte와 int의 계산 -> int */
		
		System.out.println(b);		// 2
		
		b *= 2;
		System.out.println(b);		// 4
		
		b *= 2;
		System.out.println(b);		// 8
		
	}

}
