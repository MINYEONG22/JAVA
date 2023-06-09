package chap8;
/*
 *	추상클래스, 인터페이스 => 객체화가 불가능한데,
 *
 * 	강제로 객체화를 시킬 수 있음 : 이름 없는 내부 클래스
 * 		=> 일회성 객체로 생성함
 */
interface Action {
	void action();			// 모든 인터페이스의 접근제한자는 public, public abstract가 생략되어 있는 거. 
}
abstract class Abs {		// abstract class에는
	int num= 100;
	abstract void method();		// abstract 생략 못 함
}
public class InterfaceEx4 {
	public static void main(String[] args) {
		//Action 인터페이스 객체
		Action a = new Action() {// 인터페이스라 객체화가 안 됨. (추상 메스드 때문에)
			@Override				
			public void action() {	//인터페이스 void 강제 객체(구현)화		--interface에는 public 있어야하지만
				System.out.println("Action 인터페이스의 action 메서드");
			
			} // Action 타입으로만 참조할 수 있는 일회용 객체
		};	
		a.action();
		
		
		// Abs 클래스 객체화: Abs의 num값 출력하기
		Abs ab= new Abs() {
			@Override
			void method() {									// Abs는 추상 class이기때문에, public 없어도 됨. 
				System.out.println("num: "+num);
			}
		};
		ab.method();
	
	}

}
