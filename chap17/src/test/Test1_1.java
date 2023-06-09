package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 런어블 인터페이스 구현 방식
class DataAddRunnable implements Runnable {
	String[] data;
	List<String> words;
	int interval;
	DataAddRunnable (String[] data, List<String> words, int interval) {
		this.data = data;
		this.words = words;
		this.interval = interval;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(interval);
			} catch(InterruptedException e) {
				
			}
			words.add(data[(int)(Math.random() *data.length)]);
		}
	}
}
public class Test1_1 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		String[] data = {"키","전현무","박나래","기안","코쿤","강호동","이수근","은지원","안재현","조규현","송민호","표지훈"};
		int interval = 1*1500; //2초
		Scanner scan = new Scanner(System.in);
		words.add(data[0]);
		
		//Thread 구현 시작
		Thread t1 = new Thread(new DataAddRunnable(data,words, interval));
		// Thread 객체를 만들어서 DataAddRunnable 객체로  
		t1.setDaemon(true); //데몬 쓰레드로 설정 - main이 살아있는 동안만 작동하다가 main이 사라지면 알아서 사라짐
		t1.start();
		// Thread 구현
		
		// main 시작
		while(true) {
			System.out.println(words);
			System.out.print(">>");
			String input = scan.next().trim();
			words.remove(input);	// 입력 된 내용 words 리스트의 요소에서 지우기
			if(words.size() == 0) break;
		}
		System.out.println("프로그램 종료");
		
	}
}
