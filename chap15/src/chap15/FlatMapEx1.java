package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
/*
 *	FlatMap 예제
 *	flatMap()	: Stream의 구조를 변경, Stream -> Stream 
 * 	flastMapToInt()	: Stream -> IntStream
 * 
 */
public class FlatMapEx1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("자바 8 버전에","추가 된 스트림을","공부하고 있습니다.");
		list1.stream().flatMap(data->Arrays.stream(data.split(" "))).forEach(s->System.out.println(s));
		// flatMap 리턴 타입: stream	=> 직접 stream으로 만들어줌		// stream 타입의 문자열 객체로 변환해서 출력
		// flastMapToInt() : IntStream으로 변경.
		List<String> list2 = Arrays.asList("10,20,30","40,50,60,70");
				// 매개변수, list2 자료형이라 String, 리턴타입 int라 IntStream으로 제너럴 설정
		Function<String,IntStream> f = data->{			// Function(함수) 안 만들어주면 합, 건수, 평균 따로따로 확인해야함
			String[] strArr = data.split(",");
			int[] intArr = new int [strArr.length];
			for(int i =0; i<strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());	// int로 변환해서 strArr을 intArr에 넣음
			}
			return Arrays.stream(intArr);	// int로 리턴
		};
		IntStream isr = list2.stream().flatMapToInt(f);
		System.out.println("전체 합:"+isr.peek(s->System.out.println(s+",")).sum());						
		System.out.println("요소의 건수:"+ list2.stream().flatMapToInt(f).count());
		System.out.println("요소의 평균:"+list2.stream().flatMapToInt(f).average().getAsDouble());
		
	}
}
