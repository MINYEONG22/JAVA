package chap11;
// main 메서드에서 change() 실행 후 ABC123456이 출력되도록 프로그램 수정하기
public class StringEx2 {
	public static void main(String[] args) {

		String str = "ABC123";
		System.out.println("main: "+str);
//		change(str);
		str = change(str);							// 3.
		System.out.println("change 후 main: "+str);	// 여기선 ABC123
	}
/*
	private static void change(String str) {		// 참조값 String 참조값은 원래 변경이 가능한데,
		str +="456";
		System.out.println("change: "+str);			
	}												// 여기서 참조하고, 다시 메인으로 돌아가면 역활 끝, 참조값이 사라짐
*/	
	private static String change (String str) {		// 1. main에서도 변경 값 전달해주려면 String
		str +="456";
		System.out.println("change: "+str);			
		return str;									// 2. return
	}
}
