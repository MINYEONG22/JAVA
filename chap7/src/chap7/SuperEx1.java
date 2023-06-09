package chap7;
/*
 *	super 예약어
 *
 * 	super 생성자(메서드) :	부모 클래스의 생성자 호출. 첫 줄에 사용해야함.
 * 						부모 클래스의 생성자의 매개변수 설정에 맞도록 자손 클래스에서 호출해야함.
 * 						생략 가능한 경우: 부모 생성자 중 매개변수가 없는 생성자가 있는 경우, 자손 클래스에서 부모 클래스의 생성자 호출을 생략해도 됨.
 *  super 참조변수(reference) : 부모 클래스의 객체를 참조하는 변수.
 * 
 */
class Parent {
	int x = 10;
	Parent(int x) {
		super(); // <- 생략되어 있음. 생략 가능.
		this.x = x;
	}								// 자손 class에 매개변수가 없으려면, 부모 class에도 매개변수가 없어야함. 안그러면 super(x) 써줘야함.
	Parent() {}
}
class Child extends Parent {
	int x = 20;
	Child() {
		super(100);		// 부모 클래스의 생성자 호출 의미, 생략 불가		// 100이 없으면 10으로 나옴
	}
	void method() {
		int x = 30;
		System.out.println("x="+x);					// 지역변수 우선, 다음 내 class 우선, 다음 부모 class  
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);		// 부모 클래스에 super() 라는 게 없으면, child에서도 부러올 수 없음.
	}
}
public class SuperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
	}

}
