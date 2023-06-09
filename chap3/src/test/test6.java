package test;

import java.util.Scanner;

//반지름을 입력받아 원의 둘레와 면적을 구하시오
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("반지름을 입력하세요");
		
		Scanner scan = new Scanner(System.in);

		int	r = scan.nextInt();		// int형
//		double pi = scan.nextDouble()	//double형
//		float r = scan.nextFloat()	// float형

		double pi = 3.141592; 		// double형
		
		System.out.println("너비: "+r*r*pi);
		System.out.println("둘레: "+2*r*pi);
		
	}	
	
}
