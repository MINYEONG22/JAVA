package chap5;

import java.util.Scanner;

/*
 *	10진수를 16진수로 변경하기 
 * 	16진수는 char 사용해야함.
 */
public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		char data[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; //원래대로면
		char data1[] = "0123456789AVCDEF".toCharArray();
										//문자열 데이터를 char[]로 변환해주는 함수
		char [] hex = new char[8];
		
		System.out.println("16진수로 변환할 10진수 입력");
		
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		
		while(divnum>0) {
			
			hex[index++] = data[divnum%16];			//index의 값이 아닌, index 자체를 이용해서 가지고 옴
			divnum/= 16;
			
		}
		
		System.out.print(num+"의 16진수:");
		
		for(int i=index-1; i>=0; i--) {
			
			System.out.print(hex[i]);
			
		}
		
		System.out.println();
		
	}

}
