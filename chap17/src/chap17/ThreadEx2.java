package chap17;
/*
 *	Thread 생성
 *	방법 1. Thread 클래스를 상속	=> Thread1 클래스는 extends => Thread 클래스임. 
 *		-> run() 메소드 구현
 *	방법 2. Runnable 인터페이스 구현 	=> Runnable1 클래스는 implements => Runnable 인터페이스를 구현한 단순 구현 클래스
 *		-> run() 메소드 구현										  ∴ Thread 클래스가 아님
 *																  => 객체 생성 시, new Thread(Runnable r) 형태로 생성.
 *	자바는 단일 상속이라, 다른 클래스 상속 받으면 Thread 상속 못 받으니까 두 가지 방법으로 해결
 */
class Runnable1 implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {	// ┌ 현재 실행 중인 Thread	
			System.out.println(i+"="+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) {		// 여기서 new Thread(Runnable r) 를 통해 Thread 클래스로 객체 생성
		System.out.println(Thread.currentThread().getName()+"스레드 시작");
							// 아무 실행 안 해서 Thread.currentThread().getName()의 이름은 main
		Runnable r = new Runnable1();			// Runable1을 객체화 하고
		Thread t1 = new Thread(r, "First");		// Thread t1 에 r, name 값
		Thread t2 = new Thread(r, "Second");	// Thread t2 에 r, name 값
		t1.start();
		t2.start();
//		t1.run();
//		t2.run();		하면 작동하고 스레드 종료돼야하는 게 맞는데, 얘네 이상함
		System.out.println(Thread.currentThread().getName()+"스레드 종료");
	}
}
