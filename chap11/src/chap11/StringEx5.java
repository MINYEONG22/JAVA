package chap11;
// 문자열을 숫자로 변경
public class StringEx5 {
	public static void main(String[] args) {
		int i = Integer.parseInt("100");
		System.out.println(i+200);
		
		float f = Float.parseFloat("100.5");		//문자열인데 숫자로 바꿔서 출력해줌...
		System.out.println(f+200);
	
		double d = Double.parseDouble("100.5");
		System.out.println(d+200);
		
		Long l = Long.parseLong("100");
		System.out.println(l+200);
		
		System.out.printf("%02X\n",255); //255를	16진수로 변경 => FF
		System.out.println(Integer.parseInt("FF",16)); //FF를 16진수로 변경 => 255
		
		i = Integer.parseInt("11",8); // 문자열 11을 8진수로 인식해서 정수로 변환
		System.out.println(i);
		
	}
}
