package chap4;
/*
 *	컴퓨터에서 임의의 수를 받아 상품 선택하기 
 * 
 * 
 * 
 */
public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int)(Math.random() * 10) +1 ;	
		
		// Math.random() : 임의의 수 = 난수 	|| 난수를 발생시켜주는 수. 
		// 0 <= x < 1.0 의 x(임의의 수 = 난수)를 리턴 
		// 0 <= x < 1.0 -> 기본값
		
		// Math.random() * 10 
		// 0 <= x < 10.0
		
		// (int)라는 형변환 연산자
		// (int)(Math.random() * 10) 
		// 정수형태로 바뀌면서 10.0보다 작은 수였으니까 9로 바뀜
		// 0 <= x <= 9
		
		// 1을 더해주면 양쪽으로 다 + 1
		// (int)(Math.random() * 10) +1
		// 1<= x <= 10으로 변경
		
		
		switch(num) {
		
			case 1 : 
					 System.out.println("축하합니다. 자전거 당첨입니다.");
				 	 break;
			case 2 : 
					 System.out.println("축하합니다. USB 당첨입니다.");
			 		 break;
			case 3 : 
					 System.out.println("축하합니다. 키보드 당첨입니다.");
			 		 break;
			default: 
					 System.out.println("다음 기회에...");		
		
		}
			
		
		
		
		
	}

}
