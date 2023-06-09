package test;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력하세요");
		
		int num = scan.nextInt();
		
		
		
		System.out.println((num%10)!=0?((num/10+1)*10)-num:(num-num));
		
		
		
	}

}
