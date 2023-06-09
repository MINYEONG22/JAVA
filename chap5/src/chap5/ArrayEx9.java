package chap5;
/*
 *	가변 배열: 다차원 배열에서만 가능 
 *  		첫번째 배열의 갯수만 설정하고 나머지 값은 설정하지 않음 
 *  
 *  
 * System.out.printf() 형식화 문자를 이용해서 화면에 출력해주는 함수
		
		%d : 10진 정수		-- 10진 정수 i출력, j출력
		%3d : 10진 정수	-- 최소 3자리를 확보하여 10진 정수 출력.
		%f : 실수 출력
			ex) %10.2f : 10자리를 확보하고, 소숫점 이하 2자리로 실수 출력.
		%c : 문자 한 개 출력
		%s : 문자열 출력
 */
public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int [3][];	// 가변배열
		
		arr[0] = new int[] {10,20};
		arr[1] = new int[] {30,40,50};
		arr[2] = new int[] {60};
		
		// 열 값 마음대로 지정
		
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.printf("arr[%d][%d]=%3d\t",i,j,arr[i][j]);
				// 형식화 문자를 이용해서 화면에 출력해주는 함수
				// %d : 10진 정수		-- 10진 정수 i출력, j출력
				// %3d : 10진 정수	-- 최소 3자리를 확보하여 10진 정수 출력

				// %2d -- 두 자리라 띄어쓰기 없이, 3d 두 자리 수니까 한 칸 떨어짐
				// %c : 문자 한 개 출력
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
	}

}
