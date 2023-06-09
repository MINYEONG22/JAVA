package test2;
/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)     
 [결과]
 가나다    
  가나다  
    가나다
가나
 
 */
public class Test2 {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 0));
	}

	private static String format(String str, int len, int align) {
		
		String st = String.format("%"+len+"s", str);
		
		if (str.length() >= len) {
			return str.substring(0, len);
		}		// 위치, 위쪽에 있어야 함. 
		if(align == 0) { //왼쪽정렬
			st = String.format("%-"+len+"s", str);
			return st;
		} 
		if(align == 1) {// 가운데 정렬
			StringBuffer sb = new StringBuffer();
			int l = (len-str.length())/2;
			// System.out.println(l);
			for (int i = 0; i<l; i++) {
				sb.append(" ");
			}
			sb.append(str);
			return sb.toString();
		}
		return st;
	}
}
