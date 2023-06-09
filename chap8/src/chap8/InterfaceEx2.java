package chap8;
/*
 *	인터페이스를 리턴 타입으로 사용 
 */
class Lazerzet implements Printerable {
	@Override
	public void print() {
		System.out.println("레이저젯 프린터로 프린트");
	}
}
class Inkzet implements	Printerable {
	@Override
	public void print() {
		System.out.println("잉크젯 프린터로 프린트");
	}
}
class PrinterManager {
	public static Printerable getPrint(String type) {
		if(type.equals("INK")) {			// type의 "INK가 있으면"
			return new Inkzet();			// 잉크젯 객체 return
		} else {
			return new Lazerzet();			// 레이저젯 객체 return
		}
	}
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		// p 참조변수: Inkzet 객체 잠조
		Printerable p = PrinterManager.getPrint("INK");	 		// 방법1
		p.print();	// 프린터블을 구현해서 Inkzet 객체 리턴				// 방법2
	//	PrinterManager.getPrint("INK").print();		
		PrinterManager.getPrint("LAZER").print();				// "INK"가 없으면 Lazerzet 객체 리턴	
																// "LAZER" 이니까 Lazerzet 이 리턴 됨
	}

}
