package chap6;
/*
 * 현재 사각형이 정사각형인지 아닌지
 */
class Rectangle3 {
	int width, height, serialNo;
	static int sno;	
	int area() {
		return width*height;
	}
	int length() {
		return (width+height)*2;
	}
	boolean isSquare() {
		return width==height;			//같으면 true, 틀리면 false
	}
	public String toString() {
		return serialNo+"번 사각형: ("+width+","+height+")"
			   +" 생성 된 사각형의 갯수: "+sno
			   +" => 면적: "+area()+", 둘레: "+length()+", "
			   +(isSquare()?"정사각형":"직사각형");
			
	}
}
public class RectangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Rectangle3 r1 = new Rectangle3();
	r1.width = 30;
	r1.height = 20;
	r1.serialNo = ++ Rectangle3.sno;
	System.out.println(r1);
	
	Rectangle3 r2 = new Rectangle3();
	r2.width = 35;
	r2.height = 25;
	r2.serialNo = ++ Rectangle3.sno;
	System.out.println(r2);
	
	Rectangle3 r3 = new Rectangle3();
	r3.width = 25;
	r3.height = 25;
	r3.serialNo = ++ Rectangle3.sno;
	System.out.println(r3);
	
	}

}
