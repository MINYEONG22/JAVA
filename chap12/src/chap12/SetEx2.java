package chap12;

import java.util.HashSet;
import java.util.Set;

/*
 *	객체의 중복 여부 판단 
 *	1. equals 메서드: 결과 true
 *	2. hashCode 메서드: 결과값이 동일한 경우
 *		=> 1번과2번을 모두 만족하는 경우 중복된 객체로 판단.
 *
 *	equals 메서드, hashCod 메서드를 동시에 오버라이딩 하도록 권장.
 *	=> 내용 비교로 오버라이딩.
 *
 */
class Person {
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "("+name+","+"age"+ ")";
	}
	@Override			//hashCode 동일하게 해서 한 명처럼 보이게
	public int hashCode() {
		return name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && age == p.age;
		} else {
			return false;
		}
	}
	
}
public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동",10));
		set.add(new Person("홍길동",10));
		set.add(new Person("홍길동",20));
		set.add(new Person("홍길순",10));
		System.out.println(set);
		// 중복이 불가하지만, new는 다른 객체로 인식
	}
}
