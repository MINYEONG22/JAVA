package chap9;
/*
 *	내부 클래스에서 사용되는 this
 * 
 */
class Outer3 {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method1() {
			int iv = 300;
			System.out.println("iv = "+ iv);			// 300	지역변수 > 내부클래스 멤버변수 > 외부클래스의 멤버변수
			System.out.println("iv2 = "+ iv2);			// 20	
			System.out.println("this.iv = "+ this.iv);  // 100	this 내부 클래스의 객체 의미 
														// => method1에 iv가 없으면 오류. this(자기 참조변수)로 외부 접근 x
			System.out.println("Outer3.this.iv = "+Outer3.this.iv);		// 외부 클래스 iv
			// 외부클래스명.this.멤버명 => 외부 클래스의 멤버 참조
		}
	}
}
public class InnerEx3 {

	public static void main(String[] args) {

		new Outer3().new InstanceInner().method1();
	}

}
