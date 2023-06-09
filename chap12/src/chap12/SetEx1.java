package chap12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 *	Set 인터페이스 : Collection 인터페이스의 하위 인터페이스 
 * 				  중복 불가. 첨자 불가.
 * 	구현 클래스: HashSet, TreeSet, LinkedHashSet
 * 			HashSet: 중복 불가, 순서 모름. 
 * 			TreeSet: 중복 불가, 정렬 가능.
 * 			LinkedHashSet: 중복 불가, 순서 유지.
 * 			
 * 			Set: 첨자 다 못 씀.
 * 
 * 			boolean 타입으로 리턴해줌	 -> true: 추가 성공, false: 추가 실패
 * 			add(Object)
 */
public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"홍길동",1,"1","김삿갓","이몽룡","홍길동","성춘향","향단이","홍길동","김삿갓"};
		Set<Object> set1 = new LinkedHashSet<>();
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			if(!set1.add(arr[i])) {
				if(!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		// 모든 Collection 객체는 개선된 for문이 가능함.
		// Set, List 다 가능.
		System.out.println("set1:");
		for(Object o : set1) {
			System.out.println(o);
		}
		
		System.out.println("set2:");
		for(Object o : set2) {
			System.out.println(o);
		}
		
		System.out.println("set3:");
		for(Object o : set3) {
			System.out.println(o);
		}
	}
}
