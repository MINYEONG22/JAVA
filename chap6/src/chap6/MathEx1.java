package chap6;
/*
 *	멤버 메서드(함수, Function) 
 * 
 * 		메서드 구성
 * 		
 * 		[접근 제어자] [제어자] 리턴타입 메서드이름 (매개 변수 목록) 	=> 메서드의 선언부
 * 			//[접근 제어자] [제어자]는 생략 가능
 * 		{												=> 메서드의 구현부: 알고리즘 부분
 * 		}
 * 
 * 		리턴타입: 메서드 종료 후 전달되는 값이 자료형
 * 			   void: 값의 전달이 없음.
 * 
 * 		매개변수: 메서드가 호출될 때 필요한 값의 자료형과 변수명 목록
 *
 *		return 예약어: 메서드를 강제로 종료. 
 *					 리턴 타입의 void인 경우 생략 가능, 메서드의 마지막 블럭 }를 만나면 메서드 종료돼서 굳이 return 필요 없음.
 *					 리턴 타입이 void가 아닌 경우: 생략 불가. 반드시 써야함.
 *					 return 리턴값;
 *
 * 		추상 메서드: 메서드 중 선언부만 존재하는 메서드
 * 
 */

class Math1 {
	
	int add1(int a, int b) {			// 리턴 필수
		return a+b;
	}
	long add2(int a, int b) {			// 리턴 필수
		return a+b;		
						
	}
	void add3(int a, int b) {			// void 리턴 없어도 가능.
		System.out.println(a+b);
		return;							// 써도 되지만 생략 가능
	}
	
}
public class MathEx1 {		// 구동 클래스: main 메서드를 멤버로 가지고 있는 클래스

	public static void main(String[] args) {	//
		// TODO Auto-generated method stub

		Math1 m1 = new Math1();
		
		int a1 = m1.add1(10, 20);
		System.out.println(a1);
		
//		int a2 = m1.add2(10, 20);		// a와 b는 int, 리턴값은 int인데, long으로 인식
//		System.out.println(a1);			
		// 해결방법	
		long a2 = m1.add2(10,20);		// long타입으로 받아야함
		System.out.println(a2);
		
//		int a3 = m1.add3(10,20);		넘겨줄 게 없음. void
		m1.add3(10, 20);				// 호출하는 형식으로 해야함.
										// 34번에서 출력한 값이 나옴
	}

}
