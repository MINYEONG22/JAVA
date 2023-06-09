package chap10;

import java.io.IOException;

/*
 *	오버라이딩에서의 예외처리 
 *	- 부모클래스 메서드의 예외 처리보다, 자식 클래스의 메서드의 예외 처리는 같거나 작은 범위여야함.
 *	  부모 클래스 => 자식 클래스
 *	
 *	접근제한자: 부모클래스 메서드의 접근 제한자보다, 자식 클래스의 메서드의 접근 제한자는 같거나 넓은 범위여야함.
 * 			 부모 클래스 <= 자식 클래스
 */
class Parent {														// 예외처리 해야하는 예외
	void method() throws RuntimeException {
		System.out.println("부모 클래스의 method()");
	}
}
class Child extends Parent {
	void method() throws RuntimeException {	// 자식클래스는 부모클래스보다 더 넓은 범위의 예외처리면 안 됨. Exception 이면 오류
											
		System.out.println("자식 클래스의 method()");
	}
}
public class ExceptionEx7 {

	public static void main(String[] args) throws InterruptedException {
		Child c = new Child();
		c.method();
		Thread.sleep(1000);
	}

}
