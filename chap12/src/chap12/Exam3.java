package chap12;

import java.util.HashSet;
import java.util.Set;

class Student2 {
	int studno;
	String name;
	String major;
	Student2(int studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public String toString() {
		return "(학번:"+studno+", 이름:"+name+", 전공:"+major+")";
	}
	@Override
	public int hashCode() {
		return name.hashCode()+studno;
	}		
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student2) {
			Student2 s = (Student2)obj;
			return name.equals(s.name) && studno == s.studno;
		} else {
			return false;
		}
	}
}
public class Exam3 {

	public static void main(String[] args) {
		Set<Student2> set = new HashSet<>();
		set.add(new Student2(1, "홍길동", "경영"));
		set.add(new Student2(2, "홍길순", "경영"));
		set.add(new Student2(2, "홍길순", "컴공"));
		set.add(new Student2(1, "홍길동", "통계"));
		set.add(new Student2(3, "홍길동", "컴공"));
		System.out.println("등록 학생 수: "+set.size()); //3
		System.out.println("등록 학생:");
		for(Student2 s: set) {
			System.out.println(s);
		}
	
	}
}
