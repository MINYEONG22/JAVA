package chap3;
/*
 *	비교연산자(관계연산자) : ==, !=, >, <, ... 				
 *					=> 결과는 boolean
 * 
 * 	논리연산자: &&(AND), ||(OR)				=> boolean && boolean
 * 		true && true => true
 * 		true && false => false			// 앞이 true 면 뒤에 것도 실행하는데
 * 		false && true => false			// 앞이 false 면 해보나마나 false 뒤에 문장 실행 안 함
 * 		false && false => false
 * 
 * 		true || true => true
 * 		true || false => true			// 앞쪽의 결과가 true면 true니까, 뒤에 거 실행 안 함		
 * 		false || true => true			// 앞쪽의 결과가 false 여도, 뒤에가 true 일 수도 있으니까 뒤에거 실행 함
 * 		false || false => false
 * 
 */
public class OpEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1, y=1;
		
		System.out.println("1 == 1:" + (x==y));
		System.out.println("1 != 1:" + (x!=y));
		System.out.println("1 > 1:" + (x>y));
		System.out.println("1 >= 1:" + (x>=y));
		
		// 논리연산자
		System.out.println("논리연산자");
		System.out.println("x==1 && y==2: " + (x==1 && y==2));
		// x가 1이고, y가 2냐
		System.out.println("x==1 || y==2: " + (x==1 || y==2));
		// x가 1이거나 y가 2냐
		
	}

}
