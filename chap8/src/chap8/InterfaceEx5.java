package chap8;
/*
 *	jdk8.0 이전 - 인터페이스 멤버: 상수, 추상메서드만 가능
 *		   이후 - 인터페이스 멤버: 상수, 추상메서드, default, static 메서드
 * 										   => default, static은 구현부가 존재한다.
 *  default 메서드: 객체에 만들어짐 (인스턴스 멤버)	호출: 인스턴스멤버.참조변수.메서드명
 *  static 메서드: 클래스 멤버 				  	호출: 인터페이스명.메서드명
 *  
 *  인터페이스는 다중 구현이 가능함 
 *  => 구현객체에 같은 이름의 메서드(매개변수, 선언부까지 같아야함)가 여러개 존재 가능함. 
 *  => 구현 클래스에서 default 메서드 오버라이딩 필요.
 *  				
 */
interface MyInterface1 {		// 인터페이스 다중구현 가능
	void method();				// 인터페이스 메서드 - 추상메서드
	default void method1() {
		System.out.println("MyInterface1의 default 메서드: method1");
	}
	static void method2() {
		System.out.println("MyInterface1의 static 메서드: method2");
	}
}
interface MyInterface2 {		
	void method();				// 한 번만 해도 됨. 이름이 같아서. 
	default void method1() {	// MF1 MF2 어떤 거 가지고 와야하나 헷갈려짐 
		System.out.println("MyInterface2의 default 메서드: method1");
	}
	static void method2() {		// static은 클래스 명 써야하니까 상관없는데,  
		System.out.println("MyInterface2의 static 메서드: method2");
	}
}
class Parent {
	public void pmethod() {
		System.out.println("Parent 클래스의 멤버 메서드: pmethod");
	}
}
class Child extends Parent implements MyInterface1, MyInterface2 {	
	@Override
	public void method() {
		System.out.println("Child 클래스의 method");
	}
	@Override
	public void method1() {
		MyInterface1.super.method1();		//method 이름 똑같은 게 두 개 있어서 가지고 와서 다시 구현해야함
		MyInterface2.super.method1();
	}
}
public class InterfaceEx5 {
	public static void main(String[] args) {

		Child c = new Child();
		c.method();
		c.method1();
//		c.method2();	// static이라	 	클래스명.메소드명
		MyInterface1.method2();
		MyInterface2.method2();
		c.pmethod();
		
	}

}
