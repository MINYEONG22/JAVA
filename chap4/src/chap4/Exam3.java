package chap4;
/*
 * 	1,2,3 선택하여 가위바위보 중 한 개 출력
 *  
 *  1: 가위
 * 	2: 바위
 *  3: 보
 *  
 */
public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rsp = (int)(Math.random()*3) + 1 ;
		// Math.random()
		// 0 <= x < 1.0
		// Math.random()*3
		// 0 <= x < 3.0
		// (int)(Math.random()*3)
		// 0 <= x < 2
		// (int)(Math.random()*3)+1
		// 1 <= x < 3
		
		
		switch (rsp) {
			case 1 : System.out.println("가위");
					 break;	
			case 2 : System.out.println("바위");
				     break;
			case 3 : System.out.println("보");
				     break;
//			default 생략 가능, 그 외는 나오지 않을 거니까, 나올 수도 없고... 
		}
		
		
	}

}
