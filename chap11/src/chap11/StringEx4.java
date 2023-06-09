package chap11;
/*
 *	String.format 메서드: 형식화된 문자열(서식문자사용) 리턴
 *						클래스(static) 메서드 => 객체화 필요없음
 *	class명.메서드명 
 *	
 *	형식화문자: %d, $f, $c...
 *		=> System.out.println(); 함수와 사용법 동일.
 *
 */
public class StringEx4 {
	public static void main(String[] args) {
		// %f: 부동 소숫점 표시 문자. 실수표시
		// %.2f: 소숫점 이하 2자리까지 표시 (자동 반올림)
		String sf = String.format("%.2f", 0.142);
		System.out.println(sf);
		sf = String.format("%.2f", 0.145);
		System.out.println(sf);
		sf = String.format("%10.2f", 0.145);
		System.out.println(sf);
		
		// %d: 10진수 정수 출력
		sf= String.format("%d", 12345);
		System.out.println(sf);
		// %,d: 10진수 정수 출력 -- 3자리마다 , 출력
		sf= String.format("%,d", 10000000);
		System.out.println(sf);
		System.out.printf("%,d", 10000000);
		System.out.println();
		
		// %10d: 10진 정수 출력, 10자리 확보 후 출력
		System.out.printf("%10d\n",10000);
		// %-10d: 10진 정수 출력, 10자리 확보 후 출력
		System.out.printf("%-10d\n",10000);  //좌측정렬
		// %010d: 10진 정수 출력, 10자리 확보 후 출력
		System.out.printf("%010d\n",10000); // 빈자리는 0으로 표시해라. -표시 불가.
		// %,10d: 10진 정수 출력, 10자리 확보 후 세 자리마다 , 출력
		System.out.printf("%,10d\n",10000);
		// %-,10d: 10진 정수 출력, 10자리 확보 후 세 자리마다 , 출력하고 좌측정렬
		System.out.printf("%-,10d\n",10000);
		// %-,4d: 10진 정수 출력, 4자리 확보 후 세 자리마다 , 출력하고 좌측정렬
		System.out.printf("%-,10d\n",10000); 	// 최소 4자리는 확보하고, 숫자가 10자리면 다 찍는 거.

		// %X(대문자), %x(소문자) : 16진 정수 출력
		System.out.printf("%X,%x\n",255,255);
		System.out.printf("%5X,%05x\n",10,10); //5자리 확보하고, 5자리 확보하고나머지는 0으로
					 
		// %o : 8진정수 출력
		System.out.printf("%o\n",10);
		
		// %s : 문자열 출력
		System.out.printf("%s\n","김토이");
		System.out.printf("%10s\n","김토이");	 // 10자리 확보하고 문자열
		System.out.printf("%-10s\n","김토이"); // 10자리 확보하고 좌측	
		
		// %s : 문자 출력
		System.out.printf("%c%c%c\n",'김','토','이');
	
		// 여러개의 자료형 출력
		System.out.printf("%s의 학점은 %c입니다. 점수는 %3d점입니다.\n","토이",'A',100);
		System.out.println(String.format("%s의 학점은 %c입니다. 점수는 %3d점입니다.","토이",'A',100));
		
		
		
		
		
		
		
		
		
		
		
	}
}
