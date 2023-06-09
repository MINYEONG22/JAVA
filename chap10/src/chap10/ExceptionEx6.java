package chap10;
// 예외 강제 발생
public class ExceptionEx6 {
	public static void main(String[] args)/*방법2*/ throws Exception {
		// throw new Exception("예외 강제 발생");
		
		throw new RuntimeException("예외 강제 발생"); // RuntimeException 쓰면 예외처리 안 해도 되는 예외. 오류 x
		
		//방법1
//		try {
//			throw new Exception("예외 강제 발생");		// Exception은 예외처리 필수
//		} catch (Exception e) {						// 이쪽에서 처리함. 
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
	}

}
