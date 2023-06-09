package chap5;
/*
 *	문자열 내에 각 소문자의 갯수 출력하기 
 * 
 */
public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 26개, 0은 a, 1은 b
		
		String str = "dksleidkalsasdasdfasekfjidaaaiejfla";		//다른 특수부호 들어가면 안 됨.
		char alpha[] = str.toCharArray();						
		int data[] = new int [26];
		
		
		for(int i=0; i<alpha.length; i++) {
			
			data[alpha[i]-'a']++;		// alpha (문자열 -'a')로 'a'기준 위치값 출력
			
			// str을 alpha에 넣고,
			// a의 index값은 0,
			// alpha의 index에서 - 0을한 걸 ++ => 개수 나옴
			// 아스키 코드값 사용
			// (char)'a' =>97
			// data
			
			// 0	1	2	3	4	5	6	7	.... 25
			// d(100) - a(97) = 3 	=> index 3번에 +1
			// k(108) - a(97) = 11	=> index 11번에 +1
			// 해서 index 0~25까지 갯수가 나옴
			
		}
		
		for(int i=0; i<data.length; i++) {
			
			// index1부터 시작해서 25까지 커지는데
			
			if(data[i] > 0) {	// data[i]는 0보다 큼
				
				System.out.print((char)(i+'a')+":"+ data[i] + "개 = >");
				
								// (char) i = 0 + 97 = 97(a) = 위에서 구한 개수
								// 			  1 + 97 = 98(b) = 위에서 구한 개수 
			
				for(int j=0; j<data[i]; j++) {
					
					System.out.print("*");
								
				}
				
				System.out.println();	
			}
		
		}
	
	}

}
