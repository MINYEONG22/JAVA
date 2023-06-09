package test2;
/*
 * 원(Circle) 클래스 구현하기
 *  1. 멤버변수
 *       반지름(r),x좌표(x),y좌표(y), 원의번호(no)
 *       원의번호 생성 변수 count
 *  2. 생성자 : 구동 클래스에 맞도록 설정하기     
 *  3. 멤버메서드
 *     (1) double area()  : 원의 넓이 리턴. Math.PI 상수 사용
 *     (2) double length(): 원의 둘레 리턴. Math.PI 상수 사용
 *     (3) void move(int a, int b): x,y좌표를 x+a, y+b로 이동.
 *     (4) void scale(double m): 반지름을 m배 확대/축소. r=r*m
 *     (5) String toString() :
 *         1번원 : 반지름:10, 좌표:(10,10), 넓이:314.xxx, 둘레:xxx.xxx
 *         ... */
class Circle {
	
	int r, x, y, no;		// 반지름, x좌표,y좌표, 원의 번호
	static int count;				// 원 객체의 갯수
	
	
	
	Circle(int r1, int x1, int y1){
		r = r1;
		x = x1;
		y = y1;
		no = ++count;
	}
	
	Circle(int x1, int y1){
//		r = 1; 		// 없어서 임의의 수
//		x = x1;
//		y = y1;
//		no = ++count;
		
		this(1, x1, y1);
		
	}
	Circle(int m) {
//		r = m;
//		x = 1;
//		y = 1;
//		no = ++count;
		this(m,1,1);
	}
	
	double area() {					//넓이
		return (r*r)*Math.PI;		// Math.pi : 원주율
	}
	double length() {				//둘레
		return (r*2)*Math.PI;
	}
	
	void move(int a, int b) {
		x +=a;				// 좌표 이동이니까 + 해주면 됨
		y +=b;
	}
	
	void scale(double m) {
		r *=m;				// 반지름의 크기 변경
	}
	
	public String toString() {
		
		return no+"번 원, 반지름: "+r+", 좌표: ("+x+","+y+"), 넓이:"+area()+", 둘레: "+length();
	}
	
}
public class Test4 {
	public static void main(String[] args) {
		Circle[] carr=new Circle[3];
		carr[0] = new Circle(10,10,10);
		carr[1] = new Circle(20,20);   
		carr[2] = new Circle(100);     
		for(Circle c : carr) {
			System.out.println(c);
			c.move(10,10);				// 움직이고
			System.out.println(c);
			c.scale(3);					// 크기 변경하고
			System.out.println(c);
			System.out.println();
		}
	}
}
