package chap6;
/*
 *	클래스 변수 사용 예제 
 * 
 */
class Car2 {
	String color;
	int num;
	int sno;
	static int cnt;				// 초기화 안 된 건 기본값(0)으로 초기화 해줌 
	public String toString() {
		return "자동차 번호: " + sno + "=> " + color + ", " + num + ", 자동차 생산 개수: "+cnt;
	}
	
}
public class StaticValEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 c1 = new Car2();
		c1.color = "White";
		c1.num = 1234;
		c1.sno = ++Car2.cnt;		// 초기화 0에서 ++Car2.cnt 라 1
		System.out.println(c1);
		
		Car2 c2 = new Car2();
		c2.color = "Balck";
		c2.num = 5678;
		c2.sno = ++Car2.cnt;		// 1에 ++ =>2
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
