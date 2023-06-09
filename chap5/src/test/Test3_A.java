package test;

import java.util.Scanner;

public class Test3_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] digit = {2,8,10,16};
		
		char[] numarr = "0123456789ABCDEF".toCharArray();
		char[] arr;
		
		System.out.println("10진수 값을 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int divnum = num, index=0;
		
		for (int d : digit) {  
			
			divnum = num;
			index = 0;
			arr = new char[32]; 
		
			while (divnum > 0) {
				arr[index++] = numarr[divnum % d];
				divnum /= d; 
			}
			
			System.out.print(num + "의 " + d + "진수 :"); 
			
			for(int i=index-1;i>=0;i--) {
				
				 System.out.print(arr[i]);
				 
			}
				
			System.out.println();
			
		}
		
		
		
	}
}
