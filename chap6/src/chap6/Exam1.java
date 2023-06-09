package chap6;
/*
 *  직사각형 클래스 구현하기
 *	가로(width), 세로(height)의 멤버 변수를 가지고 있는 
 *  void area(), void length() 멤버 메서드를 가진 클래스 구현하기
 */

//import java.awt.Rectangle;
class Rectangle {
	int width;
	int height;
	// int weight, height; 로 해도 됨
	void area(int width, int height) {
//		System.out.println("사각형 면적: "+ width*height);
		System.out.println("("+width+","+height+") 사각형의 면적: "+ width*height); 
	}
	void length(int width, int height) {
//		System.out.println("사각형 둘레: "+ ((width*2)+(height*2)));
		System.out.println("("+width+","+height+") 사각형의 면적: "+(width+height)*2);
	}
}
public class Exam1 {
	public static void main(String[] args) {		// static: 변수 뿐만 아니라 메서드에도 붙어 있음, 객체화 필요 없음 
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		System.out.println("사각형 가로 길이: "+r1.width+", 사각형 세로 길이: "+r1.height);
		r1.area(10,5); 			//(10,5)  사각형 면적: 50	  위에서 syso 해놔서 안 적어도 출력 됨.
		r1.length(10,5); 		//(10,5) 사각형 둘레: 30
	}
}
