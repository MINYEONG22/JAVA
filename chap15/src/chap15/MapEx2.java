package chap15;

import java.util.Arrays;
import java.util.List;

public class MapEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("김토이",80,95),
											new Student("홍길동",70,75),
											new Student("이몽룡",75,70));
		
		// 영어 점수 목록과 합계 출력하기
		int sum = list.stream().mapToInt(Student::getEng).peek(s->System.out.print(s+", ")).sum();
					// 중간처리 							// 최종 처리(집계 처리) forEach - 리턴값 없음, 
														// peek(중간 처리)로 해주면
		System.out.println("합계: "+sum);
		
		// peek로만 해주면 중간처리라, 마무리(최종 처리)가 안 됨.	 => 출력 없음
		// 최종 출력을 위해서는 forEach를 써야함
		System.out.println("peek");
		list.stream().mapToInt(Student::getEng).peek(s->System.out.print(s+", "));
		System.out.println("forEach");
		list.stream().mapToInt(Student::getEng).forEach(s->System.out.print(s+", "));
		
		System.out.println("\n");
		// 수학 점수 목록과 합계 출력하기
		System.out.print("수학 점수 목록: ");
		sum = list.stream().mapToInt(Student::getMath).peek(s->System.out.print(s+", ")).sum(); 
		System.out.println("합계: "+sum);
		System.out.println(list.stream().mapToInt(Student::getMath).peek(s->System.out.print(s+",")).sum());
		
		// 수학+영어 점수 목록과 합계 출력하기
		System.out.print("수학+영어 점수 목록과 합계: ");
		sum = list.stream().mapToInt(s->s.getEng()+s.getMath()).peek(s->System.out.print(s+", ")).sum();
		System.out.println("점수 총 합계: "+sum);
	}
}
