package chap6;
/*
 *	선언 위치에 따른 변수의 종류
 *
 *					선언위치		선언 방법				메모리 할당 시점							메모리할당 위치
 * 	클래스 변수:		클래스 내부		Static int num;		클래스 정보 로드 시(main보다 먼저 할당)		클래스 영역
 * 	인스턴스 변수:		클래스 내부		int num;			객체화 시								힙 영역
 * 	지역 변수:			메서드 내부		int num;			선언문 실행 시							스택영역
 * 
 * 	클래스 변수: 객체화와 관련이 없음. 모든 객체의 공통변수로 사용.
 * 			  클래스명.변수명 호출함 ex)Car.width	Car.height
 *	
 *	인스턴스(객체) 변수: 반드시 객체화가 돼야함. 객체화 될 때 메모리를 할당 받음.	// 객체화 되기 전엔 정보로만 있음
 *					참조변수명.변수명		ex)car1.color	car1.num
 * 	
 * 	지역 변수: 선언 된 매서드 내부에서만 사용 가능. 선언문 실행 이후에만 사용 가능함.
 * 			반드시 초기화가 되어야 함.
 * 			매개 변수는 지역변수로 들어감.
 */

class Car {
	String color;						// 인스턴스(객체) 변수
	int num;							// 인스턴스(객체) 변수
	static int width = 200;				// 클래스 변수 - Car car1 = new Car() 하기 전에 바로 클래스 영역에 메모리 할당 함
	static int height = 120;			// 클래스 변수	- 객체랑은 상관이 없음
	public String toString() {
		// 객체의 문자열로 표현하기 위한 메서드. 객체의 문자열화, 반드시 public이 있어야 함
		// 참조 변수 명만 출력하면 자동으로 호출 됨
		return color + ":" + num + "(" + width + "," + height +")"; 
	}
}

public class CarEx1 {
	public static void main(String[] args) {	//	String[] args 이런 거 매개변수 - 지역 변수로 들어감

		System.out.println("자동차의 크기:" + Car.width + "," + Car.height);	// class Car의 값대로 나옴
											// 클래스 변수 - Car car1 = new Car() 하기 전에 바로 클래스 영역에 메모리 할당 함
		Car car1 = new Car();				// car1: 지역변수. 출력하는 순간 메모리에 할당 됨.
		car1.color = "White";				// 인스턴스 변수 변경되고 클래스 변수 그대로 출력
		car1.num= 1234;
		System.out.println("car1: "+car1);	// 참조변수값 출력 시 toString() 메서드 부분이 출력 됨. 
											// car1.toString()으로 적어도 됨.
		
		Car car2 = new Car();				// car2: 지역변수. 출력해야 메모리에 할당 됨
		car2.color = "Black";
		car2.num = 3456;
		System.out.println("car2: "+car2);
		
		car1.width = 300;					// width와 height는 car1이 아니고 class Car에 있어서 
		car1.height = 150;
											// car1의 width 와 height를 변경해도 
		System.out.println("car1: "+car1);	// static 변수의 특징으로 car2까지 변경
		System.out.println("car2: "+car2);	// 객체와는 상관없이
	}

}
