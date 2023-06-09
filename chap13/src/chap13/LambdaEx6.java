package chap13;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 *	Supplier 인터페이스
 *	- 매개변수는 없고, 리턴값은 존재
 *	형식: T getXXX() 
 */
public class LambdaEx6 {
	public static void main(String[] args) {
		Supplier<String> s1 = () -> {
			return "Java";
		};
		System.out.println(s1.get());	// 값만 전달
	
		// 주사위 값을 리턴하는 함수 ({} 생략 ver)
		IntSupplier s2 = () -> (int) (Math.random()*6)+1;
		System.out.println(s2.getAsInt());
		
		double[] arr = {1,1.2,2.4,5.3,10.3};
		DoubleSupplier s3 = () -> {
			double sum = 0;
			for(double a : arr) {
				sum += a;
			}
			return sum;
		};
		System.out.println("arr 배열의 합: "+s3.getAsDouble());
	}
}
