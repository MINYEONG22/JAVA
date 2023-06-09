package chap13;
/*
 	람다식 예제: jdk8 이후부터 사용 가능.
 		람다식에서 사용되는 인터페이스는 FunctionlInterface 여야함
 		
 	FunctionlInterface: 인터페이스 내부에 추상 메서드가 한 개만 존재하는 인터페이스
 	
 	- 추상메서드의 매개변수가 없고, 리턴타입도 없는 경우.
 	  ( )->{....}
 	  람다식 내부에 실행되는 구문이 한 개인 경우 {} 생략 가능
 */
@FunctionalInterface		// 어노테이션-검증용
interface LambdaInterface1 {
	void method();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		// 익명의 내부 클래스 방식
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("기존 방식으로 코딩");
			}
		};
		fi.method();
		
		// 람다 방식으로 코딩 1
		fi =()-> {
			String str = "1. 람다 방식으로 코딩";
			System.out.println(str);
		};
		fi.method();
		// 람다 방식으로 코딩 2
		fi =()-> System.out.println("2. 람다방식으로 코딩(중괄호 생략)");
		fi.method();
		// 람다 방식으로 코딩 3
		execute(()->System.out.println("3. 함수의 매개변수로 람다 객체 실행"));
		execute(()->System.out.println("4. Hello World"));
		//1부터 100까지 합 출력하기.
		fi = () -> {
			int sum = 0;
			for(int i=1; i<=100; i++) {
				sum += i;
			}
			System.out.println("5. 1~100까지의 합:" + sum);
		};
		execute(fi);
		// ↓의 형식으로 많이 씀
		execute(() -> {
			int sum = 0;
			for(int i=1; i<=100; i++) {
				sum += i;
			}
			System.out.println("6. 1~100까지의 합:" + sum);
		});
	}
	static void execute(LambdaInterface1 f) {	//함수의 매개변수로 들어갈 수 있음
				//인터페이스 람바인터페이스 => f
		f.method();	// f 안에 있는 method()를 execute로 사용
	}
}
