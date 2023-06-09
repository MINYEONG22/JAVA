package chap13;
/*
 *	- 추상메서드의 매개변수가 있고, 리턴타입도 있는 경우.
 *	(x,y)-> {.......return 값};
 *	문장이 return만 있을 때, return과 {}를 생략할 수 있음
 */
interface LambdaInterface3 {
	int method(int x, int y);
}
public class LambdaEx3 {

	public static void main(String[] args) {
		LambdaInterface3 fi = (x,y) -> {
			return x*y;
		};
		System.out.println("두 수의 곱: "+fi.method(2, 5));
		
		//생략	void가 아니면 return 꼭 써야함. {} 생략하려면 return도 생략
		fi = (x,y) -> x*y;
		System.out.println("두 수의 곱: "+fi.method(6, 5));
		
		fi = (x,y) -> x+y;
		System.out.println("두 수의 합: "+fi.method(2, 5));
		fi = (x,y) ->sum(x,y);	// 함수와 연동
		System.out.println("두 수의 합: "+fi.method(2, 5));
		
		fi = (x,y) -> (x>y)?x:y;
		System.out.println("두 수 중 큰 수: "+fi.method(2, 5));
		
		fi = (x,y) -> (x>y)?y:x;
		System.out.println("두 수 중 작은 수: "+fi.method(2, 5));
	}

	private static int sum(int x, int y) {
		return x+y;
	}
}
