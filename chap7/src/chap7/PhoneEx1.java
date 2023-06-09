package chap7;
/*
 *	상속예제 
 *	 1. 모든 클래스는 Object 클래스를 상속 받는다.
 *	 2. 자손 클래스의 객체 생성은 부모 클래스의 객체부터 생성한다.
 *		- 부모 클래스의 객체 생성 시 부모 클래스의 생성자를 호출한다. 
 *	 3. 클래스 간의 상속은 단일 상속만 가능하다. (다중 상속x) 부모 클래스는 하나여야함.
 *		- 인터페이스에서는 다중 상속 가능
 *	 4. 모든 클래스의 객체는 Object 객체를 포함한다.
 *  	-> 모든 클래스의 객체는 Object 클래스의 멤버를 호출할 수 있다.
 *
 */
class Phone {				// class Phone (extends Object)가 생략된 거. 모든 class는 Object의 상속을 받음. 
	
	boolean power;			// 기본 false
	int numner;
	void power() {
		power = !power;
	}
	void send() {
		if(power) System.out.println("전화 걸기");
	}
	void receive() {
		if(power) System.out.println("전화 받기");
	}
}
class SmartPhone extends Phone {
	void setApp(String name) {
		System.out.println(name + "앱 설치함");
	}
}
public class PhoneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();		// SmartPhone 객체를 만듦
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("카카오");
		
	}

}
