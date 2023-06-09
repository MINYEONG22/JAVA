package chap6;
/*
 *	추상화: 클래스 생성 단계
 *
 *	클래스: 사용자 정의 자료형	- 속성: 멤버 변수 
 * 						- 기능: 멤버 메서드 
 * 
 * 	객체화: 클래스 정보를 이용하여 메모리를 할당 받는 과정
 * 		  멤버(멤버 변수, 멤버 메서드)값이 메모리에 할당됨.
 * 
 * 	하나의 참조변수는 한 개의 객체만 참조가능함.
 *  하나의 객체는 여러개의 잠초변수가 잠조 가능함.
 *  참조변수가 참조하고 있지 않은 객체는 사라짐. 
 * 
 */

class Phone {				// class 자체는 정보, 정보만 있고 값은 없음. 메모리에 할당이 되지 않음. 
	String color;			// 폰의 색상
	boolean power;			// 켜졌나 꺼졌나
	String no;				// 핸드폰 번호
//	여기까지 멤버 변수이면서 인스턴스 변수
	
	void power() {			// 메서드 power()와 boolean power은 별개
//  void 리턴값
							// 멤버 변수에 있는 power 값을 true면 false로, false면 true로 
		power = !power;		// 현재 power의 형태를 반대로 바꿔라
	}						
	void send(String no) {	// send, receive에 있는 no는 지역변수, 멤버 변수 아님. 밑에서 설정해줘야함.
		System.out.println(no+"로 전화 거는 중");
	}
	void receive(String no) {
		System.out.println(no+"에서 전화 받는 중");
	}
//	여기까지 멤버 메서드
	
}

// 클래스 다이어그램

public class PhoneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p1 = new Phone();		// 객체화: 메모리를 할당받아줌. 여기서부터 메모리에 할당 됨.
				//멤버변수 초기값 String:null, boolean:false, String:null
				//멤버 메서드 power(), send(), receive()를 힙라인에 넣어줌
		/*
		 *	new 예약어 기능	: 객체화
		 * 	1. new가 나오면 힙영역에 메모리를 할당. => 객체(값을 여러개 가지고 있으면서, 참조변수에 의해 참조되고 있는 거)
		 * 									  변수(값이 하나밖에 없고, 기본자료형에 선언 된 거)
		 * 	2. 멤버변수를 기본값으로 초기화 함.
		 *  	기본값 => 숫자: 0, boolean: false, 참조 자료형 or 참조 변수: null
		 *  3. 생성자 호출
		 *  
		 *  
		 *  =(대입연산자)를 통해 객체의 참조 값을 참조 변수에 저장 
		 */
		
		p1.color = "검정";				// 검정으로 넣어		//p1 지역변수 (메서드 내부에 있는 거, 지역변수는 매개 변수를 포함함)
		p1.power = true;				// true로 넣어
		p1.no = "01012345678";			// "번호" 넣어
		System.out.println(p1.color+","+p1.power+","+p1.no );
		
		System.out.println();
		
		p1.send("01011115555");			// send()라는 메서드 호출해 String no 값 "번호"
		p1.receive("01011115555");
		p1.power();						// 선언되지 않았는데 에러 x, 메서드에 없지만, 변수로 찾아가서 
		System.out.println(p1.color+","+p1.power+","+p1.no );
		
		
		System.out.println();
		
		Phone p2 = new Phone();
		
		p2.color = "분홍";
		p2.power = true;		
		p2.no = "01011445566";
		System.out.println(p2.color+","+p2.power+","+p2.no );
		
		p2 = p1;		// p2값을 p1으로 바꿈
		System.out.println(p2.color+","+p2.power+","+p2.no );
		
	
	}

}
