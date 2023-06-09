package chap4;
/*
 *	Switch(조건값) {
 *
 *		case 값1 : 문장1;
 *				  break;
 *		case 값2 : 문장2;
 *				  break;
 *
 *		.....
 *
 *		default : 그외 문장
 *
 *	} 
 *
 *	break : switch 구문에서 빠져라. 끝내라.
 *
 * 
 */
public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;				//정수
		
		switch (score/10) {			//정수
		
			case 9 : System.out.println("A학점");		// if처럼 결과 나오면 끝나는 게 아니고, 밑으로 계속 흐름
			case 8 : System.out.println("B학점");
			case 7 : System.out.println("C학점");
			case 6 : System.out.println("D학점");
			default : System.out.println("F학점");
			
		
		}
		
		
		System.out.println("----- break 설정 -----");
		
		switch (score/10) {		
			
			case 10 :										
			case 9 : System.out.println("A학점"); break;		// break; 로 막아줌
			case 8 : System.out.println("B학점"); break;		// 무조건 사용해야하는 건 아니지만 알고리즘에 따라서, 대부분 사용 함
			case 7 : System.out.println("C학점"); break;
			case 6 : System.out.println("D학점"); break;
			default : System.out.println("F학점"); break;
			
			// 100점이면 /10 => 결과 10. 
			// case 10을 만들어주면 밑으로 빠지기 때문에 100점도 A학점으로 나옴
		
		}
		
		
		// 60점 이상이면 PASS, 60점 미만이면 FAIL 출력
		
		System.out.println("----- PASS, FAIL -----");
		
		switch (score/10) {		//score을 10으로 나눈 몫에따라 (case) 출력해라.
		
				case 10:
				case 9:
				case 8:
				case 7:
				case 6: System.out.println("PASS"); break;
				default: System.out.println("FAIL"); break;
		
		}
		
		
	}

}
