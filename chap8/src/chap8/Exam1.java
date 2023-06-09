package chap8;

// abstract 는 상속 구현에 한계... 

//Animal 클래스 구현

abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void eat();
}
/*
 * Dove, Monkey 클래스, Flyable 인터페이스 구현하기 
 * 
 */
class Dove extends Animal implements Flyable{
	Dove () {
		super("비둘기");
	}
	@Override
	void eat() {
		System.out.println("빵 부스러기를 먹는다");
	}
	@Override
	public void fly() {				// 인터페이스 클래스 public
		System.out.println(name+"는 날 수 있다.");
	}
}
class Monkey extends Animal{
	Monkey() {		
		super("원숭이");	
	}
	@Override
	void eat() {
		System.out.println("바나나를 먹는다");
	}
}
interface Flyable {				// 부모 클래스에서 상속이 한계가 있을 때, 기능 추가를 할 때.  
	void fly(); 				// 구현부x
}

public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();		// Animal 타입을 상속 받아야 형변환이 됨.
			a.eat();
			if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
	}
}
