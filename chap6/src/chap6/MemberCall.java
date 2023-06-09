package chap6;
/*
 *	추상화 클래스 ┌ 변수  ┌ 클래스 변수 (static)	─────┐
 *			  │		 └  인스턴스 변수  ────────┐ │ 클래스 멤버: 클래스 정보 로드 시
 *			  │						  	   │ │
 *			  └ 메서드 ┌ 클래스 메서드 (static) ─┼─┘
 *					 └ 인스턴트 메서드	───────┘ 인스턴스멤버: 객체화
 * 
 * 	인스턴스 멤버에서 클래스 멤버 호출 (o)
 *  클래스 멤버에서 인스턴스 멤버 호출 (x), 객체화가 필요함
 * 
 * 
 */
public class MemberCall {

	static int cv1 = 10;
	static int cv2 = cv1;		// 클래스 멤버간 호출
	int iv1 = 100;
	int iv2 = iv1;				// 인스턴스 변수간의 호출
	int iv3 = cv1;				// 인스턴스 멤버에서 클래스 멤버 호출 가능
								// iv3가 객체화 되는 순간에 cv1은 이미 메모리 할당이 돼있어서 가능
//	static int cv3 = iv1;		// 객체화(메모리 할당이 되지 않았기 때문에)가 되지 않았기 때문에 클래스 멤버에서 인스턴스 멤버 호출 불가
	static int cv3 = new MemberCall().iv1;	 // => 객체화, 일회성					
	
	
	void method1() {										// 인스턴스 메소드
		System.out.println("cv1+cv2 = "+(cv1+cv2));
		System.out.println("iv1+iv2 = "+(iv1+iv2));
	}
	static void method2() {									// 클래스 메소드
		System.out.println("cv1+cv2 = "+(cv1+cv2));			// 같은 클래스 호출 가능
		
//		System.out.println("iv1+iv2 = "+(iv1+iv2));  		// 객체화가 되지 않아 변수가 되지 않아서, 클래스 메소드에서 인스턴스x
		MemberCall mc = new MemberCall();					// => 객체화를 만들고 mc.inv1 mc.iv2로 부르면 가능
		System.out.println("iv1+iv2 = "+(mc.iv1+mc.iv2));	// = >객체화
	}
	void method3() {										// 인스턴스 메소드에서
		method1();											// 인스턴스 메소드 가능
		method2();											// 클래스 메소드 가능
	}
	static void method4() {									// 클래스 메소드
//		method1();											// 클래스 메소드에서 인스턴스 메소드 호출 불가 => 객체화 필요
		new MemberCall().method1();							// => 객체화
		method2();			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// methode1 ~ method4 함수 호출하기
		
		MemberCall mc = new MemberCall();
		
		System.out.println("mc.method1()");	
		mc.method1();	// 인스턴스 메소드이므로 클래스 멤버인 main 메서드에서는 호출 시 객체화 필요
	
		System.out.println("\nmethod2()");
		method2();
	
		System.out.println("\nmc.method3()");
		mc.method3();	// 인스턴스 메소드이므로 클래스 멤버인 main 메서드에서는 호출 시 객체화 필요
		
		System.out.println("\nmethod4()");
		method4();
		
	}

}
