package chap15;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/*
 *	1부터 100사이의 임의의 수 10개를 IntStream에 저장하고,
 *	저장된 수의 합, 평균, 짝수 평균, 홀수 평균, 짝수 갯수, 홀수 갯수 출력하기  
 */
public class Exam1 {
	public static void main(String[] args) {
		int [] arr = new int[100];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
//			System.out.print(arr[i]+" ");
		}	
//		System.out.println();
		System.out.println("총합: "+Arrays.stream(arr).sum());
		System.out.println("평균: "+Arrays.stream(arr).average().getAsDouble());
		System.out.println("짝수 평균:"+Arrays.stream(arr).filter(i->i%2==0).average().getAsDouble());
		System.out.println("홀수 평균:"+Arrays.stream(arr).filter(i->i%2==1).average().getAsDouble());
		System.out.println("짝수 갯수:"+Arrays.stream(arr).filter(i->i%2==0).count());
		System.out.println("홀수 갯수:"+Arrays.stream(arr).filter(i->i%2==1).count());
		System.out.println("중복되지 않은 난수의 갯수: "+Arrays.stream(arr).distinct().count());
																	// └ 중복된 데이터 제거해서 한 개만 남김
		System.out.println("(중복x)짝수 평균:"+Arrays.stream(arr).distinct().filter(i->i%2==0).average().getAsDouble());
		System.out.println("(중복x)홀수 평균:"+Arrays.stream(arr).distinct().filter(i->i%2==1).average().getAsDouble());
		System.out.println("(중복x)짝수 갯수:"+Arrays.stream(arr).distinct().filter(i->i%2==0).count());
		System.out.println("(중복x)홀수 갯수:"+Arrays.stream(arr).distinct().filter(i->i%2==1).count());
	}
}
