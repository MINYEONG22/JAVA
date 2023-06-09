package chap5;

import java.util.Scanner;

/*
 *	정수값 5개를 입력받아서 
 *  입력받은 수의 합계와 평균, 최대값, 최소값 인덱스값 출력하기 
 */
public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 5개를 입력하세요");
		//배열의 선언, 생성, 초기화 한번에
		int arr[] = new int[5];
		int sum = 0;
		int maxidx = 0, minidx= 0;
		for(int i =0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];		
			if(arr[maxidx]<arr[i]) {	//[i]일 때 큰 숫자가 제일 큰 수 index이다
				maxidx = i;
			}
			if(arr[minidx]>arr[i]) { // [i]일 때 가장 작은 숫자가 제일 작은 수 index이다
				minidx = i;
			}
		}
		System.out.println("합계: "+sum);
		
		int j = arr.length;
		System.out.println("평균:"+(double)(sum/j));
//		비교
		for(int i=0; i<arr.length; i++ ) {
			// 비교, 하나씩											
				for (int k=0; k<arr.length-1-i; k++) {	 	// 0<(5-1-0), 1<(5-1-1), 2<(5-1-2)
															// 0<4			1<3			2<2
					if(arr[k]>arr[k+1]) {		// arr[0] > arr[1]
												// arr[1] > arr[2]
												// arr[2] > arr[3]
												// arr[3] > arr[4]
						int tmp = arr[k];
						arr[k] = arr[k+1];		
						arr[k+1] = tmp;			
					}
				}
		}
		System.out.println("최소값: "+arr[0]+", index:"+minidx);
		System.out.println("최대값: "+arr[4]+", index:"+maxidx);
		
		
		
		
	}

}
