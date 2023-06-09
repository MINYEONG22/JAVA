package chap12;

import java.util.List;
import java.util.Vector;

/*
 *	Vector 클래스
 *		- Collection 프레임 워크 이전 클래스
 *		- List 인터페이스의 구현 클래스
 *		- 이전에 사용된 메서드와 List를 구현한 메서드가 함께 존재함 
 *
 *	List - 리턴타입 void
 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
	//	List<Double> list = new Vector<>();
		list.add(0.3);				// List 인터페이스의 메서드
		list.add(Math.PI);
		list.addElement(5.0);		// 이전에 사용한 Vector 클래스의 메서드. add() 메서드와 같은 기능 (Vector타입에서만 사용 가능)
									// List 인터페이스로 객체 생성하면 사용 못 함.
		System.out.println(list);
		
		// 요소의 위치(index) 찾기
		double num = 5.0;
		int index = list.indexOf(num);	// indexOf num의 index 위치
		if(index < 0) {
			System.out.println(num+"은 list에 없는 요소입니다.");
		} else {
			System.out.println(num+"의 위치: "+index);
		}
		// contains(): list 의 요소로 존재하냐.
		if(list.contains(num)) {
			System.out.println(num+"은 존재함");
		} else {
			System.out.println(num+"은 존재하지 않음");
		}
		
		// 0.3 요소를 제거하기
		list.remove(0.3);					// list의 0.3 객체 지워라
		System.out.println(list);
		System.out.println(list.get(0));	// 0번째 index값 가지고 오기
		list.remove(0);						// 0번 index값 지워라
		System.out.println(list);
	}
}
