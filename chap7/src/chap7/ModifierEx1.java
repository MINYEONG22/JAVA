package chap7;

import chap7.test.Modifier2;

/*
 * 	제한자: 접근제한자, 그외 제한자 (static, abstract, final)
 *  
 *  접근제한자	★암기
 *  private < (default) < protected < public
 *  	
 *  			 동일클래스  동일패키지 상속 관계   그외
 * 
 *  private		│   o	│	x	│	x	│	x		- 동일 클래스만 가능
 *  			
 *  default		│	o	│	o	│	x	│	x		- 같은 클레스, 패키지 내만
 *  
 *  protected	│	o	│	o	│	o	│	x		- 
 * 
 *  public		│	o	│	o	│	o	│	o		- 다 가능 허용범위가 가장 큼
 *  
 *  	o: 접근 가능
 *  	x: 접근 불가
 *  
 */
class Modifier {
	private 	int v1 = 100;
				int	v2 = 200;	// default 임... 아무것도 없는 건 default 접근 제한자
	protected 	int v3 = 300;
	public int v4 = 400;
	public void method () {
		System.out.println("chap7.Modifier 클래스의 method()");
		System.out.println("v1 ="+v1);
		System.out.println("v2 ="+v2);
		System.out.println("v3 ="+v3);
		System.out.println("v4 ="+v4);
		System.out.println();
	}
}
class Modifier3 extends Modifier2 {
	public void method() {
		System.out.println("chp7.Modifier3 클래스의 method");
		// v1: chap7.test.Modifier2 클래스 내에서만 접근 허용
//		System.out.println("v1 ="+v1);		// private이라 오류
		
		// v2: chap7.test 패키지 내에서만 접근 허용
		// chap7.Modifier3 클래스에서는 접근 불가.
//		System.out.println("v2 ="+v2);		// 동일 패키지가 아니라 오류 
		
		// Modifier2와 Modifier3 다른 패키지지만 상속관계여서 접근 허용
		System.out.println("v3 ="+v3);		// 상속관계여서 가능
		
		System.out.println("v4 ="+v4);
		
		//생성자의 접근제한자 : private => 객체 생성 제한
		System.out.println(Math.random());
//		Math m = new Math();		//오류발생 Math 클래스의 생성접근자가 private => 외부에서는 객체 생성 불가
		// Math -> final, private 생성자... 
		// 생성자를 안 만들면 기본생성자를 컴파일러가 만들어줌. - private 해놓으면 기본생성자 제공 x, 외부에서 객체 생성 불가
	
	}
}
public class ModifierEx1 {

	public static void main(String[] args) {
		
		Modifier m = new Modifier();
//		m.method();
												// Modifier 클래스 v1 멤버의 접근 제한자가
//		System.out.println("m.v1 ="+m.v1);		// private이라 다른 class에서 접근하지 못 함
		System.out.println("m.v2 ="+m.v2);
		System.out.println("m.v3 ="+m.v3);
		System.out.println("m.v4 ="+m.v4);
		System.out.println();
		
		Modifier2 m2 = new Modifier2();
		m2.method();
//		System.out.println("m2.v1 ="+m2.v1);		동일 클래스가 아니라서
//		System.out.println("m2.v2 ="+m2.v2);		동일 패키지가 아니라서
//		System.out.println("m2.v3 ="+m2.v3);		상속관계가 아니라서 에러	
		System.out.println("m2.v4 ="+m2.v4);
	}
	
}
