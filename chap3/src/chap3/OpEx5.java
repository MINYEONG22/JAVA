package chap3;
/*
 *	비트연산자: &(and), |(or), ~(not), ^(xor) 
 * 
 * 
 * 
 * 
 */
public class OpEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(6 & 3);
		//	   64  32 16  8 4 2 1		
		// 6:  0   0   0  0 1 1 0
		// 3:  0   0   0  0 0 1 1
 		// &   0   0   0  0 0 1 0 => 2		비트 바꿔서 둘 다 1인 거 결과 
		
		System.out.println(6 | 3);
		
		//	   64  32 16  8 4 2 1		
		// 6:  0   0   0  0 1 1 0
		// 3:  0   0   0  0 0 1 1
 		// |   0   0   0  0 1 1 1 => 7 
		
		System.out.println(6 ^ 3);			// XOR: 배타적인 OR, 숫자가 다른 경우 1, 같은 경우 0
		
		//	   64  32 16  8 4 2 1		
		// 6:  0   0   0  0 1 1 0
		// 3:  0   0   0  0 0 1 1
 		// ^   0   0   0  0 1 0 1 => 5
		
		
		System.out.println(~10);			// 0과 1을 바꿈. 0 => 1, 1=>0
		//	   64  32 16  8 4 2 1		
		// 10: 0   0   0  1 0 1 0
 		// ~   1   1   1  0 1 0 1 	=> 부호비트가 1이면 음수, 부호비트가 0이면 양수, 맨 앞이 부호비트
		// => 음수는 2의 보수로 표현, 	보색처럼... 보수,
		
		// 10의 보수
		// 2의 보수: 1의 보수 +1
		// 10의 보수는 7, 그 의 보수는 3, 그의 보수는 원래 숫자 10
		// 보수의 보수는 원래 숫자
		// 1110101 => 어떤 수의 2의 보수,
		// ?의 2의 보수의 보수 => ?
	
		// 11110101 의 1의보수
		// 00001010
		// 2의 보수: 00001010 +1
		// 00001011 => 11
		// 부호 1이라 마이너스 => -11
		
		// => 음수는 2의 보수로 표현한다~
		
		System.out.println("true & true: "+ (true & true));
		System.out.println("true & false: "+ (true & false));
		
		
	}

}
