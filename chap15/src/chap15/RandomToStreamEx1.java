package chap15;

import java.util.Random;
/*
 *	IntStream Random().ints(갯수,[시작값,종료값+1]) 
 *	LongStream Random().longs(갯수,[시작값,종료값+1])
 *	DoubleStream Random().doubles(갯수) : 0 => x <1.0 범위의 난수
 */
public class RandomToStreamEx1 {
	public static void main(String[] args) {
		System.out.println("int 형 난수 3개를 가진 스트림 생성");
		new Random().ints(3).forEach(s->System.out.print(s+"\t"));
		
		System.out.println("\n0과 2사이의 int 형 난수 1개를 가진 스트림 생성");
		new Random().ints(10,0,3).forEach(s->System.out.print(s+" "));
					// └ 10개, 0부터 3 앞까지
		
		System.out.println("\n1과 100사이의 int 형 난수 10개를 가진 스트림 생성");
		new Random().ints(10,1,101).forEach(s->System.out.print(s+" "));
		
		System.out.println("\n1과 100사이의 long 형 난수 3개를 가진 스트림 생성");
		new Random().longs(3).forEach(s->System.out.print(s+"\t"));
		
		System.out.println("\n0에서 9사이의 long 형 난수 3개를 가진 스트림 생성");
		new Random().longs(3,0,10).forEach(s->System.out.print(s+" "));
		
		System.out.println("\nchar 형 난수 3개를 가진 스트림 생성");
		new Random().ints(3,'A','Z'+1).forEach(s->System.out.print((char)s+" "));
		
		System.out.println("\ndouble 형 난수 3개를 가진 스트림 생성");
		new Random().doubles(3).forEach(s->System.out.print(s+" "));	// 1을 넘지 않음
	}
}
