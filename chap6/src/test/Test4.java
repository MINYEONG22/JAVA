package test;
/*
4. 다음과 같은 멤버 변수를 갖는 Student 클래스를 구현 하시오
   멤버 변수
          String name //학생이름
          int ban,no,kor,eng,math  //반,번호,국어점수,영어점수,수학점수
   멤버 메서드
          1. getTotal							// 리턴타입이 보이드가 아님 int 사용
             기능 : 국어,영어,수학 점수의 합 반환
           2. getAverage
              기능 : 총점(국어,영어,수학 점수의 합) 을 과목수로 나눈 평균 반환
              리턴타입 : float						// 실수가 나오도록
 */
class Student {
	
	String name;
	int ban, no, kor, eng, math;
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return (kor+eng+math)/3f;				// 3f	f 붙여야 함.
												// 안 붙이면 88.0으로 나옴. 붙이면 88.33336
	}	
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 =new Student();
		s1.name = "홍길동";
		s1.ban = 1;
		s1.no = 1;
		s1.kor = 100;
		s1.eng = 80;
		s1.math = 85;
		System.out.println("이름: "+s1.name+"\n반: "+s1.ban+"\n번호: "+s1.no +"\n국어점수: "+s1.kor+"\n영어 점수: "+s1.eng +"\n수학점수: "+s1.math);
		System.out.println("총점: "+s1.getTotal());
		System.out.println("평균: "+s1.getAverage());
	}

}
