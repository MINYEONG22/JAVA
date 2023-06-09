package test;
/*
2.  다음 결과가 출력되도록 동물클래스와 구동클래스(Test2)를 구현하기       
 동물클래스(Animal)
    멤버변수 : 이름(name), 나이(age)
    멤버메서드: eat() ;
         기능 : "맛있게 얌얌" 출력
[결과]
     이름(name):원숭이
     나이(age):20
     맛있게 얌얌   */
class Animal {
	
	String name;							// 멤버 변수
	int age;
	
	void eat(){
		System.out.println("맛잇게 냠냠");		// 멤버 메서드
	}
	public String toString() {				// 객체를 문자열화 하는 메서드
		return "이름(name): " + name + "\n나이(age): " + age;
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Animal a1 = new Animal();				// 객체화
	a1.name="원숭이";
	a1.age = 20;
	System.out.println(a1);
	a1.eat();
	
	}

}
