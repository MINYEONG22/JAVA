package chap6;
/*
 *	RectangleEx.java의 소스 Rectangle3 클래스 이용하기 
 * 	20~50 사이의 임의의 가로, 세로의 길이를 가진 사각형 5개를 생성하고
 *  toString 메서드를 이용하여 출력하기
 */
public class Exam3 {
	public static void main(String[] args) {
//		System.out.println("for문으로");
//		
//		for(int i=1; i<=5; i++) {
//			Rectangle3 ri = new Rectangle3();
//			ri.width = (int)(Math.random()*31)+20;		//20에서 50까지의 임의의 수
//			ri.height = (int)(Math.random()*31)+20;
//			ri.serialNo = ++Rectangle3.sno;
//			System.out.println(ri);
//		}
		System.out.println("배열로");
		Rectangle3[] arr = new Rectangle3[5];		// rectangle3 을 참조할 배열 5개를 만듬
		int totArea = 0, totLength = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Rectangle3();
			arr[i].width = (int)(Math.random()*31)+20;		
			arr[i].height = (int)(Math.random()*31)+20;
			arr[i].serialNo = ++Rectangle3.sno;
			System.out.println(arr[i]);
		}
		for(Rectangle3 r :arr) {
			totArea += r.area();
			totLength += r.length();
		} 
		System.out.println("전체 면적의 합: " + totArea);
		System.out.println("전체 둘레의 합: " + totLength);
	}
}
