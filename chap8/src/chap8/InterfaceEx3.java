package chap8;
/*
 *	interface를 매개변수로 사용하기  
 *
 *	toString은 Object에 있는 거라 불러올 수 있음.
 *
 */
class Unit {
	int hp;
	final int MAX;
	Unit(int hp) {
		this.hp = hp;
		MAX = hp;			// 상수, 한 번 초기화 됨. 객체별로 다른 상수값을 가질 수 있음
	}
}
class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}
class GroundUnit extends Unit {
	 GroundUnit(int hp) {
		super(hp);
	}
}
interface Repairable {}
class Tank extends GroundUnit implements Repairable {
	Tank(){
		super(150);
	}
	public String toString() {
		return "Tank";
	}
}
class DropShip extends AirUnit implements Repairable {
	DropShip(){
		super(125);
	}
	public String toString() {
		return "DropShip";
	}
}
class Marine extends GroundUnit {
	Marine() {
		super(40);
	}
	public String toString() {
		return "Marine";
	}
}
class Scv extends GroundUnit implements Repairable {
	Scv () {
		super(60);
	}
	public String toString() {
		return "Scv";
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit) r;
			u.hp = u.MAX;
			System.out.println(r.toString() + "수리 완료");
		}
	}
}
public class InterfaceEx3 {
	public static void main(String[] args) {
		Tank t = new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		Scv s = new Scv();
		s.repair(t);
		s.repair(d);
//		s.repair(m);	// 에러 Repairable으로 형변환이 안 됨.
		s.repair(s);
	}

}
