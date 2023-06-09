package test;
/*
 * Coin 클래스를 이용하기.
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 * 앞면이 연속해서 3번 나오면 승리. => myCoin 승리, youCoin 승리, 비김.  
 */
class Coin {
	int side;
	void flip() {
		side = (int)(Math.random()*2);
	}
}
public class Test1 {
	public static void main(String[] args) {	
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();

		int mycount = 0, youcount=0;
		
		System.out.println("MyCoin\tYouCoin");
		
		while(true) {
			myCoin.flip();
			youCoin.flip();
			
		}
		
	}
}
