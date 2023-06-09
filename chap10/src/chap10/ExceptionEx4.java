package chap10;
/*
 *	throws: 예외처리
 *			예외던지기 : catch 처럼 잡아서 없애는 게 아닌, 예외가 발생한 메서드에서 호출한 메서드로 예외를 전달.
 *					 => 호출한 메서드로 예외 객체가 전달. 호출한 메서드에서 예외 발생. 
 */
public class ExceptionEx4 {
	public static void main(String[] args) throws Exception {	// catch(RuntimeException)를 해결하려면 main에서 throws Exception으로 해결
		try {
			first();
		} catch (RuntimeException e) {							// 3. 이쪽에서 해결	Exception을 받았는데 catch(RuntimeException)이면 오류
															 	//	  catch(Exception)이면 가능 
			System.out.println("숫자만 가능합니다.");
			e.printStackTrace();	// 예외가 발생한 예외 정보를 출력 어디서 에러가 난 건줄 알아야하니까.
		}
	}
	
	private static void first() throws Exception {
		System.out.println("first 메서드");
		second();										// 2. 호출한 매서드 first();로 또 던져 
	}
	
	private static void second() throws Exception /*throws RuntimeException*/ {	//기본 throws RuntimeException 생략되어있음
		System.out.println("second 메서드");
		System.out.println(Integer.parseInt("abc"));	//NumberFormatException	
														// 1. 호출한 매서드 second() 위로 던져
	}

}
