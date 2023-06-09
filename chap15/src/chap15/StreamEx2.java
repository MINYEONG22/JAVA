package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
	private String name;
	private int eng;
	private int math;
	Student(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
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
	@Override
	public String toString() {
		return "name= "+name+", eng= "+eng+", math= "+math;
	}
}
public class StreamEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동",60,70),			// Student 객체 List로 생성
										   new Student("김삿갓",65,55),
										   new Student("이몽룡",80,75),
										   new Student("임꺽정",85,65));	
		Stream<Student> st = list.stream();										// Student 리스트 Stream으로 변경 
		st.forEach(s-> {	// Student 객체 		// 반복
							// Consumer: 매개변수 존재, 리턴값이 없는 메서드
			System.out.print(s);				// 오버라이딩 return 타입 출력되고
			int sum = s.getEng()+s.getMath();
			double avg = sum/2f;
			System.out.printf(", 총점= %-4d, 평균= %.2f\n",sum,avg);	// 총점, 평균 계산돼서 같이 출력
		});
										// 
		System.out.println("=========================");			
		st = list.stream();											// 다시 설정하거나
		st.forEach(s->System.out.println("이름: "+ s.getName()));		// 내부 반복자 => 이미 사용한 stream 이미 위에서 다 읽어서 오류 ↑
		list.stream().forEach(System.out::println);				// list.stream() 붙여서 다시 메서드 참조하게.
									  // └ forEach로 전달된 거 그대로 출력해라 (toString()부분)
		System.out.println("=========================");
		System.out.println("수학 점수 총점:" + list.stream().mapToInt(Student::getMath).sum());
													// IntStream으로 변경,  └ 메서드 참조
		System.out.println("영어 점수 총점:" + list.stream().mapToInt(Student::getEng).sum());
		System.out.println("학생의 인원수: "+list.stream().count());
		
	}
}
