package chap10;
/*
 *	사용자 예외 클래스 생성하기 
 *		
 *	 Exception 클래스를 상속: 반드시 예외 처리가 필요한 예외 클래스 생성.
 *	 RuntimeException 클래스 상속: 예외 처리를 생략할 수 있는 예외 클래스 생성.
 *
 */
class LoginFailException extends Exception {
	LoginFailException(String msg) {
		super(msg);
	}
}
class LoginFailException2 extends RuntimeException {
	LoginFailException2(String msg) {
		super(msg);
	}
}
public class ExceptionEx8 {
	public static void main(String[] args) {
		String id = "hong1";
		String pw = "1234";
		
		try {
			if(!id.equals("hong") || !pw.equals("1234")) {
				throw new LoginFailException("아이디 혹은 비밀번호가 틀렸습니다.");
			}
			System.out.println("로그인 되었습니다.");
			throw new LoginFailException2("RuntimeException 클래스 상속");	// 예외처리 안 해도 됨.
		} catch(LoginFailException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
