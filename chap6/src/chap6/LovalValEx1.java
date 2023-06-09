package chap6;
/*
 *	지역변수는 반드시 초기화 되어야 한다. 
 *  
 *  매개변수도 지역변수이다.
 *   -- 초기화가 되면서 실행 됨. 
 *   
 */
public class LovalValEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;						// 지역변수, 변수 선언
//		System.out.println(num);		// 초기화 하지 않은 지역변수 출력 불가
		boolean b = true;
		if (b) {
			num = 100;
		} else {
			num = 200;
		}
		System.out.println(num); // else 넣어주면 가능 초기화가 돼서 출력 됨
		
		
		int num2 = 0;		// 선언과 동시에 초기화 해주면 출력 가능
		
		if (b) {
			num2=100;
		}
		System.out.println();
	
		
		System.out.println(num2);
		String grade="F";					  // String grade = null; 로 초기화 해도 됨. null도 초기화임.
		int score = 85;
		
		switch(score/10) {
			case 9: grade ="A"; break;
			case 8: grade ="B"; break;
			case 7: grade ="C"; break;
			
//			default : grade = "F";
		}
		
		System.out.println(grade+"학점");			// score가 60점이면 값이 안 나와서 구멍이 생기니까 오류
												// default 넣어주면 score 60점 밑에도 초기화 돼서 오류 해결
												// 아니면, String grade="F" 로 먼저 초기화를 시켜줘
		
		
		
	}

}
