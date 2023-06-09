package test;

import java.util.function.IntBinaryOperator;

/*
 * LambdaInterface3 인터페이스를 이용하여 결과가 나오도록
 * LambdaInterface3 인터페이스를 람다식을 이용하여 함수 객체를 구현하고,
 * calc 함수를 구현하기.
 */
interface LambdaInterface3 {
	int method(int x, int y);
}
public class Test1 {
	public static void main(String[] args) {
		
		LambdaInterface3 f = (x,y) -> (x+y);
		System.out.println("두 수 (5,2)의 합: " + calc(5,2,f));//7
		f = (x, y) -> (x*y);
		System.out.println("두 수 (5,2)의 곱: " + calc(5,2,f));//10
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		f = (x,y) -> (x>y)?x:y;
		System.out.println("arr 배열의 최대값: " + calc(arr,f));//10
		f = (x,y) -> (x>y)?y:x;
		System.out.println("arr 배열의 최소값: " + calc(arr,f));//1
	}

	private static int calc(int x, int y, LambdaInterface3 f) {
		return f.method(x, y);
	}
	
	private static int calc(int[] arr, LambdaInterface3 f) {
//		int max = arr[0];
//		int min = arr[0]; 
//				
//		for(int i=0;i<arr.length;i++) {
//		    if(max<arr[i]) {
//		    	max = arr[i];
//		    }
//		    if(min>arr[i]) {
//		    	min = arr[i];
//		    }
//		}
		int result = arr[0];
		for(int i: arr) {		// 첫번째 값이랑 result와 i에 있는 요소 비교
			result = f.method(result, i);
		}
		return result;
	}


}
