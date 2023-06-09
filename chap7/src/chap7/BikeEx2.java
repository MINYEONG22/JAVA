package chap7;
/*
 *	다형성 예제 
 *  1. 자손 타입의 객체는 부모 타입의 참조 변수로 참조가 가능
 *  2. 부모 타입의 참조 변수로 자손 타입의 객체를 참조할 때 
 *     부모 타입의 멤버들만 호출이 가능함
 * 	3. 모든 클래스의 객체는 Object 타입의 참조변수로 참조가 가능
 *	   Object 타입의 참조변수로는 Object 클래스 멤버만 호출 가능 
 */
class Bike2 {
	int wheel;
	Bike2(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("패달을 밟는다");
	}
	void stop() {
		System.out.println("브레이크를 잡는다");
	}
}
class AutoBike2 extends Bike2 {
	boolean power;
	AutoBike2(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
	}
}
public class BikeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoBike2 ab = new AutoBike2(2);		// int wheel 값 2
		Bike2 b = null;
		ab.power();
		ab.drive();
		System.out.println("ab.wheel="+ab.wheel);
		ab.stop();
		b = ab;
//		b.power();	b는 bike2 객체 만큼만 참조할 수 있음. bike2에는 power가 없음
		b.drive();
		Object o = b;
//		o.drive(); 	오브젝트 타입에서는 오브젝트의 객체만큼 참조할 수 있음
	}

}
