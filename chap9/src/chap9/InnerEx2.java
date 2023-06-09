package chap9;

import chap9.Outer2.StaticInner;
/*
 *	외부 클래스의 private 멤버 호출
 * 
 */
class Outer2 {
	private int outeriv = 10;				// private이라 다른 class에서는 사용 불가. 구동영역에서 x
	private static int outercv = 20;
	class InstanceInner {
		int iiv =  outeriv;		// 로드되면 객체화 될 거고
		int iiv2 = outercv;		
	}
	static class StaticInner {
		// 클래스 멤버에서 인스턴스 멤버 호출 시 객체화 필요.
//		int siv = outeriv;		오류	// StaticInner는 Outer2 클래스의 클래스 멤버.
		int siv = new Outer2().outeriv;		//Outer2의 outeriv는 객체화 시켜야 변수로 사용되니까.
		static int scv = outercv;
	}
	
	/*
	 * 						   메서드가 가지고 있는 지역변수는 상수가 돼야함. 
	 * 	- 지역 내부 클래스에서 사용되는 메서드의 지역번수는 상수화 되어야 한다.
	 * 
	 * 	지역변수의 변경이 없는 경우는 상수로 판단함.
	 *  ∴ 지역변수의 변경이 있는 경우, 오류 발생
	 * 
	 */
	
	void method(int pv) {
//		pv++;		// 자기가 속한 지역변수는 상수가 돼야함. 지역 변수는 변경되면 안 됨.
		final int pv2 = pv+1;		// 처음 초기화로 +1 넣어주는 건 가능. final로 변경 안 되는 표시 해주는 게 안전.
//		pv2++;
		class LocalInner {
			int liv = outeriv;
			int liv2 = outercv;
			void method(int num) {
				outeriv++;		// 지역 내부 클래스의 지역 변수 아니라 변동해도 상관 없음.
				System.out.println("inner class 안의 method()-----------");
				System.out.println("outeriv= "+outeriv);
				System.out.println("outercv= "+outercv);
				System.out.println("liv= "+liv);
				System.out.println("liv2= "+liv2);
				num++;			// 나의 지역변수
				System.out.println("num= "+num);
//				pv++;			// pv 입장에서의 변수 - 오류
				System.out.println("pv= "+pv);
				System.out.println("pv2= "+pv2);
			}
		}
		LocalInner loinner = new LocalInner();				// private이라 여기서 구현하고 구동영역에서 method()로 출력
		System.out.println("loinner.liv: "+loinner.liv);	// 내부 클래스에선 private 접근 가능
		System.out.println("loinner.liv2: "+loinner.liv2);
		loinner.method(pv);
	}
}
public class InnerEx2 {

	public static void main(String[] args) {
		
		// 내부 클래스 3개의 멤버 값들을 출력하기
		
		System.out.println("내부 인스턴스 클래스-----------");
		Outer2.InstanceInner insinner = new Outer2().new InstanceInner();
		System.out.println("insinner.iiv: "+insinner.iiv);
		System.out.println("insinner.iiv2: "+insinner.iiv2);
		
		System.out.println("내부 static 클래스-----------");
		Outer2.StaticInner sinner = new Outer2.StaticInner();
		System.out.println("sinner.siv: "+sinner.siv);
		System.out.println("sinner.scv: "+sinner.scv);
		System.out.println("sinner.scv: "+Outer2.StaticInner.scv);
		
		System.out.println("내부 method inner 클래스-----------");
		Outer2 out2 = new Outer2();		// 외부클래스 객체화
		out2.method(10);
	}

}
