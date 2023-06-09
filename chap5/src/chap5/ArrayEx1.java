package chap5;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. 배열의 선언
		int[] arr;
		
		// 2. 배열의 생성		: 배열 객체 생성
		arr = new int[5];
		
			/*
			 *	new 연산자
			 *  1. 객체 생성. int 값만 저장할 수 있는 변수 5개 할당.
			 *  2. 기본값으로 초기화.
			 *   - 숫자: 0 (float, double: 0.0)
			 * 	 - boolean: false 
			 * 	 - 문자 등 그 외 : null
			 */
		
		
		/*
		 * 	│	│	│	│	│	│ 5 │
		 *    0   1   2   3   4	  length - 까지 자동으로 하나 더 만듦
		 */
		
		// 3. 배열의 값 초기화
		arr[0] = 10;
		arr[1] = 20;
		
		/*
		 * 	│ 10 │ 20 │    │	│	│ 5 │
		 *    0    1     2   3    4	  length - 까지 자동으로 하나 더 만듦
		 */
		
		
		// 4. 배열의 값 조회
		for (int i=0; i<arr.length; i++) {	// arr의 index는 0이고, i는 arr.length;(배열의 길이보다 작음). index 1씩 증가하며 조회
											// i <= arr.length 하면 length 값까지 나와서 에러 
			
			System.out.println("arr["+i+"]="+arr[i]);
		
		}
		
		
		System.out.println();
		
		
		// 1.선언과 2.배열 생성 보통 같이 함.
		int arr2[] = new int[3];
		
		// 3. 배열의 초기화
		arr2[0] = 100;
		arr2[1] = 200;
		
		// 4. 배열값 조회
		for (int i=0; i<arr2.length; i++ ) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println();
		
		System.out.println("arr2=arr");
		arr2 = arr;		//arr2에 arr넣음			//arr2의 객체는 참조하지 않으니 사라짐
		for (int i=0; i<arr2.length; i++ ) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println();
		
		arr[3] = 555;		// arr에 arr[3] 넣으면, arr2에 arr2[3]도 바뀜
		for (int i=0; i<arr2.length; i++ ) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
	
		System.out.println();
		arr2[2] = 9;		// 덮어씌우고서는 두 개 같이 움직임
		for (int i=0; i<arr.length; i++ ) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println();
		
		// 개선된 for 구문
		System.out.println("개선된 for 구문");
		for(int a: arr) {
			System.out.println(a);		//첨자가 아닌 요소.
		}	// 첨자(index) 사용 불가, 요소의 값만 사용 가능함.
			// 첨자(index) 사용 시는 기존 for 구문을 사용해야함. 
	}
}
