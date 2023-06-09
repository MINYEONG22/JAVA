package chap6;
/*
 *	멤버변수 : int num, boolean isKwang (false)
 *  멤버 메서드: toString()
 *  
 * [결과]
 * 3
 * 1k (k, true)
 * 
 */
class SutdaCard {
	int num;
	boolean isKwang;					// boolean도 이름 넣어주고
	SutdaCard (int n, boolean b) {		// 매개변수 명
		num = n;
		isKwang = b;
	}
	SutdaCard () {
		num = 1;
		isKwang = true;
	}
	public String toString() {
		return num + (isKwang?"k":"");
	}
}
public class Exam4 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, false);
		SutdaCard c2 = new SutdaCard();
	    System.out.println(c1);			// 3
	    System.out.println(c2); 		// 1k
	}
}
