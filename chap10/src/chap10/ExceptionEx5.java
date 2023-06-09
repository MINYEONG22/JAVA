package chap10;
/*
 *	throws: 예외 처리. 발생된 예외를 호출한 메서드로 전달하여 예외 처리. 
 * 	throw : 예외 발생. 없는 예외를 발생시킴.
 */
public class ExceptionEx5 {
	public static void main(String[] args) {
		try {											// 4. 위로 올라가서 main catch에서 처리
			first();
		} catch (Exception e) {
			System.out.println("mine 메서드에서 예외 처리");
		}
	}
	private static void first() {						 // 3. 이쪽으로 오고, 해결을 못 하니 throws로 넘겨서
		System.out.println("first 메서드");
		second();
	}
	private static void second() {
		System.out.println("second 메서드");
		try {
			System.out.println(Integer.parseInt("abc"));
		} catch (Exception e) {
			System.out.println("second 메서드에서 예외 처리");	// 1. 이쪽에서 예외 발생하고, 여기서 알아서 처리 ... 했는데,
			throw e;										// 2. 다시 없는 예외를 발생시켜서 - 전달할 데가 없으니, 
		}
	}
}
