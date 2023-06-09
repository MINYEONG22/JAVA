package chap11;
class Card {
	String kind;
	int number;
	public Card(String kind, int number) {	// 객체 생성
		super();
		this.kind = kind;
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {	// object라는 부모 class에 있는 선언부라, 불러옴...  
		if(obj instanceof Card) {		// obj가 Card의 객체를를 참조하고 있으면
			Card c = (Card) obj;		// 부모 클래스니까 참조 하게 형변환하고
			return (this.kind.equals(c.kind)) && (this.number == c.number); 	
					//내용 비교(equals)				// 기본연산자라 ==
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Card c1 = new Card("Spade",1);
		Card c2 = new Card("Spade",1);
		if(c1 == c2) {									//객체
			System.out.println("c1, c2는 같은 객체임");
		} else {
			System.out.println("c1,c2는 다른 객체임");
		}
		if(c1.equals(c2)) {								// 내용
			System.out.println("c1, c2는 같은 종류의 카드임");
		} else {
			System.out.println("c1,c2는 다른 종류의 객체임");
		}
	}
}
