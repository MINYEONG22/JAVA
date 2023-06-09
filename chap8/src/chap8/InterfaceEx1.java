package chap8;
/*
 * 	인터페이스 예제
 *  	인터페이스
 *  	1. 인터페이스의 멤버는 상수, 추상메서드, default 메서드, static 메서드만 가능
 *  		- 인터페이스의 모든 멤버의 접근 제한자는 public이다.
 *  		- 상수:(public static final)자료형의 상수명; 
 *  			ex) int NUM = 100; 			 	정상.
 *  				final int NUM = 100;	 	정상.
 *  				static int NUM = 100;	 	정상.
 *  				protected int NUM = 100; 	오류.
 *  		- 추상메서드: (public abstract) 리턴타입 메서드명(매개변수)
 *  			ex) int getA();				정상.
 *  				public int getA(); 		정상.
 *  				abstract int getA();	정상.
 *  				final int getA();		오류.
 *  				static int getA();		오류.
 *  				int getA() {}			오류. 구현부 x
 *  
 *  	default 메서드: 구현부가 존재. jdk8 버전 이후에 추가 됨.			-- 인스턴스 매서드
 *  		public default 리턴타입 메서드명(매개변수) {...구현부...}
 *  	static 메서드: 구현부가 존재. jdk8 버전 이후에 추가 됨.				-- 클래스 매서드
 *  		public static 리턴타입 메서드명(매개변수) {...구현부...}
 *  
 *  	2. 객체화가 안 됨. 상수와 추상메서드로만 이루어짐. 
 *  		=> 구현 클래스의 객체화를 통해서 객체화 됨.
 *  	3. 클래스와 인터페이스는 구현으로 표현함. => implements 예약어 사용
 *  		=> 다중 구현이 가능함.
 *  	4. 인터페이스간에도 상속 가능. => 다중 상속이 가능 
 *  
 */
interface Printerable {
	int INK = 100;			//interface 접근제한자는 무조건 public이라 생략 가능, public static final 이 생략. 순서 상관없음 
	void print();			// 추상메서드 abstract 예약어 생략. 추상 메서드라 구현부{}가 나오면 에러 public abstract 생략
}
interface Scannerable {
	void scan();			// 추상메서드
}
interface Faxable {
	String FAX_NO = "02-1111-2222";		// 상수
	void send(String no);				// 추상 메서드
	void receive(String no);			// 추상 메서드
}
interface Complexerable extends Printerable,Scannerable,Faxable {
	
}	// 인터페이스간의 상속은 다중상속 가능.

class Complexer implements Printerable,Scannerable,Faxable {		// 다중구현 - 추상메서드를 다 받아와야함
																	// 위에서 상속 받았으니까 Printerable,Scannerable,Faxable 부분
																	// Complexerable 하나로 바꿔도 됨.
	int ink;
	Complexer (){
		this.ink = INK;
	}
	
	@Override
	public void print() {//오버라이딩 - 접근제한자: 넓거나 같아야해서 public 없으면 오류
		System.out.println("프린트를 출력합니다. 남은 잉크량: "+ --ink);
	}
	@Override
	public void scan() {
		System.out.println("이미지를 스캔하여 파일에 저장합니다.");
	}
	@Override		
	public void send(String no) {
		System.out.println(FAX_NO + "에서" + no + "로 FAX를 전송합니다.");
	}
	@Override
	public void receive(String no) {
		System.out.println(no + "에서" + FAX_NO + "로 FAX를 받았습니다.");
	}
	

}
public class InterfaceEx1 {

	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("Complexer 기본 잉크량:"+Complexer.INK);
		System.out.println("Complexerable 기본 잉크량:"+Complexerable.INK);
		System.out.println("Printerable 기본 잉크량:"+Printerable.INK);
//		Complexer.INK == 200;  오류, 상수는 변경 불가.
		System.out.println();
		System.out.println("Complexer 팩스 번호:"+Complexer.FAX_NO);
		System.out.println("Complexerable 팩스 번호:"+Complexerable.FAX_NO);
		System.out.println("Faxable 팩스 번호:"+Faxable.FAX_NO);
		System.out.println();
		com.print();
		com.scan();
		com.send("02-2222-3333");
		com.receive("02-2222-3333");
		
		System.out.println(com.ink);//99
		if(com instanceof Complexerable) {
			System.out.println("com 객체는 Complexerable 객체임.");
			System.out.println("com 객체는 Complexerable 타입의 참조변수로 참조가 가능함.");
			Complexerable c = (Complexerable)com;	// 형변환 가능
			c.print();
			c.scan();
			c.receive("02-2222-3333");
			c.send("02-2222-3333");
//			System.out.println("c.ink:"+c.ink); //98		// Complexerable에는 ink가 없어서 접근 x
			System.out.println("com.ink:"+com.ink);
		}
		System.out.println();
		if(com instanceof Complexerable) {
			System.out.println("com 객체는 Printerable 객체임.");
			System.out.println("com 객체는 Printerable 타입의 참조변수로 참조가 가능함.");
			Printerable p = com;	// 형변환 가능  //(Printerable) 생략되어있음
			p.print();
//			p.scan();
//			p.receive("02-2222-3333");
//			p.send("02-2222-3333");
//			System.out.println("p.ink:"+p.ink); // Printerable에는 print() 밖에 없어서 접근 x
		}
		System.out.println();
		if(com instanceof Scannerable) {
			System.out.println("com 객체는 Scannerable 객체임.");
			System.out.println("com 객체는 Scannerable 타입의 참조변수로 참조가 가능함.");
			Scannerable s = com;	
			s.scan();
		}
		System.out.println();
		
		if(com instanceof Scannerable) {
			System.out.println("com 객체는 Scannerable 객체임.");
			System.out.println("com 객체는 Scannerable 타입의 참조변수로 참조가 가능함.");
			Faxable f = com;	
			f.send("02-5555-6666");
			f.receive("02-7777-8888");
		}

	}

}
