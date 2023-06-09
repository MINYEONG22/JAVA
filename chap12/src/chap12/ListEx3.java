package chap12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * List 정렬하기
 * 	요소의 자료형이 Comparable 인터페이스를 구현한 클래스만 sort(List) 가능함. 
 * 
 *  Comparable 인터페이스 => comparaTo() 추상 메서드를 멤버로 가짐
 * 	
 * 	정렬관련 인터페이스
 *  1. Comparable: 요소의 클래스에 구현함.	(기본 정렬방식 설정)
 *  			 : 해당요소의 클래스의 기본정렬방식 설정함.
 *   			 : int compareTo(Object o) 추상메서드를 멤버로 가짐.
 * 
 *  2. Comparator: 요소에 구현 된 기본 정렬 방식과 다른 정렬을 하고 싶을 때 사용.
 *  			 : 동적으로 정렬방식을 설정.
 *  			 : Collections.sort(List,Comparator 객체)
 *  			 : int compare(Object o1, Object o2) 추상메서드 멤버로 가짐 
 * 					- 결과가 음수: o1 객체를 앞쪽으로 인식,
 * 					- 결과가 양수: o2 객체를 뒤쪽으로 인식
 * 				 : Comparator<Object> Comparator.reverseOrder()
 * 					- 기본 정렬 방식의 역순으로 정렬		↑ Comparator 인터페이스의 static 메서드
 */
class Data implements Comparable<Data>{
	int value;
	Data(int value) {
		this.value = value;
	}
	@Override
	public int compareTo(Data d) {
		return value - d.value;			// 값을 빼서 정수 나오면 뒤로, 음수 나오면 앞으로 반복해서 순서 지정
	}
	@Override
	public String toString() {
		return value+"";
	}
	
}
class Data2 {
	int value;
	Data2(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return value+"";
	}
}
public class ListEx3 {
	public static void main(String[] args) {
		// String 객체의 기본정렬방식: 오름차순 정렬
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("e");
		Collections.sort(list);			// s 붙여아함!
		System.out.println(list);
		Collections.sort(list,Comparator.reverseOrder());	// 기본 오름차순 정렬을 => 내림차순 정렬로 변경
		System.out.println(list);		// ↑ static 메서드
		
		// Class에서 Comparator
		List<Data> list2 = new ArrayList<>();
		list2.add(new Data(3));		// list2에 들어갈 수 있게 형변환이 돼야함.
		list2.add(new Data(2));
		list2.add(new Data(1));
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println("list2 객체 내림차순 정렬");
		Collections.sort(list2,Comparator.reverseOrder());	// 내림차순 정렬
		System.out.println(list2);
		
		// 강제 Comparator
		List<Data2> list3 = new ArrayList<>();
		list3.add(new Data2(3));		// list2에 들어갈 수 있게 형변환이 돼야함.
		list3.add(new Data2(2));
		list3.add(new Data2(1));
		// ↓ 8.0 이전 버전
		Comparator<Data2> c = new Comparator<>() {	 // Comparator 인터페이스로 정렬을 따로 지정해줌, 동적으로 정렬 지정
			@Override
			public int compare(Data2 d1, Data2 d2) {
				return d1.value - d2.value;			// 내림차순하려면 d2.value - d1.value;	
			}										// or (d1.value - d2.value)*-1;	
		};
		// 람다방식 수정
		System.out.println("람다방식 알아놔야함.");
		Collections.sort(list3,(d1,d2) -> d1.value - d2.value);
		System.out.println(list3);
		
		
		Collections.sort(list3,c);	// c라는 정렬 방식을 지정해서 sort
		System.out.println(list3);
		
		// 보통 68번줄부터 코딩 ↓ 방식으로 함
		Collections.sort(list3,new Comparator<>() {	 
			@Override
			public int compare(Data2 d1, Data2 d2) {
				return d1.value - d2.value;
			}
		});
		System.out.println(list3);
	}
}
