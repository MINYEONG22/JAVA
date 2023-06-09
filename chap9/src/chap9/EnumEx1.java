package chap9;
/*
 *	열거형 예제 
 */
public class EnumEx1 {

	public enum Car {
		AVNETE, SONATA, GRANDURE, SM5	// 미리 객체를 설정, 설정된 객체만 사용 가능.
	}
	
	public static void main(String[] args) {
		Car car = Car.AVNETE;
		System.out.println(car);
		// 새로운 객체를 쓰려면, 위에서 설정해야함.
		Car[] cars = Car.values();	//Car 열거형 객체들 다
		for(Car c : cars) {
			System.out.println(c+":"+c.ordinal());
		}
		if(car instanceof Object) {
			System.out.println("car 객체는 Object 객체이다.");
		}
	}

}
