package chap17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreadEx9 {
	/*방법1 static*/
	/*static*/ List<String> words = new ArrayList<>();
	/*static*/ String[] data = {"키","전현무","박나래","기안","코쿤","강호동","이수근","은지원","안재현","조규현","송민호","표지훈"};
	/*static*/ int interval = 1500;	//1.5초
	
	/*static*/ class DataAddThread extends Thread {	//내부클래스
		@Override
		public void run() {
			while(true){ // 무한반복, 끝이 없지만, 데몬스레드로 만들어서, 끝남
				words.add(data[(int)(Math.random()*data.length)]); // 일단 등록하고
				try {
					sleep(interval); // 대기
				} catch(InterruptedException e) {
					
				}
			}
		}
	}
	public static void main(String[] args) {
		// 방법2. 객체를 생성해서 c.을 words, data, interval에 붙여줌
		ThreadEx9 c = new ThreadEx9();
		Scanner scan = new Scanner(System.in);
		// 초기데이터: data 0번을 하나 넣어놓고,
		c.words.add(c.data[0]);
		DataAddThread t1 = c.new DataAddThread();		/*이쪽에도 c. 붙여야함*/
		t1.setDaemon(true);  // 데몬스레드 설정 => 반드시 start() 전에 실행해야함.
		t1.start();
		while(true) {
			System.out.println(c.words);
			System.out.print(">>");
			String input = scan.next().trim();
			c.words.remove(input);	// 입력 된 내용 words 리스트의 요소에서 지우기
			if(c.words.size() == 0) break;
		}
		System.out.println("프로그램 종료");
	}

}
