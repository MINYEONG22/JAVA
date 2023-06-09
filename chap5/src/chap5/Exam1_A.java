package chap5;

import java.util.Scanner;

public class Exam1_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 5개를 입력하세요");
		
		int[] arr = new int[5];
		int sum = 0, maxidx = 0, minidx = 0;
		
		for (int i=0; i<arr.length; i++) {
			
			arr[i] = scan.nextInt();
			sum+= arr[i];					//합계
			
			if(arr[maxidx] < arr[i]) {
				
				maxidx = i;
			}
			
			if(arr[minidx] > arr[i]) {
				
				minidx = i;
				
			}
			
		}
		
		System.out.println("합계:"+sum);
		System.out.println("평균:"+(double)sum/arr.length);			//평균
		System.out.println("최대값:"+arr[maxidx]+", 인덱스:"+maxidx);
		System.out.println("최소값:"+arr[minidx]+", 인덱스:"+minidx);
		
		
		
	}

}
