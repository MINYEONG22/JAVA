package chap5;
/*
 *	배열의 선언, 생성, 초기화하기 
 */
public class ArrayEx2 {
	public static void main(String[] args) {
//		배열의 선언, 생성, 초기화 한번에
		int arr[] = {10,20,30,40,50};
		for (int i = 0; i<arr.length; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println();
		
		System.out.println("개선된 for 구문으로 요소 출력하기");
		for (int a:arr) {
			System.out.println(a);
		}
		System.out.println();
		// arr 참조변수에 새로운 배열 생성, 초기화
		// 오류.	- 선언 안 하고 생성과 초기화는 안 됨
		// arr = {100,200,300};
		// 위에 int arr[] = {10,20,30,40,50}; -> 새로 
		arr = new int[] {100,200,300}; 	// int[] <- 이쪽에 숫자 들어가면 안 됨 
										// arr 새롭게 만들 거야
		for (int a:arr) {
			System.out.println(a);
		}
	}
}
