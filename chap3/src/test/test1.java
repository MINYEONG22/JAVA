package test;

import java.util.Scanner;

/*
 * 화면에서 금액입력받아서 500,100,50,10,1원 동전으로 바꾸기.
 * 필요한 동전의 갯수 출력하기. 전체동전은 최소 갯수로 바꾼다.
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원  : 0개
 * 10원 : 4개
 * 1원  : 1개
 */
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.out.println("금액을 입력하세요");
	
	Scanner scan = new Scanner(System.in);
	
	int coin = scan.nextInt();
	
	int fh = coin/500;
	int oh = (coin%500)/100;
	int ft = ((coin%500)%100)/50;
	int ot = (((coin%500)%100)%50)/10;
	int one = (((coin%500)%100)%50)%10;
	
	int conin500 = coin/500;
	int conin100 = (coin%500)/100;
	int conin50 = (coin%100)/50;
	int conin10 = (coin%50)/10;
	int conin1 = coin%10;
	
	System.out.println("답안: 500원: "+fh+"개, 100원:"+oh+"개, 50원: "+ft+"개, 10원:"+ot+"개, 1원:"+one+"개");
	
	System.out.println("풀이: 500원: "+conin500+"개, 100원:"+conin100+"개, 50원: "+conin50+"개, 10원:"+conin10+"개, 1원:"+conin1+"개");
	
	System.out.println("___________________");
//	차감
	
	System.out.println("500원: "+coin/500);
	coin %= 500;
	System.out.println("100원: "+coin/100);
	coin %= 100;
	System.out.println("50원: "+coin/50);
	coin %= 50;
	System.out.println("10원: "+coin/10);
	coin %= 10;
	System.out.println("1원: "+coin);
	
	
	}

}
