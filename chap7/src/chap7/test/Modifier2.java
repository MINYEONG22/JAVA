package chap7.test;
// chap7.ModifierEx1 클래스에서 Modifier2 클래스의 객체 생성하고 모든 멤버 호출하기
public class Modifier2 {		// 하나의 파일에는 하나의 public class만 가능함. 파일명과 같아야하는데 뭔지 모름.

	private 	int v1 = 10;
				int v2 = 20;
	protected 	int v3 = 30;
	public 		int v4 = 40;
	public void method() {
		System.out.println("chap7.testModifier2 클래스의 method()");
		System.out.println("v1 ="+v1);
		System.out.println("v2 ="+v2);
		System.out.println("v3 ="+v3);
		System.out.println("v4 ="+v4);
	}

}

class Modifier4 {
	public int num = 100;
}
