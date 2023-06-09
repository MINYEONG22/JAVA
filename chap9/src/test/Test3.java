package test;
class Outer1 {
	class Inner1 {
		int iv = 100;
	}
	static class Inner2 {
		int iv = 200;
	}
}
//Outer클래스의 내부 클래스 Inner1, inner2 의 멤버변수 iv의 값 출력
public class Test3 {

	public static void main(String[] args) {
		Outer1.Inner1 out = new Outer1().new Inner1();
		Outer1.Inner2 oi = new Outer1.Inner2();
		System.out.println("Inner1: "+out.iv);
		System.out.println("Inner2: "+oi.iv);
		
		// 줄여서 syso에 바로 객체화
		System.out.println(new Outer1().new Inner1().iv);
		System.out.println(new Outer1.Inner2().iv);
	}

}
