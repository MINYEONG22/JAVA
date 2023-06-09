package chap17;
/*
 *	데몬 스레드
 *	1. 일반 스레드의 보조기능 담당
 *	2. 일반 스레드가 종료되면 데몬도 종료됨 
 * 
 */
class DeamonThread extends Thread {
	public void run() {
		while(true) {
			System.out.println(this);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class ThreadEx7 {
	public static void main(String[] args) throws InterruptedException {
		DeamonThread t1 = new DeamonThread();
		DeamonThread t2 = new DeamonThread();
		t1.setDaemon(true);		// 무한반복을 막아줌
		t2.setDaemon(true);
		t1.start();
		t2.start();
		Thread.sleep(2000);
		System.out.println("main Thread 종료");
	}
}
