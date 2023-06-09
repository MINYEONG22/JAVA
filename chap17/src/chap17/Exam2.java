package chap17;

import java.util.ArrayList;
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
 *
 *	Runnable 구현 방식으로 구현하기.
 *
 */
class SumRunnable implements Runnable {
	int firstNum, lastNum;
	int sum;
	SumRunnable(int firstNum, int lastNum) {
		this.firstNum=firstNum;
		this.lastNum = lastNum;
	}
	@Override
	public void run() {
		for(int i = firstNum; i<=lastNum; i++) {
			sum += i;
		}
	}
}
public class Exam2 {
	public static void main(String[] args) throws InterruptedException {
		Runnable r = new SumRunnable(0, 0);
		List<SumRunnable> list = Arrays.asList(new SumRunnable(1,200), 		
											 new SumRunnable(201,400),
											 new SumRunnable(401,600),
											 new SumRunnable(601,800),
											 new SumRunnable(801,1000));
		List<Thread> list1 = new ArrayList<>();				// Thread 객체를 만들어서		
		for(SumRunnable s : list) list1.add(new Thread(s)); // 넣음 Runnable은 Thread랑 상관이 없음
		// SumRunnable을 Runnable로 바꿨을 때		  	   └ Runnable 타입으로 가능
		for(Thread t : list1) t.start();		// 병렬환경으로 만들어서 run() 시작
		for(Thread t : list1) t.join();			// 모든 Thread가 다 될 때까지 main 잡아놓음
		int sum = 0;							// join 안 하면 현재 돌고 있는 것들의 합이 나와서, 계속 달라짐
		for(SumRunnable s: list) sum += s.sum;
		// SumRunnable을 Runnable로 바꿨을 때 s.sum은 Runnable 타입이 아니라서 x
		System.out.println("전체 합: "+sum);
	}
}
