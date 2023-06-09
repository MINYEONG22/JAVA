package chap13;

import java.util.function.Function;
import java.util.function.ToIntFunction;
/*
 *	Function 인터페이스
 *	 매개변수 존재. return값 존재.
 *	 형식: R(리턴값) applyXXX(T) 
 * 						┌ 리턴 타입의 자료형
 * 	Function<Student,String>
 * 			 └ 매개변수의 자료형
 * 	Function<T,R> : R apply(T) -> Function<Student,String> : String apply(Student)
 * 
 * 	ToIntFunction<T> : return 값 int	applyAsInt(T) -> ToIntFunction<Student> : int applyAsInt(Student)
 * 
 */
class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getMajor() {
		return major;
	}
}
public class LambdaEx7 {
	private static Student[] list = {
		new Student("홍길동",90,80,"경영"),	
		new Student("김삿갓",95,70,"컴공"),	
		new Student("이몽룡",85,75,"통계")
	};
	public static void main(String[] args) {
		System.out.print("학생 이름: ");
		for(Student s : list) {
			System.out.print(s.getName()+", ");
		}
		System.out.println();
		//람다방식
		System.out.print("학생 이름: ");
		printString(t->t.getName());		//Function<Student,String> -> String 부분
		System.out.print("학생 전공: ");
		printString(t->t.getMajor());
		System.out.print("수학 점수: ");
		printString(t->t.getMath()+"");		// String 이니까, +"" 해줘서 문자열로 바꿔줘
		System.out.print("영어 점수: ");
		printString(t->t.getEng()+"");
		System.out.print("학생의 이름(총점): ");
		printString(t->t.getName()+"("+(t.getEng()+t.getMath())+")");
		System.out.print("학생들의 영어 점수 합계: ");
		printTot(t->t.getEng());			// f.applyAsInt(s) 의 s부분
		System.out.print("학생들의 수학 점수 합계: ");
		printTot(t->t.getMath());
		System.out.print("학생들의 전체 점수 합계: ");
		printTot(t->(t.getMath()+t.getEng()));
	}
	// 람다방식
	static void printString(Function<Student,String> f) {
		for(Student s : list) {
			System.out.print(f.apply(s)+", ");
		}
		System.out.println();
	}
	static void printTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
}
