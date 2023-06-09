package chap4;
/*
 * 	1~10까지의 합 구하기
 */
public class LoopEx2 {
	public static void main(String[] args) {
		int sum = 0, i=0;		
		for( i=1; i<=100; i++) {
			sum += i;		// 더한 값에 + i, i는 10까지 ++ 증가한다.
							// 0+1
							// 1+2
							// 3+3
							// 6+4
							// 10+5
							// 15+6
							// 21+7
							// 28+8
							// 36+9
							// 45+10
							// =>55
		}
		System.out.println("합계:"+sum);
	
		for(int a=1; a<=5; a++) {	}			// for(a=1; a<=5; a++)  이렇게만 쓰면 오류, int 등 넣어줘야함!
		
		System.out.println("while 구문으로 합 구하기");
		while (i<=10) {
			sum += i;
			i++;
		}
		System.out.println("합계: "+sum);		// sum은 지역변수 아니니까 밖에
		
		sum = 0;
		i=1;				// 변수 선언에 대한... 알고리즘...
		System.out.println("do while 구문으로 합 구하기");
		do {
			sum += i;
			i++;
		} while (i<=10);
		System.out.println("합계: "+sum);	
	}
}
