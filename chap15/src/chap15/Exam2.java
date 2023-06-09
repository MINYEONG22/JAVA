package chap15;

import java.util.Arrays;
import java.util.Random;

/*
 *  1부터 100사이의 임의의 수 10개를 IntStream에 저장하고,
 *	저장된 수의 합, 평균, 짝수 평균, 홀수 평균, 짝수 갯수, 홀수 갯수 출력하기  
 *	
 *  단, 랜덤 이용
 */
public class Exam2 {
	public static void main(String[] args) {
					// 시드값 설정
		System.out.println("총합: "+new Random(1000).ints(10,1,11).sum());
		System.out.println("평균: "+new Random(1000).ints(10,1,11).average().getAsDouble());
		System.out.println("짝수 갯수: "+new Random(1000).ints(100,1,101).filter(i->i%2==0).count());
		System.out.println("홀수 갯수: "+new Random(1000).ints(100,1,101).filter(i->i%2==1).count());
		System.out.println("짝수 평균: "+new Random(1000).ints(100,1,101).filter(i->i%2==0).average().getAsDouble());
		System.out.println("홀수 평균: "+new Random(1000).ints(100,1,101).filter(i->i%2==1).average().getAsDouble());
	}
}
