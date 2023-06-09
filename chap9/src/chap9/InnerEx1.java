package chap9;
/*
 *	내부 클래스 예제: 클래스 내부에 존재하는 클래스
 *	 1. 인스턴스 내부 클래스		 
 *	 2. static 내부 클래스		
 *	 3. 지역(Local) 내부 클래스 	: 메서드 내부에서 선언 된 클래스	- 선언 된 메서드에서만 사용이 가능.
 *
 *	내부 클래스 특징
 *	 1. 참조 자료형으로 사용 됨.	외부클래스명.내부클래스명   |	사용자 정의 자료형
 *	 2. 객체화 가능. Object 클래스의 하위 클래스.
 *	 3. 멤버 소유가 가능. 생성자 구현할 수 있음.
 * 	 4. 외부 클래스의 멤버임
 * 		=> 외부클래스의 private 멤버에 접근 가능.
 * 		=> 인스턴스 내부 클래스	:	외부 클래스가 객체화 되어야 내부 클래스의 객체화가 가능.
 * 		=> static 내부 클래스	:	외부 클래스의 객체화와 상관없이 내부 클래스의 객체화가 가능.
 */
class Outer1 {
	class InstanceInner {				// Outer1 입장에서는 멤버	extends Object 생략 되있음
		int iv = 100;					// 내부클래스도 객체화, 상속, 참조자료형 가능
		static int cv = 10;
		final static int MAX =200;
	}
	static class StaticInner {
		int iv = 300;
		static int cv = 400;
		final static int MAX =500;
	}
	void method() {
		class LocalInner {
			int iv = 600;
			static int cv = 700;
			final static int MAX = 800;
		}
		LocalInner lc = new LocalInner();
		System.out.println("lc.iv = " + lc.iv);
		System.out.println("lc.cv = " + lc.cv);
		System.out.println("lc.cv = " +LocalInner.cv);
		System.out.println("lc.MAX = " +LocalInner.MAX);
	}
	void method2() {
		//LocalInner 클래스는 method() 내부에서만 사용 가능
//		LocalInner lc = new LocalInner();	//error
	
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		// 인스턴스 내부 클래스 방법1
		Outer1 out = new Outer1();
		Outer1.InstanceInner inner1 = out.new InstanceInner();				// 인스턴스 class 객체화 
//		Outer1.InstanceInner inner1 = new Outer1.InstanceInner(); <오류		// Outer1이 객체화가 돼야, 인스턴스 class도 객체화가 됨
		// 인스턴스 내부 클래스 방법 2												// 인스턴스 멤버처럼 보기 때문에.
		Outer1.InstanceInner inner11 = new Outer1().new InstanceInner();	
		
		// static class
		Outer1.StaticInner inner2 = new Outer1.StaticInner();		// static class	객체화는 객체화랑 상관없이 메모리가 먼저 할당 되니까
																	// Outer1 class랑 상관 x
		System.out.println("inner1.iv= " + inner1.iv);
		System.out.println("inner1.cv= " + inner1.cv);
		System.out.println("inner1.cv= " + Outer1.InstanceInner.cv);	// 정석 방법
		System.out.println("inner1.MAX= " + Outer1.InstanceInner.MAX);
		System.out.println();
		System.out.println("inner2.iv= " + inner2.iv);
		System.out.println("inner2.cv= " + inner2.cv);
		System.out.println("inner2.cv= " + Outer1.StaticInner.cv);		// 정석
		System.out.println("inner2.MAX= " + Outer1.StaticInner.MAX);
		System.out.println();
		out.method();
	
	}

}
