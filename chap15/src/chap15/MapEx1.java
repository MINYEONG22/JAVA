package chap15;

import java.util.Arrays;
import java.util.List;

/*
 *	mapXXX 메서드 : 스트림 요소를 치환 할 수 있는 메서드.
 *	mapToInt()	: Stream을 IntStream으로 변환 
 */
public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동전","춘향전","구운몽","전우치전");
		System.out.print("방법1. list 객체의 길이: ");
		list.stream().mapToInt(String::length).forEach(s->System.out.print(s+", "));
				//String list 타입 -> IntStream로 변경해서 길이(length) 결과값을 각각 리턴
		System.out.print("\n방법2. list 객체의 길이: ");
		list.stream().mapToInt(s->s.length()).forEach(s->System.out.print(s+", "));
		
		List<Student> list2 = Arrays.asList(new Student("김토이",80,95),
											new Student("홍길동",70,75),
											new Student("이몽룡",75,70));
		// 영어 점수 목록 가지고 오기
		System.out.print("\n방법1. 영어 점수 목록: ");
		list2.stream().mapToInt(s->s.getEng()).forEach(s->System.out.print(s+", "));	// 람다방식
		System.out.print("\n방법2. 영어 점수 목록: ");
		list2.stream().mapToInt(Student::getEng).forEach(s->System.out.print(s+", "));	// 메서드 참조
		System.out.print("\n방법3. 영어 점수 목록: ");
		list2.stream().mapToInt(s->{				// 람다방식 (생략 x)
			return s.getEng();
		}).forEach(s->System.out.print(s+", "));
		
		// 수학 점수 목록 가지고 오기
		System.out.print("\n방법1. 수학 점수 목록: ");
		list2.stream().mapToInt(s->s.getMath()).forEach(s->System.out.print(s+", "));
		System.out.print("\n방법2. 수학 점수 목록: ");
		list2.stream().mapToInt(Student::getMath).forEach(s->System.out.print(s+", "));
		
		// 영어, 수학 합계 점수 목록 가지고 오기
		System.out.print("\n영어, 수학 합계 점수: ");
		list2.stream().mapToInt(s->s.getMath()+s.getEng()).forEach(s->System.out.print(s+", "));
		System.out.println();
		// 수학점수 합계와, 수학 점수 평균, 영어점수 합계, 영어점수 평균
		System.out.println("수학 점수 합계: "+list2.stream().mapToInt(s->s.getMath()).sum());
		System.out.println("수학 점수 평균: "+list2.stream().mapToInt(s->s.getMath()).average().getAsDouble());
		System.out.println("영어 점수 합계: "+list2.stream().mapToInt(s->s.getEng()).sum());
		System.out.println("영어 점수 평균: "+list2.stream().mapToInt(s->s.getEng()).average().getAsDouble());
		System.out.println("점수 합계: "+list2.stream().mapToInt(s->s.getMath()+s.getEng()).sum());
		System.out.println("점수 평균: "+list2.stream().mapToInt(s->s.getMath()+s.getEng()).average().getAsDouble()/2);
		
		
	}
}
