package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  Collection 인터페이스: 객체를 여러 개 저장할 수 있는 객체.
 * 
 *	List 예제
 *	List 인터페이스	 : Collection 인터페이스의 하위 인터페이스
 *	               객체들을 저장할 때 순서를 유지함 => 첨자 사용 가능. (ex get(0), get(1) ... )
 *				   가변 배열이라고도 함 
 * 				   기본자료형 (ex int) 못 모음
 * 	Set 인터페이스	: Collection 인터페이스의 하위 인터페이스
 * 				  객체들을 중복해서 저장하지 않음
 */
public class ListEx1 {
	public static void main(String[] args) {
		//<Integer> : 제네릭. (유전자) 
		// Integer 객체만 모으겠다.
		List<Integer> list = new ArrayList<>();		// <> 안에 Integer 생략되어있음. jdk8.0 이후에 생략이 가능함.
													// <Integer> 자료형. 
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(0);
		list.add(3);
		System.out.println(list);
		
		// 첨자를 이용하여 출력하기
		for(int i=0; i<list.size(); i++ ) {			// list.size() : Element(요소)의 갯수 list 객체에 저장 된 객체의 객수
			System.out.println(i+": "+list.get(i));
		}	
	
		// Collection: 인터페이스. List와 Set의 상위 인터페이스
		// Collections: 클래스. Collection 객체들의 보조 클래스 
		
		Collections.sort(list);			// 정렬
		System.out.println(list);
		Collections.shuffle(list);		// 섞기
		System.out.println(list);
										
		List<Integer> list2 = new ArrayList<>(list.subList(1, 4));		// list의 1~4앞까지
		System.out.println(list2);
		
	}
}
