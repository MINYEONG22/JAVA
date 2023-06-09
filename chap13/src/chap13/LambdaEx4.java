package chap13;
class Outer {
	public int iv = 10;
	void method() {
		int iv = 20;	// 지역변수	final(생략) int iv = 20;
//		iv++;  	// 지역변수는 상수가 되어야 함. 함수 객체에서 지역변수값 접근 시 상수화 필요함 
		LambdaInterface1 f = ()->{	// 변경하려면 () 안에 변수를 받아 오던지 해야함.
			System.out.println("iv= "+iv);
			System.out.println("this.iv= "+this.iv);				// 람다방식에서는 this.iv가 Outer에 있는 iv에도 접근 가능
			System.out.println("Outer.this.iv= "+Outer.this.iv);	// 외부 클래스의 멤버값도 접근 가능. 두 가지가 다 됨 (일반적인 내부 클래스와의 차이)
		};
		f.method();
	}
}
public class LambdaEx4 {
	public static void main(String[] args) {
		new Outer().method();
	}
}
