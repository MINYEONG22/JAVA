package chap11;

import java.util.Random;
import java.util.Scanner;

/*
 *	true/false 값을 난수로 발생하여 시스템과 사용자 중 3번 연속 true가 나오면 한쪽이 승리 
 */
public class Exam5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("true & false");
		
		Random my = new Random();
		Random you = new Random();
		// Random 을 하나 만들고, Random ran = new Random();
		// boolean 을 두 개 만들어서
		// boolean a = ran.nextBoolean();
		// boolean b = ran.nextBoolean(); 해도 됨...
		// if(a) {} 식으로... 
		
		my.setSeed(System.currentTimeMillis());		//안 해도 됨
		you.setSeed(System.currentTimeMillis()+100);
		
		int mycnt = 0;
		int youcnt = 0;
		
		while(true){	
			if(my.nextBoolean()) {		//while(true)로 해놔서 == true 없어도 됨.
				System.out.print("사용자 true\t");
				mycnt ++;
			} else  {
				System.out.print("사용자 flase\t");
				mycnt = 0;
			}  
			if(you.nextBoolean() == true) {
				System.out.println("시스템 true");
				youcnt++;
			} else  {
				System.out.println("시스템 false");
				youcnt = 0;
			}
			if(mycnt == 3 || youcnt ==3) break;
		}
		
		if (mycnt == 3) {
			System.out.println("♪사용자 승리♪");
		} else if (youcnt == 3) {
			System.out.println("♪시스템 승리♪");
		} else {
			System.out.println("비김!!!");
		}
		
	}
}
