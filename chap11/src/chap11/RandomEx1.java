package chap11;

import java.util.Random;

/*
 * Random 클래스: 난수 발생 클래스 
 *  1. 자료형별로 난수 발생
 *  	nextInt() : 정수형 난수
 *  	nextInt(n): 정수형 난수 => 0보다는 크거나 같고, n보다 작음
 *  	nextDouble() : 실수형 난수 0보다 크거나 같고 1.0보다 작은 수
 *  	nextBoolean() : true/false
 *  2. seed 값 설정 가능.
 *  
 */
public class RandomEx1 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		rand1.setSeed(1);	// 난수 복원시킬 수 있음.
		for(int i = 0; i<5; i++) {
			System.out.println(i+":"+rand1.nextInt(100));
		}	// 난수인데 같은 값이 계속 나옴...
	
		
		System.out.println("rand2==============");
		Random rand2 = new Random();
		System.out.println(System.currentTimeMillis());
		rand2.setSeed(System.currentTimeMillis());	// 난수 복원시킬 수 있음.
		// 1970년 이후부터 현재까지의 시간을 밀리초로 리턴
		// 계속 증가만 됨, 감소x 복귀x
		for(int i = 0; i<5; i++) {
			System.out.println(i+":"+rand2.nextInt(100));
		}
	
	}
}
