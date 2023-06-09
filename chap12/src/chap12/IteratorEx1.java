package chap12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * 	Iterator 인터페이스 객체 : 반복자
 * 		Collection 객체(List, Set 객체)는 Iterator 객체로 변환이 가능함 : iterator() 메서드 사용.
 * 		
 * 		주요 메서드
 * 			boolean hasNext()	: 조회 대상에 객체가 존재하냐
 * 			Object next()		: 조회 대상 객체를 리턴해라	 - (요즘 많이 안 씀 - 개선 된 for문을 사용해서)
 * 			void remove()		: 조회 한 객체를 제거. next() 실행한 이후에 remove() 가능
 * 												  └ 조회를 해야 객체 제거가 가능해서. 
 * 	
 * Enumeration 인터페이스	: Iterator 반복자 이전 버전
 * 			Collection 프레임워크 이전에 사용하던 반복자.
 * 			Vector, Hashtable 클래스에서만 사용 가능.
 * 		
 * 		주요 메서드
 * 			boolean hasNextElement() : 조회 대상에 객체가 존재하냐
 * 			Object nextElement()	 : 조회 대상 객체를 리턴해라
 * 			제거 메서드 없음.
 */
public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator it = null;
		List list = new ArrayList();
		Set set = new HashSet();
		for(int i=1; i<=5; i++) {
			list.add(i+10);		// 순서유지
			set.add(i*10);		// 순서유지x
		}
		it = list.iterator();		// list를 iterator의 참조변수로 변경
		print(it);
		it = set.iterator();		// set를 iterator의 참조변수로 변경
		print(it);
		System.out.println("print() 이후 list: " + list);
		System.out.println("print() 이후 set: " + set);
	}

	private static void print(Iterator it) {
		while(it.hasNext()) {				// 조회할 객체가 있냐,
			System.out.println(it.next());	// 하나씩 조회(리턴,출력)하고
			it.remove();					// 지워라
		}									// => 반복자(외부 반복자)
	}
}
