package test2;
/*
구동 클래스를 실행 했을때 다음의 결과가 나오도록 Animal2 클래스를 구현하기
[결과]
원숭이:26살
사자:1살
사람:100살


this()  : 같은 클래스 내의 다른 생성자를 호출 시 사용
this	: 자기참조변수. 현재 객체의 참조값. 	this.인스턴스멤버 


*/
class Animal {
	
	String name;
	int age;
	
	Animal(String n, int a) {
		this.name = n;				
		this.age = a;
	}
	Animal(String n) {
		name = n;
		age = 1;
	}
	Animal(int a) {
		name = "사람";				// this("사람",1)	 방식으로 써도됨		
		age = a;					// 현재 객체의 생성자 중, 매개변수가 (String, int)인 생성자 호출 20번 줄에서 받아옴
	}
	
	void info() {
		System.out.println(name + ": " + age +"살");
	}
	
//	public String toString() {
//		return name + ": " + age +"살";
//	}
	
}
public class Test3 {
	public static void main(String[] args) {
		Animal a1 = new Animal("원숭이", 26);
		Animal a2 = new Animal("사자");
		Animal a3 = new Animal(100);
		a1.info();
		a2.info();
		a3.info();
	
	}
}
