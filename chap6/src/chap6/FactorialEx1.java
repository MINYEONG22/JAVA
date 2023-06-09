package chap6;
/*
 * 재귀함수: Recursive Call
 * 		  자신의 함수를 호출하는 함수 
 */
public class FactorialEx1 {
	public static void main(String[] args) {
		System.out.println("4! ="+factorial(4));
	}
	// i가 1이 될 때까지 계속 호출 됨. 반복
	static int factorial(int i) {			// 4
		return (i==1)?1:i*factorial(i-1);	// 4*3	6		=> 4*6 24값 나옴
					 						// 3*2
											// 2*1	위로 올라가고 올라가고
	}										// 1
}
