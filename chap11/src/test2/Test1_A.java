package test2;

public class Test1_A {
	public static void main(String[] args) {
		String str = "1,234";
		int num = Integer.parseInt(str.replace(",",""));
		System.out.println(String.format("%,d", num*10));
		System.out.printf("%,d\n", num*10);	
	}

}
