package chap1;

/*
 *  여러줄 주석
 *   주석: 컴파일이 되지 않는 대상
 *   	  - 컴파일러의 번역 대상이 아닌 부분.
 *   	  - 자바의 문법과 관련이 없는 부분으로 자유롭게 작성 가능한 영역
 *   
 *   컴파일러가 이진수로 변역해주는데, 그렇지 않은 부분, 기계어로 바뀌지 않는 부분

 * 
 * 	1. 자바: 대소문자를 구분함.
 *  2. 처음 시작이 public class Hello인경우, 파일의 이름은 반드시 Hello.java 여야함
 *  	- Hello.java인데, public class Hello1 이면 오류
 *  	- 앞에 public~ 이 붙었을 경우만
 *  3. 자바컴파일러(javac)에 의해서 확장자가 .class인 바이트 코드 파일이 생성 됨.
 *  	- 이클립스에서 위치는 bin/폴도의 하위에 생성됨
 *  4. 자바인터프리터(java)가 .class 파일을 읽어 실행함. 
 * 
 *
 */

public class Hello {

	public static void main(String[] args) {  // 프로그램의 시작점, 모든 프로그램은 위에서 아래로 실행
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");		// System 에서 system 으로 쓰면 오류
												// println에서 Println 으로 쓰면 오류
		// ㄴ 표준출력(화면에 출력, 콘솔 출력)

	}

}








