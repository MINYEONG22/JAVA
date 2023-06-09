package chap17;
/*
 *	동기화 되지 않는 경우
 */
class PrintThread extends Thread {
	char ch;
	PrintThread(char ch) {
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			for(int j=0; j<80; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}

public class ThreadEx3 {
	public static void main(String[] args) {
		PrintThread t1 = new PrintThread('A');		// 80개 찍을 때까지 ln이 안 되고, 아무데나에서 80개 찍으면 ln이 됨
		PrintThread t2 = new PrintThread('B');		
		PrintThread t3 = new PrintThread('C');
		t1.start();
		t2.start();
		t3.start();
	}
}
