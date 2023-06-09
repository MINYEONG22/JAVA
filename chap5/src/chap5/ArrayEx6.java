package chap5;
/*
 * Command line 에서 파라미터 받기
 * 
 */
public class ArrayEx6 {

	public static void main(String[] args) {	//프로그램 시작 - 구동클래스
							// 매개변수
		
	/*
	 * 	1. 소스 코딩
	 *  2. 컴파일러에 의해 실행. 
	 * 		- .class 바이트 코드 생성
	 *  	- javac ArrayEx6.java	=> ArrayEx6.class 바이트 코드가 생성이 됨.
	 *  3. 바이트 코드 실행. 인터프리터로 실행
	 *  	- java ArrayEx6
	 *  4. java 인터프리터의 기능
	 *  	- jvm 환경 설정
	 *  	- 바이트코드 메모리에 로드. 컴파일러에의해 만들어진 바이트 코드인지 검증. 
	 *  	- main 메서드 호출. args 배열의 값을 설정 가능
	 *  
	 */
		
		if(args.length == 0) {
			
			System.out.println("command 라인에 파라미터를 입력하세요.");
			
			return;		//현재 메서드를 종료해라 -> 현재 메서드(main 메서드) 종료해라 => 프로그램 종료 
			
			
		}
		
		for (String a : args) {		// a에 args를 찍음
			
			System.out.println(a);
			
		}
		
		
		
		/*
		 *	jvm 메모리 구조
		 *	
		 *	클래스영역 : 클래스 정보
		 *	스택 영역 : 메서드 영역
		 *	 ㄴ Stact  Lifo (Last in First Out) / 마지막에 들어간 게 맨 처음에 나옴	(수직형)
		 *	   Queue  FiFo (First in First Out)	/ 처음에 들어간 게 처음에 나옴 (수평형)
		 *	힙영역 : 객체영역 
		 * 
		 */
		
		

		
	}

}
