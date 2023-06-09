package chap7;

import chap7.test.Modifier2;
//import chap7.test.Modifier4;		import도 불가

/*
 *	접근 제한자 : private < (default) < protected < public
 *	class의 접근 제한자 : default, public 
 * 	변수, 상수, 메서드(생성자)에도 붙을 수 있음 : private < (default) < protected < public
 * 	생성자 제한자: 객체생성에 관여하는 method라 private < (default) < protected < public 네 개 다.
 * 	
 *  생성자도 method, - 인스턴스 메서드	this는 인스턴스 메서드에서만 쓸 수 있음 - 생성자에서 this...
 *  구동 class는 public이 항상 붙어야함
 * 
 */
public class ModifierEx2 {

	public static void main(String[] args) {		// static 없으면 객체화 해야함 main method에 static 필수
		Modifier3 m3 = new Modifier3();
		m3.method();
		Modifier2 m2 = new Modifier2();		// 패키지가 달라서, import 해줘야함, class의 접근제한자가 public이라 패키지가 달라도 접근 가능
		m2.method();
//		Modifier4 m4 = new Modifier4();		// Modifier4 class의 접근제한자가 default라 다른 패키지에서 접근 불가
//		m4.method();
	}

}
