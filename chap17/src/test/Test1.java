package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 람다식 구현
public class Test1 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		String[] data = {"키","전현무","박나래","기안","코쿤","강호동","이수근","은지원","안재현","조규현","송민호","표지훈"};
		int interval = 2*1000; //2ch
		Scanner scan = new Scanner(System.in);
		words.add(data[0]);
		//Runnable 인터페이스는 람다로 구현 가능.
		//Thread 구현 시작
		Thread t1 = new Thread(()-> {
			while(true) {
				try {
					Thread.sleep(interval);
				} catch(InterruptedException e) {
					
				}
				words.add(data[(int)(Math.random() *data.length)]);
			}
		});
		t1.setDaemon(true);
		t1.start();
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
