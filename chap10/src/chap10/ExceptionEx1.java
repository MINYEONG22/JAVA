package chap10;
/*
 *	예외처리: 발생 된 예외를 정상화 하는 과정 
 *		try 블럭: 예외 발생 가능성이 있는 문장들의 모임. 예외 발생 시 catch 블럭으로 제어 이동
 *		catch 블럭: try 블럭에서 발생 된 예외를 처리
 *				   try 블럭에서 예외 발생 시 호출되는 블럭.
 *				   반드시 try 블럭과 함께 사용해야함.
 *	
 *							 	 ┬ 최상위 Exception (예외처리)
 *								 │		
 *	예외처리 생략 가능한 예외 클래스 	┌ RuntimeException
 *							└ 그 외 Exception
 *
 *	예외처리	┌ try catch finally
 *	(없애는)	└ throws
 *	
 *	발생시키는 - throw
 *
 */
public class ExceptionEx1 {

	public static void main(String[] args) {
//		System.out.println(args[0]);		ArrayIndexOutOfBoundsException 오류 생김 데이터가 없으니까. 
		try {
			System.out.println(args[0]);	// 위의 오류 생겼었는데, try 안에서 발생하면 catch로 넘어가서
			System.out.println(1/0);		// ArithmeticException 예외 발생	catch는 이 오류 못 잡음
			System.out.println(2);
		} catch (ArrayIndexOutOfBoundsException e) {	//예외는 e가 잡고 있고, 
			System.out.println("command 라인에 파라미터를 입력하세요");	// 다른 안내 메시지 출력하고
		}
		System.out.println("프로그램 종료");	// 끝
		//if else랑 비슷
		// 오류가 없으면 catch 블럭 실행되지 않음.
		
		
	
	}
	
}
