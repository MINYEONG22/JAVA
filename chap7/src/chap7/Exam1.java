package chap7;
/*
 *	Product 클래스
 * 	멤버변수: 가격(price), 포인트(point)
 *  생성자: 가격을 입력 받고, 가격의 10%를 포인트로 저장 
 *  
 *  Tv 클래스
 *  가격: 100으로 설정
 *  toString() : 리턴 TV
 *  
 *  Computer 클래스
 *  가격: 200으로 설정
 *  toString() : 리턴 Computer
 *  
 *  HandPhone 클래스
 *  가격: 150으로 설정
 *  toString() : 리턴 핸드폰
 *  
 *  
 */
class Product {
	int price, point;
	Product (int price) {			// 생성자 - 자식 class에 super(100) 하면 Product로 들어가서 price와 point까지 계산 됨.
		this.price = price;
		point = price/10;
	}
}
class Tv extends Product{

	Tv (){					// 부모클래스의 생성자대로 호출해야함
		super(100);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product {
	Computer (){
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}
class HandPhone extends Product {
	HandPhone (){
		super(150);
	}
	@Override
	public String toString() {
		return "HandPhone";
	}
}
/*
 *	Buyer 클래스
 *	멤버변수: money = 500, point
 *	Product[] items = new Product[5];
 *	int cnt;
 *	멤버 메서드: void buy(Product p)
 *				1. p 상품의 가격을 money에서 차감
				2. p 상품의 포인트만큼 point에 증가
 *			  	3. items에 p 제품 추가, cnt 증가
 *				4. p 제품의 이름 출력	ex) tv구입
 *			  void summary() 
 *				1. 구매 제품 전체의 합계. 포인트 합계
 *				2. money에서 차감한 잔액.
 * 				3. 전체 구매 물품 이름
 */
class Buyer{
	int money = 500;
	int point, cnt;
	Product[] items = new Product[5];					
	void buy(Product p) {		// 매개 변수 Product p
		money -= p.price;
		point += p.point;
//		3. items에 p 제품 추가, cnt 증가
		items[cnt++] = p;
//		4. p 제품의 이름 출력	ex) tv구입
		System.out.println(p+" 구입");
	}
	void summary() {
//		1. 구매 제품 전체의 합계. 포인트 합계
		int totAmt = 0, totPoint =0;
		String itemName = "";	//3.
		for(int i = 0; i<cnt; i++) {				// items[]에 cnt 된 갯수만큼 price 더하고, point 더하고
													// cnt 갯수 - buy에서 결정된 거. buy - main에서
			totAmt += items[i].price;				// items[i]객체, 프로덕트 타입, 프로덕트에 있는 toString 호출   74번째 줄
			totPoint += items[i].point;
			itemName += items[i]+", ";
		}
		System.out.println("구매 금액 합계:"+totAmt);
		System.out.println("구매 포인트 합계:"+totPoint);
//		2. money에서 차감한 잔액.
		System.out.println("잔액:"+money);		// 위(buy())에서 이미 계산 됨
//		3. 전체 구매 물품 이름
		System.out.println("구매 물품 목록: " + itemName);
	}
}
public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		
		System.out.println(t+" => "+t.price+"만원, 포인트:"+t.point);
		System.out.println(t);	// 자식 class의 return 값만 나옴 자식 class에는 변수 price와 point가 없어서
		System.out.println(c+" => "+c.price+"만원, 포인트:"+c.point);
		System.out.println(h+" => "+h.price+"만원, 포인트:"+h.point);
	
		Product[] p = new Product[3];		// 프로덕트 타입의 참조변수 3개의 배열로 생성
		p[0] = t;
		p[1] = c;
		p[2] = h;
		int sumPrice = 0;
		int sumPoint = 0;
		for(int i = 0; i<p.length; i++) {
			sumPrice += p[i].price;
			sumPoint += p[i].point;
		}
		System.out.println("전체 제품의 가격: "+sumPrice+"만원");
		System.out.println("전체 제품의 포인트: "+sumPoint+"포인트");
		
		// Buyer
		Buyer b = new Buyer();
//		void buy(Product p) { 부분 
		b.buy(t);
		b.buy(c);
		b.buy(h);
		b.summary();
		System.out.println("main Buyer 잔액:"+b.money);
		System.out.println("main Buyer 적립 포인트:"+b.point);
		
	}

}
