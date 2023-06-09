package chap15;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 *	Stream 예제 (data 모임
 * 	
 * 		Collection 방식과 Stream 방식 비교
 * 
 */
public class StreamEx1 {
	public static void main(String[] args) {
						// └ = main(String ... args)
//		Arrays.asList(T...a)	:  T: 자료형 / ... <- 가변 매개 변수. 0개 이상. 0개 이상이라 없어도 됨.
		List<String> list = Arrays.asList("김토이","홍길동","김삿갓","이몽룡");
		System.out.println("iterator 방식");
		Iterator<String> it = list.iterator();		// iterator() 반복자 
		while(it.hasNext()) {						// 가지고 올 게 있을 때까지
			System.out.print(it.next()+",");		// 출력하고 다음 거, 다음 거, 
		}
		System.out.println();
		System.out.println("Stream 방식");
//		list.stream().forEach(name->System.out.print(name+","));		// 방법1 1줄
		Stream<String> st = list.stream();								// 방법2	2줄
		st.forEach(name->System.out.print(name+","));
		System.out.println();
	}
}
