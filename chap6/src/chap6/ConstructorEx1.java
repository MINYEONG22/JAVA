package chap6;
/*
 *	생성자 예제 
 *  - 생성자란 객체화 시 호출되는 매소드
 * 	- 생성자 없이 객체 생성은 불가함.
 * 	- 생성자의 주요 기능은 인스턴스 변수의 초기화를 담당.
 *  - 생성자는 클래스의 인스턴스 멤버임.
 *  - 오버로딩이 가능함. => 다른 매개 변수를 가지고 있는 생성자가 여러 개 존재 가능
 *  
 *  메모리 할당은 new가 함.
 *  
 *  기본생성자: 클래스 내부에 생성자를 구현하지 않으면 컴파일러가 자동으로 추가해줌.
 *  	public 클래스명(){
 *  
 *  	}
 *  
 *  생성자의 구현방법
 *  1. 생성자의 이름은 class명과 같다.
 *  2. 리턴타입이 없다. void도 기술하지 않는다.
 *  
 */
class Number1 {			  			// 생성자가 구현되지 않음. 기본 생성자가 제공이 됨. int 기본 생성자 0
	int num;
}
class Number2 {
	int num;
	Number2(int n) {				// ┐ 생성자. return 타입 없음
		num = n;					// │ 객체 생성 시, 정수값을 넣어서 생성해라.
	}								// ┘ 
}
public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();		// new Number1() 부분이 생성자
		/*
		 *	new 예약어 기능
		 *	1. 메모리 할당.
		 *	2. 기본값으로 초기화
		 *	3. 생성자 호출 => 클래스에 구현 된 생성자 형태로 출력해야함 
		 */
		Number2 n2 = new Number2(10);	// 위에 생성자의 영향으로 정수값을 넣어서 생성해야함. 	
		
		System.out.println(n1.num);
		System.out.println(n2.num);
	}

}
