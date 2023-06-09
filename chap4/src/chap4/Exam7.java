package chap4;

/*
 * 
 *	구구단 가로 출력 
 * 
 * 
 * 
 * 
 */


public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2;
		int dig = 2;
		
		
		for (dig = 2; dig <= 9; dig++) {
			
			System.out.print(dig+"단"+"\t");
		}
		
		System.out.println();
		
		for (dig = 2; dig <= 9; dig++) {
			
			
			for(num = 2; num <= 9; num++) {
				
				System.out.print(num+"x"+dig+"="+ (num*dig) + "\t");
				
			}
			
			System.out.println();
			
		}
		
		
		

	}

}
