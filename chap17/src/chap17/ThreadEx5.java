package chap17;
class PrintThread2 extends Thread {
	Printer ptr;
	char ch;
	PrintThread2 (Printer ptr, char ch) {
		this.ptr = ptr;
		this.ch = ch;
	}
	public void run() {
		for (int i=0; i<20; i++) {
			ptr.printChar(ch);
		}
	}
}
class Printer {
	// 동기화 메서드 방식  ┌ 세이프하다라고 얘기함...
	public synchronized void printChar(char ch) {
		for(int i=0; i<80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
public class ThreadEx5 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintThread2 t1 = new PrintThread2(ptr,'A');
										// new Printer() 해주면, 객체가 각각 따로 생성돼서 동기화 환경이 안 됨.
		PrintThread2 t2 = new PrintThread2(ptr,'B');
		PrintThread2 t3 = new PrintThread2(ptr,'C');
		t1.start();
		t2.start();
		t3.start();
	}
}
