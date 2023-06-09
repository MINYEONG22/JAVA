package chap7;
/*
 *	final 변수 : 변경 불가 변수 => 상수. const 예약어 사용 안 함. 
 *		- final 변수도 한 번은 초기화 가능	
 *		    └ 객체별로 다른 상수값이 가능하게 하기 위해서
 *		- 명시적 초기화가 되면 변경 불가 
 * 
 */
class FinalValue {
	final int NUM;			// 상수값 초기화 무조건 필요 -- 이쪽에서 초기화하면 생성자에선 초기화 불가.
							// 명시적 초기화. - 명시적 초기화가 되면 생성자에서 변경 못 함
	FinalValue(int num) {
		NUM = num;			// 생성자에서 한 번 초기화 가능. 객체별로 다른 상수값 가능함
	}
}
public class FinalValueEx {

	public static void main(String[] args) {
		
		final int NUM = 100;			// 객체
//		NUM = 200;		// 변경 불가 변수, 변경 안 됨. 오류.
	
		FinalValue f1 = new FinalValue(100);
//		f1.NUM = 200; 	// 변경 불가 변수. 오류.
		FinalValue f2 = new FinalValue(200);
		System.out.println(f1.NUM);
		System.out.println(f2.NUM);
		
		//final 변수 배열
		final int arr[] = {10,20,30,45,50};	 // 요소값들은 변경 가능
		arr[0] = 100;
		arr[1] = 200;
//		arr = new int[5];		// 상수값 변경 불가. arr 이 상수임.  
	
	}

}
