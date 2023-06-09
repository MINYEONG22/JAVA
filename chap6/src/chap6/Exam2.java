package chap6;
/*
 *	Rectangle2 클래스 구현하기 
 *  멤버 변수: width(가로), height(세로), sno(사각형 번호),
 *  		cnt(클래스 변수)로 사각형 객체의 갯수
 *  
 *   멤버 메서드:
 *   	void area()			: 사각형의 면적 출력
 *   	void length()		: 사각형의 둘레 출력
 *   	String toString()	
 *   
 *   toString : 1번 사각형: 가로(10), 세로(20), 현재까지 생성된 사각형(1) 형식으로 출력
 *   
 */

class Rectangle2 {	// 같은 패키지 내에 같은 클래스 만들 수 없음. 같은 패키지 내에 클래스 명 중복 불가.
	
	int width;
	int height;
	int sno;				// 인스턴스 변수 0으로 초기화 됨
	static int cnt;			// 클래스 변수
	
	void area() {		
		System.out.println("가로("+width+"), 세로("+height+"), 면적("+ (width*height)+")");
	}
	void length() {
		System.out.println("가로("+width+"), 세로("+height+"), 둘레("+ (width+height)*2+")");
	}
	public String toString() {
		return sno + "번 사각형: "
				+ ""+ "가로("+width+"), 세로("+height+"), 현재까지 생성된 사각형("+cnt+")";
	}
	
}
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Rectangle2 r1 = new Rectangle2();	// 객체화
	
	r1.width = 10;
	r1.height = 20;
	r1.sno = ++Rectangle2.cnt;
	System.out.println(r1);

	//면적과 둘레 출력
	r1.area();
	r1.length();
	
	
	
	Rectangle2 r2 = new Rectangle2();
	r2.width = 20;
	r2.height = 30;
	r2.sno = ++Rectangle2.cnt;
	System.out.println(r2);
	
	r2.area();
	r2.length();
	
	}

}
