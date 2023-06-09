package chap7;
/*
 *	추상클래스
 *	 1. 추상 메서드를 멤버로 가질 수 있는 클래스 => abstract 예약어 사용
 *	 2. 객체화 불가 => 상속을 통해서 자손 클래스에서 객체화 
 *	 3. 그 외는 일반 클래스와 동일 (생성자, 일반 멤버 변수, 일반 멤버 메서드, 초기화 블럭, 상속 등... 가능)
 * 
 * 	기능을 동일화 시킬 때 주로 사용
 * 
 * 	추상 메소드
 *   1. 메서드의 선언부만 존재. 구현부{}가 없음 => abstract 예약어 사용
 * 	 2. 자손 클래스에서 반드시 오버라이딩 해야함  
 */
abstract class Shape {			// 추상클래스
	
	String type;
	Shape(String type){
		this.type = type;
	}
	abstract double area();		// 추상메서드		-- 상속을 통해 객체화가 됨
	abstract double length();	// 추상메서드		구현하진 않았지만 멤버, 구동 가능 68 for문 가능
	
}
class Circle extends Shape{
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	double area() {
		return Math.PI * r*r;
	}
	double length() {
		return Math.PI * 2*r;
	}
	public String toString() {
		return type + ": 반지름(" + r + ") => 면적: "+area() +", 둘레: "+length();
	}
}
class Ractangle extends Shape{
	int width, height;
	Ractangle (int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}
	
	public String toString() {
		return type + "(" + width + "," + height + ") => 면적: "+area() +", 둘레: "+length();
	}
}
public class ShapeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //Shape 클래스의 객체화 불가. => 추상 클래스는 단독으로 객체화 불가
	 
	 Shape arr[] = new Shape[2];
	 arr[0] = new Circle(10);
	 arr[1] = new Ractangle(10,10);
	 
	 //도형의 면적의 합과 둘레의 합 출력
	 double totArea = 0;
	 double totLength = 0;
	 for(Shape s : arr) {		// arr를 s에 넣어(대입)해라
		 System.out.println(s);
		 totArea += s.area();
		 totLength += s.length();
	 }
	 
	 System.out.println("전체 면적: "+totArea);
	 System.out.println("전체 둘레: "+totLength);	 
	}

}
