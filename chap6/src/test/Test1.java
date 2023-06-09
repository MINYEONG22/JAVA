package test;
/*1. Card 클래스가 다음과 같을때 구동 클래스를 완성하시오
[결과]
Heart:1(100,250)
Spade:1(100,250)
Heart:1(50,80)
Spade:1(50,80)
*/
class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;

	public String toString() {
		return kind + ":" + number + "(" + width + "," + height + ")";
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Card c1 = new Card();				// 객체화 -> 실제 메모리를 할당
										
	c1.kind = "heart";					// 빈 정보를 채워줌
	c1.number = 1;
	System.out.println(c1);				// toString() 멤버 메서드 자동으로 생성
	
	Card c2 = new Card();
	c2.kind = "spade";
	c2.number = 1;
	System.out.println(c2);
	
	c1.width = 50;
	c1.height = 80;
		
	System.out.println(c1);
	System.out.println(c2);
	
	}

}
