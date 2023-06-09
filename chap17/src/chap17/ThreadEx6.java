package chap17;
/*
 *	생산자 스레드, 소비자 스레드
 *	mother 스레드와 son 스레드는 하나의 계좌를 공유한다.
 *	계좌 잔액이 0이면 아들은 wait() 상태로 변경
 *	계좌 잔액이 있는 경우엔 엄마가 wait() 상태로 변경
 *	엄마는 잔액이 0원인 경우  10000, 20000,30000원 중 한 개를 계좌에 입금
 *	아들은 잔액이 있는 경우 잔액을 0으로 만들고, 엄마를 깨운다. 
 *
 *	wait(), notify(), notifyAll
 *	1. 동기화 영역(동기화 블럭, 동기화 메서드)에서만 사용 가능
 *	2. Object 클래스의 메서드임 => 모든 객체는 호출 가능
 *	3. wait() : 실행 중인 스레드를 대기상태 변환 . lock 해제함
 *	   notify() : wait() 되어 있는 스레드 한 개를 Runnable 상태로 변환
 *	   nofifyAll() : wait() 되어 있는 모든 스레드를 Runnable 상태로 변환
 */
class Account {
	int money;
	synchronized void output() {
	 	while(money ==0) {		// money가 0이 되면
			try {
				wait();			// son wait	- 현재 실행 중인 스레드를 대기상태로 변환
			} catch (InterruptedException e) {
				
			}
		}
		notifyAll();	// 대기 중인 스레드 모두를 Runnable 변환
		System.out.println(Thread.currentThread().getName() + ": " + money +"원 출금");
		money = 0;				// 현재 Thread의 이름
	}
	synchronized void input() {
		while(money > 0) {		// money가 0보다 크면
			try{	
				wait();			// mother 대기 - 현재 실행중인 스레드를 대기 상태로 변환
			} catch(Exception e) {
				
			}
		}
		money = ((int)(Math.random()*3)+1)*10000;
		notifyAll();	// 현재 wait 상태에 있는 다른 Thread를 Runnable 상태로 변환
		System.out.println(Thread.currentThread().getName()+ ": " + money+"원 입금");
	}
}
class Mother extends Thread {
	Account account;
	Mother(Account account) {
		super("엄마");
		this.account = account;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			account.input();
			try {
				sleep((int)(Math.random()*3000)); //0~3초 사이에 쉬고
			} catch (InterruptedException e) {
				
			}
		}
	}
}
class Son extends Thread {
	Account account;
	Son(Account account) {
		super("아들");
		this.account = account;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			account.output();
			try {
				sleep((int)(Math.random()*1000)); 
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class ThreadEx6 {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread m = new Mother(acc);
		Thread s = new Son(acc);
		m.start();
		s.start();
	}
}
