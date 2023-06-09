package test;

import java.util.Scanner;

public class Test5_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		
		int money = scan.nextInt();
		int maxmoney = 0; //바꿔줄수 있는 최대 금액
		
		for (int i = 0; i < coin.length; i++) {
		
			maxmoney += coin[i] * cnt[i];
		
		}
		
		if (money > maxmoney) {
		
			System.out.println(maxmoney + ":동전이 부족합니다.");
		
		} else { 
			
		  for (int i = 0; i < coin.length; i++) {
			  
		    int coinNum = money / coin[i]; //계산된 동전 갯수
			
		    if (cnt[i] < coinNum) { 
			
		    	coinNum = cnt[i]; 
				cnt[i] = 0;
			
		    } else {   //소유하고 있는 동전의 갯수 내
				
		    	cnt[i] -= coinNum;
			}
		    
			money -= coinNum * coin[i];
			
			System.out.println(coin[i] + "원:" + coinNum);
		  }
		  
		  for (int i = 0; i < coin.length; i++) {
			
			  System.out.println ("남은 동전 " + coin[i] + "원:" + cnt[i] + "개");
		  }
		  
		}
	}

}
