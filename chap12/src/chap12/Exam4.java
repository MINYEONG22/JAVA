package chap12;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/*	Lotto 번호 (1~45) 임의의 숫자 6개를 중복없이 출력
 *  -> 중복된 숫자가 없어야함. 
 *  -> 출력할 때 정렬해서 출력
 */
public class Exam4 {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		for(int i = 0; i<6; i++) {
			int num = (int)(Math.random()*45)+1;		//랜덤 방법 1
//			Random rand = new Random();					//랜덤 방법 2
//			lotto.add(rand.nextInt(45)+1);
			lotto.add(num);
		}
		System.out.println(lotto);
	
		
	}
}
