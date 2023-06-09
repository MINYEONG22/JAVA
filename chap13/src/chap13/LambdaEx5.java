package chap13;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/*
 *	Java API에서 제공되는 인터페이스
 *	Consumer 계열 인터페이스 
 * 		- void accept(매개변수) : 매개변수는 있고, 리턴값은 없는 메서드
 */
public class LambdaEx5 {
	public static void main(String[] args) {
		Consumer<String> c1 = t-> System.out.println(t+8);
		c1.accept("Java");
		
		BiConsumer<String,String> c2 = (t,u)-> System.out.println(t+u);
		c2.accept("Java", "8.0");
		
		IntConsumer c3 = t-> System.out.println(t*100);
		c3.accept(10);
		
		//IntConsumer 인터페이스를 이용하여 입력 된 매개변수까지의 합 구하기
		c3 = t-> {
			int sum = 0;
			for(int i=1; i<=t; i++) {
				sum += i;
			}
			System.out.printf("1부터 %d까지의 합: %d\n",t,sum);
		};
		c3.accept(100);
	}
}
