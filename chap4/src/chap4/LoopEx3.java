package chap4;
/*
 *	중첩 반복문: 반복문 내부에 반복문이 존재. 
 * 			  엇갈리게는 안 돼
 */
public class LoopEx3 {
	public static void main(String[] args) {
		for (int i=2; i<=9; i++) {		// i는 안에 있는 for 문에서 다 사용 가능
			System.out.println("\n"+ i +"단");
			for(int j=1; j<=9; j++) {		//j는 밖에 있는 for 문에서 사용 불가
				System.out.println(i+"x"+ j + " = "+ i*j);
			}
		}
	}
}
