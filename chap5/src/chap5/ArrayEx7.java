package chap5;
/*
 *	2차원 배열 예제 
 *   - 2차원 배열은 1차원 배열의 참조변수의 배열임.
 *   - 자바에서 다차원(2)차원 이상 배열은 n-1차원 배열의 참조변수의 배열임
 *  	=> 다차원 배열은 배열의 배열로 표헌함.
 *  
 */
public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열의 선언과 생성
		int arr[][] = new int [3][2];
		// int[][] arr, int[] arr[] 다 상관없음. 2차원 배열을 생성해라
		
		// 초기화
		arr[0][0] = 10; arr[0][1] = 20; // arr[0][2] = 10; 2열은 불가 오류
		arr[1][0] = 30;	arr[1][1] = 40;
		arr[2][0] = 50;	arr[2][1] = 50;
		
		
		//2차원 배열의 내용 출력하기
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
								
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+", ");
				
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("1차원 배열 객체 변경하기");
		
		int arr1[] = {1,2,3,4,5};
		arr[1] = arr1;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
								
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+", ");
				
			}
			
			System.out.println();
		}
		
		
		// 행의 합과 열의 합을 구하기
		System.out.println();
		System.out.println("행의 합과 열의 합을 구하기");
		
		System.out.println("행의 합:");
		for(int i=0; i<arr.length; i++) {
		
			System.out.print(i+"행의 합");
			int hap = 0;
			
			for(int j=0; j<arr[i].length; j++) {
					
				hap += arr[i][j];
			}
			
			System.out.println(hap);
			
		}
		
		System.out.println();
		System.out.println("열의 합");
		
		
		int maxcol = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			
			if(maxcol < arr[i].length) {
				
				maxcol = arr[i].length;		// 5
				
			}
			
		}		// 제일 큰 열의 갯수 구하기
		
		
		// 새로운 col 컬럼에 찾은 열의 갯수를 넣어서 새로 만들어
		int col[] = new int[maxcol];
		// col 5개의 열이 생김
		
		
		for(int i=0; i<arr.length; i++) {	// 길이 구해서 3 	//arr[행i]
			
			// 0 1
			
			for(int j=0; j<arr[i].length; j++) {	// arr[행i] [열j]
				
				col[j] += arr[i][j];		// arr[i] [j] 값을
				
											// col[j]에 넣음	= 합계가 나옴
			
			}
			
		}
		
		for(int i=0; i<col.length; i++) {
			
			System.out.println(i+"열의 합: " +col[i]);		//합계 열마다 출력
			
		}
		
		
		
	}

}
