package chap7;
/*
 *  부모 클래스의 멤버와 자손클래스의 멤버에 같은 멤버(int x, void method)가 존재하는 경우
 *  	멤버 변수: 참조 변수의 자료형에 맞도록, 참조 변수의 자료형을 기준으로 호출.
 *  	멤버 메소드: 객체의 최종 오버라이딩 된 메소드가 호출 된다.
 *  		멤버 메소드 안의 변수는 메소드를 따름...
 *  
 *  java.lang.ClassCastException: 참조변수로 객체를 참조할 수 없을 때. 
 *  
 */
class Parent2 {
	int x = 10;
	void method() {
		System.out.println("Parent2 클래스의 method");
	}
}
class Child2 extends Parent2 {
	int x = 20;
	void method() {
		System.out.println("Child2 클래스의 method");
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}
public class BindingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p = new Child2();
		System.out.println(p.x);
		Child2 c = (Child2)p;	// 부모타입에서 자손타입으로 갈 땐 형변환 연산자 꼭 해줘야함 자동형변환 안 됨
								// 부모타입 > 자손타입 - 큰 자료형에서 작은 자료형으로 갈 땐 형변환 연산자.
		System.out.println(c.x);
		p.method();		// 오버라이딩 - 멤버변수와 멤버메소드는 다르게 움직임...
		c.method();
		
		// 부모 객체를 자손 타입의 참조변수로 참조하면
		Object o = new Parent2();		//java.lang.ClassCastException
		// 부모타입의 객체를 자손 타입의 참조변수로 참조 못 함
		// 상속관계인 걸 아니까 일단 만들어줬는데, 메모리 할당 되고 잘못된 걸 앎.
		System.out.println(c.x);
//		String s = (String)o;		//String 타입이 없음 참조할 수 없음
	}

}
