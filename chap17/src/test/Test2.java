package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<String> words = new ArrayList<String>();
		int interval = 3 * 1000; 
 	    Scanner scan = new Scanner(System.in);
		words.add("abcdef");
		Thread t1 = new Thread(()->{
			while (true) {
				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {
					
				}
				int chlen = (int)(Math.random() * 4)+3;
				StringBuffer sb = new StringBuffer();
				for(int i=0;i<chlen;i++) {
					char ch = (char)('a' + (int)(Math.random() * 26));
					sb.append(ch);
				}
				words.add(sb.toString());
			}
		});
		t1.setDaemon(true);
		t1.start();
		while (true) {
			System.out.println(words);
			System.out.print(">>");
			String input = scan.next().trim();
			words.remove(input);
			if (words.size() == 0)
				break;
		}
		System.out.println("게임 시간 :" + ((System.currentTimeMillis())/1000-start) + "초");
	}
}
