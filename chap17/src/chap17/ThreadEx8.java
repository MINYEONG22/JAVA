package chap17;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 *	타자 연습 프로그램 구현 
 * 	String[] data = {"신서유기", "강호동", "이수근", "은지원",...};
 * 	3초에 한 번씩 List에 data 이름 추가하기. - 쓰레드가
 * 	화면에 추가 된 이름을 출력하기.
 * 	이름을 입력 받아서 입력 받은 이름을 리스트에서 제거
 * 	List의 모든 데이터가 삭제 되면, 프로그램 종료
 */
class DataAddThread extends Thread {
	List<String> words;
	String[] data;
	int interval;
	public DataAddThread(List<String> words, String[] data, int interval) {
		this.words = words;
		this.data = data;
		this.interval = interval;
	}
	@Override
	public void run() {
		while(true){ // 무한반복, 끝이 없지만, 데몬스레드로 만들어서, 끝남
			words.add(data[(int)(Math.random()*data.length)]); // 일단 등록하고
								// data index 랜덤으로 word에 add
			try {
				sleep(interval); // 대기
			} catch(InterruptedException e) {
				
			}
		}
	}
}

public class ThreadEx8 {
	public static void main(String[] args) {
		// 스레드에서 interval 만에 한번씩 데이터 추가
		List<String> words = new ArrayList<>();
		String[] data = {"키","전현무","박나래","기안","코쿤","강호동","이수근","은지원","안재현","조규현","송민호","표지훈"};
		int interval = 1500;	//1.5초
		Scanner scan = new Scanner(System.in);
		// 초기데이터: data 0번을 하나 넣어놓고,
		words.add(data[0]);
		DataAddThread t1 = new DataAddThread(words, data, interval); // class DataAddThread에 있는,
		t1.setDaemon(true);  // 데몬스레드 설정 => 반드시 start() 전에 실행해야함.
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
