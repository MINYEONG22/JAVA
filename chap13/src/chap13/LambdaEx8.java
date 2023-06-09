package chap13;

import java.util.function.IntBinaryOperator;

/*
 *	Operator 인터페이스
 * 	 Function 인터페이스의 하위 인터페이스  
 * 
 * 	IntBinaryOperator	: int 형 매개변수 두 개. int형 리턴타입
 * 		int applyAsInt(int int)
 */
public class LambdaEx8 {
	private static Student[] list = {
			new Student("홍길동",90,80,"경영"),	
			new Student("김삿갓",95,70,"컴공"),	
			new Student("이몽룡",85,75,"통계")
	};
	public static void main(String[] args) {
		System.out.print("최대 수학 점수: ");
		System.out.println(maxOrMinMath((a,b)->(a>=b)?a:b));
		System.out.print("최소 수학 점수: ");
		System.out.println(maxOrMinMath((a,b)->(a>=b)?b:a));
									//(a,b)->(a<=b)?a:b)
		System.out.print("최대 영어 점수: ");
		System.out.println(maxOrMinEng((a,b)->(a>=b)?a:b));
		System.out.print("최소 영어 점수: ");
		System.out.println(maxOrMinEng((a,b)->(a>=b)?b:a));
		
		System.out.print("최대 점수 합: ");
		System.out.println(maxOrMinTot((a,b)->(a>=b)?a:b));
		System.out.print("최소 점수 합: ");
		System.out.println(maxOrMinTot((a,b)->(a>=b)?b:a));
	}
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();	// list index 0번째 수학점수(80) 가지고 와서, 
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());	// 반복 비교해서 더 큰 수 result에 넣기 
		}
		return result;
	}
	private static int maxOrMinEng(IntBinaryOperator op) {
		int result = list[0].getEng();	// list index 0번째 영어점수(90) 가지고 와서, 
		for(Student s : list) {
			result = op.applyAsInt(result, s.getEng());	// 반복 비교해서 더 큰 수 result에 넣기 
		}						 //   a       b			// 위 (a>=b)?a:b) 함수의 영향으로 
		return result;
	}
	private static int maxOrMinTot(IntBinaryOperator op) {
		int result = (list[0].getEng()+list[0].getMath());	
		for(Student s : list) {
			result = op.applyAsInt(result, (s.getEng()+s.getMath()));	
		}												
		return result;
	}
}
