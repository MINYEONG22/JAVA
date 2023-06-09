package chap17;

import java.util.Arrays;
import java.util.List;

/*
 *	1~1000까지의 합을 5개의 스레드가 나누어 구하기.
 *	main 스레드는 모든 스레드가 종료될 때까지 대기
 *	t.join() : t 스레드가 종료할 때까지 main 메서드 대기 
 *	t1은 1~200까지의 합
 *	t2는 201~400까지 합
 *	...
 *	t5: 801~100까지의 합
 */
class SumThread extends Thread {
	int firstNum, lastNum;
	int sum;
	SumThread (int firstNum, int lastNum) {
		this.firstNum = firstNum;
		this.lastNum = lastNum;
	}
	@Override
	public void run() {
		for(int i = firstNum; i<=lastNum; i++) {
			sum += i;
		}
	}
}

public class Exam1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main 시작");
		/*
		 *	Runnable 인터페이스 : 추상 메서드 void run() 한 개를 가진다.
		 *		=> FunctionalInterface임. 	=> 람다로 표현이 가능함. 
		 */
		Thread t = new Thread(() -> System.out.println("Thread 호출"));
		t.start();
		t.join();	// t1 스레드 종료시까지 main 메서드 대기
		System.out.println("main 종료");
		
		List<SumThread> list = Arrays.asList(new SumThread(1,200), 		//Thread를 상속 받았기 때문에 하나하나 다 Thread
											 new SumThread(201,400),
											 new SumThread(401,600),
											 new SumThread(601,800),
											 new SumThread(801,1000));
								
		for(SumThread s : list) s.start();		// 병렬환경으로 만들어서 run() 시작
		for(SumThread s : list) s.join();		// 모든 Thread가 다 될 때까지 main 잡아놓음
		int sum = 0;							// join 안 하면 현재 돌고 있는 것들의 합이 나와서, 계속 달라짐
		for(SumThread s: list) sum += s.sum;
		System.out.println("전체 합: "+sum);
		
		
	}
}
