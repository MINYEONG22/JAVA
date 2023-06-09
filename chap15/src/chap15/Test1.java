package chap15;

import java.util.Random;
import java.util.function.IntPredicate;

/*
 * 1부터 100까지의 정수형 임의의 난수 100개를 저장하고,
 * 그중 소수인 숫자의 목록과, 갯수를 출력하기
 * Random 클래스를 이용
 */
public class Test1 {
	public static void main(String[] args) {
//		toArray() -> IntStream -> int[] 배열로 변환하는 메서드
		IntPredicate f = a -> {
			int cnt = 0;
			for (int i = 2; i < a; i++) {
				if (a % i == 0) cnt++;
			}
			if (cnt > 0) return false;
			else 		 return true;
		};
		new Random().ints(100,1,101).filter(f).forEach(s->System.out.print(s+","));
	}
}
