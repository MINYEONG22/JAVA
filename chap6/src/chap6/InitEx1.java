package chap6;
/*
 *	초기화 블럭 예제 
 *	static 초기화 블럭: 클래스 변수의 초기화	★
 *					 클래스 정보 로드 시 한 번 실행 됨.
 *	인스턴스 초기화 블럭:	인스턴스 변수의 초기화. 생성자와 기능 겹침 (중요도▼)
 * 					객체화 시 생성자 호출 전에 먼저 실행. 
 * 					객체화 될 때마다 계속 호출 됨.
 * 
 */
public class InitEx1 {
	static int cv;
	int iv;
	InitEx1() {
		System.out.println("5번 생성자 호출 됨");
	}
	static {// static 초기화 블럭
		cv = (int)(Math.random()*100);
		System.out.println("1번 static 초기화 블럭 실행: cv="+cv);		// 이건 로드 시 한 번만 실행 main보다 먼저 실행
	}											// 이름 없이 중괄호만 들어갈 수 있다... 
	{		// 인스턴스 초기화 블럭
		iv = (int)(Math.random()*100);
		System.out.println("4번 실행 인스턴스 초기화 블럭 실행: iv="+iv);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2번 main 메서드 시작");
		System.out.println("3번 main 메서드 init1 객체 생성");
		InitEx1 init1 = new InitEx1();		// 객체화 되고 -> 인스턴스 초기화 블럭 초기화 호출 -> 생성자 호출
		System.out.println("main 메서드 init2 객체 생성");	// 실행 되고
		InitEx1 init2 = new InitEx1();		// 객체화 되고, 다시 인스턴스 호출되고 -> 생성자 호출
		System.out.println("cv="+cv);
		System.out.println("init1.iv="+init1.iv);
		System.out.println("init2.iv="+init2.iv);
	}

}
