package chap17;
/*
 *	Thread 생성
 *	방법 1. Thread 클래스를 상속
 *		-> run() 메소드 구현
 *	방법 2. Runnable 인터페이스 구현 
 *		-> run() 메소드 구현
 */
class Thread1 extends Thread{
	Thread1(String name){
		super(name);		// 스레드의 이름을 설정
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i+"="+ getName());	// getName이라는 함수 호출 - Thread 클래스가 가지고 있음
			try {
				sleep(1000);						// 1000밀리초 => 1초 동안 대기해라, 
			} catch(InterruptedException e) {
				
			}
		}
	}
}		// Dead 상태. Thread 종료
/*
 *	new Thread() : Thread 객체 생성 
 * 	start()	: Runnable			run이 가능한 상태		  ─── Runnable 상태로 돌아감 ───┐
 * 				│																│
 * 				│	 스케줄러가 어떤 걸 실행할지 결정 	∴ 실행 결과가 바뀔 수 있음				│
 * 				↓																│
 * 	실행중일 때 : Running (작동 중)													│
 * 						-> sleep() : 대기상태	 - 대기 상태가 끝나면 Running 상태가 아닌	┘
 * 						-> Running 끝나면 Dead. Thread 종료
 */
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");			
		Thread t1 = new Thread1("First");			// 객체 생성
		Thread t2 = new Thread1("Second");
		t1.start();		// Runnable상태(실행 가능)		// t1.start() 하면 병렬화를 한 뒤, t1.run()을 호출해서 실행 
		t2.start();									
		/* 
		 * start() 하면 병렬화 함. 
		 * 1. 스택영역을 병렬화 함
		 * 2. 병렬화 된 스택 영역에 run() 메서드 호출
		 */
//		t1.run();									// run을 하면 t1.run하고, t2.run하고, 스레드 종료함. 
//		t2.run();
		System.out.println("main 스레드 종료");			// 얘부터 실행 됨.
	}
}
