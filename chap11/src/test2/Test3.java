package test2;

import java.util.Random;

/*
 * int getRand(f,t) : 함수 구현하기
 *   f ~ t 또는 t~ f 까지  범위에 숫자를 임의의 수로 리턴하는 함수
 *   f, t 값은 포함됨. 
 
  0~99 : rand * (99-0+1) + 0
 1~100 : rand *(100-1+1)  + 1
         rand * (최대값-최소값 + 1) + 최소값
 
[결과]
-2,1,0,-3,-2,1,-1,0,-2,0,0,1,0,-3,0,-1,-1,-2,-2,1,
3,3,0,0,-1,-1,0,3,2,3,0,-1,1,1,-1,3,0,0,1,-1,    
 */
public class Test3 {
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			System.out.print(getRand(1,-3)+",");
		}
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.print(getRand(-1,3)+",");
		}
	}
	private static int getRand(int f, int t) {
		// 두 수 중, 작은 값을 min에 넣고, 큰 값을 max에 넣음
//		int min = Math.min(f,t);
		int min = (f > t)?t:f;
		int max = Math.max(f,t);
		int cha = max - min;	// 두 수의 갯수만큼 cha에 넣어서
//		return (int)(Math.random() * (cha+1)) + min;
		
		Random r = new Random();
		return  r.nextInt(cha+1) + min; // cha+1에 +min 해주면 됨
		
	}
}
