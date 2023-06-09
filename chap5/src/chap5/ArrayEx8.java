package chap5;
/*
 *	2차원 배열의 생성과 초기화 
 * 
 * 
 */
public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr = {{10,20},{30,40},{50,60}};

		
		for(int i=0; i<arr.length; i++) {		//행

			int sum=0;	
			
			for(int j =0; j<arr[i].length; j++) {	//열
				
				
				System.out.print("arr["+i+"]["+j+"]= "+arr[i][j]+", ");
				sum += arr[i][j];
				
			}
			
			System.out.println();

		}

		// 행의 합과 열의 합 출력하기
		// col: 컬럼의 합을 저장할 배열. 모든 행의 열의 갯수가 같으므로 
		// arr[0].length의 크기로 설정
		
		int col[] = new int[arr[0].length];
		
		// 합 구하기
		
		for(int i=0; i<arr.length; i++) {
			
			int sum =0;
			
			for(int j=0; j<arr[i].length; j++) {		// 0일때
				
				sum += arr[i][j];						// 행의 합
				col[j] += arr[i][j]; 					// 열의 합	j 같이 돌아가니까 같은 열
				
			}
			
			System.out.println(i+"행의 합:" + sum);	// 0행의 합, 1행의 합, 2행의 합
			
		}
		
		for (int i=0; i<col.length; i++) {
			
			System.out.println(i+"열의 합:"+col[i]);		// 위에서 구해놓은 열의 합 0~length-1 까지 출력
			
		}
		
		
		
		
		
	}

}
