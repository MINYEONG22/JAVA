package chap6;
/*
 *	this 예약어 예제
 *
 * 	this() 생성자 : 클래스 내부의 다른 생성자를 호출할 때 사용
 * 				  this 반드시 첫 줄에 구현해야 함.
 *  this 참조변수 : 자기 참조 변수
 *  			 현재 객체의 참조값을 저장하고 있음
 *  			 인스턴스 메서드에서만 사용이 가능함 => 인스턴스 메서드 내부에 지역변수 선언 // main에서 사용 불가
 *				 지역변수와 멤버변수는 같은 이름을 사용할 수 있음 ∴ 지역변수와 멤버변수를 구분할 때 사용함
 */
class Car4 {
	
	String color;
	int number;
	int serialNo;
	static int sno;
	Car4(String color, int number) {
		this.color = color;
		this.number = number;		// this 생략 안 됨
		serialNo = ++sno;
	}
	Car4() {
		this("white",1111);			// 위에 거(Car4(String,int) 생성자) 다 가지고 와서... syso, serialNo 같이 출력
//		System.out.println("Car4() 생성자");	
	}
	Car4(String color) {
		this(color,1111);
	} 
	Car4(int number) {
		this("weite",number);
	}
//	Car4(int number, String color) {
//		this(color, number);
//	}									// 5번 자동차 변수 17번 변수타입과 같아서 없어도 가능
	Car4(Car4 c) {
		this(c.color, c.number);		
	}			
	public String toString() {
		return serialNo+"번 자동차: "+this.color+", "+this.number;		//this 생략 가능. 
	}
	
}
public class ThisEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car4 c1 = new Car4("blue",1234);
		System.out.println("Car4 (String int) 생성자\n"+c1+"\n");
		Car4 c2 = new Car4();			// color = white, number = 1111
		System.out.println("Car4 (String) 생성자\n"+c2+"\n");
		Car4 c3 = new Car4("red");		// color = red, number = 1111
		System.out.println("Car4 (int) 생성자\n"+c3+"\n");
		Car4 c4 = new Car4(1234);		// color = white, number = 1234
		System.out.println("Car4 (String) 생성자\n"+c4+"\n");
		Car4 c5 = new Car4(c1);			// c1과 같은 멤버로 설정
		System.out.println("Car4(c1) 생성자\n"+c5+"\n");
	}

}
