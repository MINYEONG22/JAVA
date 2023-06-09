package chap17;
/*
 *	동기화 블럭 예제 
 *		synchronized 예약어 사용. 임계영역.
 *	동기화 메서드 방식
 *		method의 제한자에 synchronized 사용.
 * 
 */
class PrintThread1 extends Thread {
	char ch;
	static Object lock = new Object();		// lock이라는 객체는 모든 스레드의 공유 객체로 사용돼야해서 static 붙여줘야함
//	Object lock = new Object();					=> static 안 붙이면 동기화가 안 됨
	
//  static을 안 붙이면 각각의 구역에서 lock을 각각 따로 걸어서 동기화가 안 됨. 	
	
	
//  static int lock = 0; 면 오류. 기본참조자료 안 됨. 
//  static Object lock = 0; 이것도 상관 없음. 객체기만하면 됨.
	
	PrintThread1 (char ch) {
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			synchronized(lock) {			// 동기화 블럭 => lock은 반드시 객체(종류 상관 없음)여야함
				for(int j=0; j<80; j++) {
					System.out.print(ch);
				}
				System.out.println();
				try {
					sleep(50);
				} catch(InterruptedException e) {
					
				}
			} // synchronized 끝
		}
	}
	
}
public class ThreadEx4 {
	public static void main(String[] args) {
		PrintThread1 t1 = new PrintThread1('A');	
		PrintThread1 t2 = new PrintThread1('B');		
		PrintThread1 t3 = new PrintThread1('C');
		t1.start();
		t2.start();
		t3.start();
	}
}
