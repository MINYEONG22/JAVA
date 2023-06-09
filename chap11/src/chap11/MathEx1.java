package chap11;
/*
 *	Math 클래스: 수치 계산을 위한 클래스. / final 클래스. 객체생성 안 됨.
 *	 -> 모든 멤버가 static
 *	 -> 상수: PI(원주율), E(자연로그)
 */
public class MathEx1 {
	public static void main(String[] args) {
		// 절대값: abs()
		System.out.println("Math.abs(5)= "+Math.abs(5));
		System.out.println("Math.abs(-5)= "+Math.abs(-5));
		System.out.println("Math.abs(3.14)= "+Math.abs(3.14));
		System.out.println("Math.abs(-3.14)= "+Math.abs(-3.14));
		
		// 근사정수: ceil(), floor(), rint()
		// ceil(): 큰 근사정수
		System.out.println("Math.ceil(5.4): "+Math.ceil(5.4));		// 6.0	정수인데, return 값은 double로
		System.out.println("Math.ceil(-5.4): "+Math.ceil(-5.4));	// -5.0
		
		// floor(): 작은 근사정수
		System.out.println("Math.floor(5.4): "+Math.floor(5.4));	// 5.0
		System.out.println("Math.floor(-5.4): "+Math.floor(-5.4));	// -6.0
	
		// rint(): 근사정수
		System.out.println("Math.rint(5.4): "+Math.rint(5.4));		// 5.0
		System.out.println("Math.rint(5.4): "+Math.rint(-5.4));		//-5.0
	
		// 최대, 최소: max(), min()
		System.out.println("Math.min(5.4): "+Math.min(5,4));		
		System.out.println("Math.min(5.4,5.3): "+Math.min(5.4,5.3));
		
		System.out.println("Math.max(5.4): "+Math.max(5,4));		
		System.out.println("Math.max(5.4,5.3): "+Math.max(5.4,5.3));
		
		// 반올림: round()
		System.out.println("Math.round(5.4): "+Math.round(5.4)); 	// 5
		System.out.println("Math.round(5.4): "+Math.round(5.6)); 	// 6
		
		// 난수: random();
		System.out.println("Math.random(): "+Math.random());  		// 0.0 보다는 크고 1.0 보다 작은 수. 
		
		// 삼각함수
		System.out.println("Math.sin(Math.PI/2): "+Math.sin(Math.PI/2));		// sin 90도 1.0
		System.out.println("Math.cos(toRadians(60)): "+Math.cos(toRadians(60)));// cos 90도 1.0	
						// 60도를 Radians로 바꿔라
		// 2파이 360도, 파이 180도, 1/2파이 90도...	삼각함수 전부 Radians으로 표현
		System.out.println("Math.tan(Math.PI/4): "+Math.tan(Math.PI/4));		// tan 45도 0.999...
		
		// Radians를 도(Degrees)로 바꿔라
		System.out.println("Math.toDegrees(Math.PI): "+Math.toDegrees(Math.PI));
		
		// log 함수
		System.out.println("Math.log(Math.E): "+Math.log(Math.E));
		
		// 제곱근
		System.out.println("Math.sqrt(25): "+Math.sqrt(25));
		
		// 제곱
		System.out.println("Math.pow(5,2): "+Math.pow(5,3));  //5*5*5
		
		
	}

	private static double toRadians(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
