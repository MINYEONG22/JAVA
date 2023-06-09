package test2;
/*
2. Coin 클래스와 구동 클래스 구현하기
  Coin 클래스
   멤버변수 : int side (앞면:0, 뒷면:1), serialNo(동전번호), 
            sno(동전번호 생성을위한 클래스변수)
   멤버메서드 : void flip()
                Math.random() 메서드를 사용하여 side를 결정.

  구동클래스
    Coin 클래스의 객체를 10개 생성하기.
    객체생성시, 동전번호를 입력하고, flip() 메서드를 이용하여 각각의 동전이 앞면인지 뒷면인지
    여부를 출력하기

  [결과]
1번 동전 : 앞면
2번 동전 : 앞면
3번 동전 : 뒷면
4번 동전 : 앞면
5번 동전 : 뒷면
6번 동전 : 뒷면
7번 동전 : 뒷면
8번 동전 : 뒷면
9번 동전 : 뒷면
10번 동전 : 뒷면
전체 앞면 동전의 갯수 :3
전체 뒷면 동전의 갯수 :7
 */
class Coin {
	
	int side, serialNo;
	static int sno;
//	Coin() {
//		serialNo = ++sno;								// sno 방법2. 53번줄 대신 여기에 만들어줘도 됨. - 알아서 증가함 
//	}
	void flip() {										// 방법1
		System.out.println(side == 1 ? "앞면":"뒷면");
		}
//	void flip() {										// 방법2
//		side = (int)(Math.random()*2);
//		}
	public String toString() {
		return sno + "번 동전: ";
	}
}

public class Test2 {
	public static void main(String[] args) {
		
		Coin arr[] = new Coin[10];					// 코인 배열 만들기, Coin 참조변수 10개를 저장할 배열 객체
		int total1 = 0, total2 = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Coin();						// 배열 new coin 객체 생성
			arr[i].side = (int)(Math.random()*2);		// 방법1. side에 랜덤으로 숫자 넣기
														// 방법2. arr[i].flip();
			arr[i].serialNo = ++ Coin.sno;				// sno 방법1. 
			System.out.print(arr[i]);
			arr[i].flip();
			
			if(arr[i].side == 1) {
				total1 ++;
			}else {
				total2 ++;
			}
	
		}

		System.out.println("전체 앞면 동전의 갯수: " + total1);
		System.out.println("전체 뒷면 동전의 갯수: " + total2);
	
	}
}
