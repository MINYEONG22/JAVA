package chap4;

/*
 *	1~100까지 짝수의 합을 구하기 
 * 
 * 	for
 *  while
 * 	do while
 * 
 */

public class Exam4 {

	public static void main(String[] args) {
		//2의 배수
		int sum = 0, i=0;
		System.out.println("for 구문");
		for ( i=1; i <=100 ; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.println("while 구문");
		sum = 0;			//리셋
		i = 1;
		while(i<=100) {
			if(i%2==0) {
				sum += i;
			}
			i++;							// while 문 안에 있어야함
		}
		System.out.println(sum);
		
		System.out.println("do while 구문");
		sum = 0;			//리셋
		i = 1;
		do {
			if(i%2==0) {
					sum += i;
			}	
			i++;							// do while 문에 있어야함
		} while(i<=100);
		System.out.println(sum);
		
//		=================================================== 
		
		// 2씩 증가
		
		System.out.println("2씩 증가 for 구문");
		sum = 0;			//리셋
		i = 0;
		
		for (i=2; i<=100; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
		
		sum = 0;			//리셋
		i = 0;
		
		System.out.println("2씩 증가 while 구문");
		while(i<=100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		
		sum = 0;			//리셋
		i = 0;
		System.out.println("2씩 증가 do while 구문");
		do {
			sum += i;
			i += 2;
		} while(i<=100);
		System.out.println(sum);
		
	}

}
