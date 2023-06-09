package test;

import java.util.Scanner;

/*
 *  화면에서 두수를 입력받아서 더 큰 수를 출력하기 
 */
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		System.out.println("두수를 입력:");
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int nn = (n1>n2)?n1:(n1<n2)?n2:(n1=n2) ;
		
		System.out.println(  n1+","+n2 + "더 큰 수는 " + nn);
		System.out.println (" : 두수 중 더 큰수:" + (n1>n2?n1:(n1<n2)?n2:"같다"));
//	이따가...
//		System.out.print(n1+","+n2); //옆으로 출력.
//		System.out.println(" : 두수 중 더 큰수:" + (n1>n2?n1:n2)); //한줄출력
//		System.out.println (" : 두수 중 더 큰수:" + 
//		           (n1>n2?n1:(n1<n2)?n2:"같다"));
		
		
		
	}
}

