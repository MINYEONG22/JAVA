package chap13;
/*
 *	- 추상메서드의 매개변수가 있고, 리턴타입은 없는 경우.
 *	(매개변수)->{.....}
 *
 *	매개변수가 한 개인 경우, () 생략 가능
 *  실행 구문이 한 문장인 경우 {} 생략 가능
 */
@FunctionalInterface
interface LambdaInterface2 {
	void method(int a);
}
public class LambdaEx2 {
	public static void main(String[] args) {
		LambdaInterface2 fi = (a)->{
			System.out.println(a*5);
		};
		fi.method(10);	// a값에 10을 넣어줌
		fi.method(2);
		
		// 생략 가능
		fi = a -> System.out.println(a*5);
		fi.method(10);
		fi.method(2);
		
		// 함수로 사용
		calc(a->System.out.println(a*a),10);
		
		// 문제 1, calc 함수를 이용하여 i까지의 합을 출력
		fi = a -> {
			int sum =0;
			for(int i = 1; i<=a; i++) {
				sum += i;
			}
			System.out.printf("1에서 %d 까지의 합: %d\n",a,sum);
		};
		fi.method(100);
		// calc 함수를 이용하여 i까지의 합을 출력		
		calc(fi,100);	// (LambdaInterface2 f, int i) 두 개 필요
		// fi는 위에서 만든 알고리즘, 값 -> i 100으로 넣은 거
		
		//calc 함수를 이용하여 i까지의 짝수의 합을 출력
		fi = a -> {
			int sum =0;
			for(int i =1; i<=a; i++) {
				if(i%2 == 0) {
					sum += i;
				}
			}
			System.out.printf("짝수 %d 까지의 합: %d\n",a,sum);
		};
		calc(fi,10);
	}

	private static void calc(LambdaInterface2 f, int i) {
		f.method(i);	
	}
}
