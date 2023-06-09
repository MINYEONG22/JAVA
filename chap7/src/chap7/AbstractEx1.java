package chap7;
/*
 * 추상 클래스간의 상속 
 */
abstract class Abs1 {
	int a = 10;
	abstract int getA();
}
abstract class Abs2 extends Abs1{
	int b = 20;
	abstract int getB();
}
class Normal extends Abs2 {
	@Override
	int getA() {
		return a;
	}
	@Override
	int getB() {
		return b;
	}
	public String toString() {
		return "getA():"+a+","+" getB():"+b;
	}
}
public class AbstractEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Normal n = new Normal();
		System.out.println(n+"\n");
		System.out.println("n.a:"+n.a);
		System.out.println("getA():"+n.getA()+"\n");
		System.out.println("n.b:"+n.b);
		System.out.println("getB():"+n.getB()+"\n");
		
		Abs2 a2 = n;		// 형변환
		System.out.println("a2.a:"+a2.a);
		System.out.println("a2.getA():"+a2.getA()+"\n");
		System.out.println("a2.b:"+a2.b);
		System.out.println("a2.getB():"+a2.getB()+"\n");
		

		Abs1 a1 = n;		// 형변환
		System.out.println("a1.a:"+a1.a);
		System.out.println("a1.getA():"+a1.getA()+"\n");
//		System.out.println("a1.a:"+a1.b);
//		System.out.println("a1.getA():"+a1.getB()+"\n");			Abs1에는 멤버가 없음
		
		
		// Object 타입으로 형변환은 가능하지만, Object 타입에는 아래 멤버 변수, 메소드가 없음
		Object o = n;
//		System.out.println(o.a);
//		System.out.println(o.getA());
//		System.out.println(o.b);
//		System.out.println(o.getB());
		
	}

}
