package chap5;
/*
 * 
 *	로또 번호 생성 
 * 
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] balls = new int[45];			// 45번까지 객체 생성
		int[] lotto = new int[6];			// 6번까지 객체 생성
		
		for(int i=0; i<balls.length; i++) {		//balls의 index = index + 1	(1~45번까지 만들기)
												// <= (x) 같으면 안 됨 length까지 나오면 안 되니까 =>  < 
			balls[i] = i+1;						// index 0부터 시작하니까 +1
			
		}
		
		for(int i=0; i<=1000; i++) {			// i는 0이고 i는 1000보다 같거나 작을 때까지 1씩 증가
			
			
			int f = (int)(Math.random()*45);		// f는 0(1)~44(45)까지 중 1개 index
			int t = (int)(Math.random()*45);		// t는 0(1)~44(45)까지 중 1개 index
			
			
			// swap 알고리즘
			int tmp = balls[f];					// temp는 balls 랜덤 번호, 100번 섞어라
			balls[f] = balls[t];					// f,t는 index 값으로 사용.
			balls[t] = tmp;						
													// temp 이용해서 
													// f값 t로, t값 f로 바꿔서 기존 숫자 유지
													// 겹쳐지면 기존값이 사라지니까...
			
		}
		
		for (int i=0; i<lotto.length; i++) {
			
			lotto[i] = balls[i];
			// lotto 6개에 balls 랜덤 6개 넣어
			
		}
		
		for (int b : lotto) {			
			
			System.out.print(b+",");
		}
		// 랜덤으로 들어간 lotto 번호 6개 조회
		
		
		System.out.println();
		
		
		// 더블정렬
		System.out.println();
		System.out.println("로또 번호 정렬하기");
			
			
		for(int i=0; i<lotto.length; i++) {				// i는 lotto의 길이 1씩 증가
			
			// 0
			
				
			for (int j=0; j<lotto.length-1-i; j++) {	// j는 lotto의 길이에서 -1하고 -i, 
			
			// 0~4까지
			// 1~3까지
			// 2~2까지 	하나씩 빼면서 비교해줘야하니까, -i
				
			/*
			 * j: 0~4 5개만 해주면 됨
			 * 
			 * i: 0 
			 * 
			 */
				
				if(lotto[j]>lotto[j+1]) {		//lotto[index]>lotto[index+1] // 0번 값이 1번 값보다 크면
																			  // 1번 값이 2번 값보다 크면
																			  // 2번 값이 3번 값보다 크면
																			  // 3번 값이 4번 값보다 크면
												// j+1이라, 마지막 index도
						
					int tmp = lotto[j];
					lotto[j] = lotto[j+1];		
					lotto[j+1] = tmp;			// tmp 이용해서 lotto[index j]와 lotto[index j+1] 바꿔라 
						
				}
				
			}
				
		}
			
		for(int b :lotto) { 
				
			System.out.print(b+",");
		
		}
			
			
	
		
		
	}

}
