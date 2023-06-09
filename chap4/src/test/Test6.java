package test;
/*
 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기 
 */
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, i = 0;
	
		for(i = 1; i <= 100; i++) {
			
			if(i%2==0) {			// (i%2==0 || i%3==0)	2의 배수이거나, 3의 배수로 사용해도 됨
				
				sum += i;
				
			} else if (i%3==0) {
				
				sum += i;
			}

		}
		
		System.out.println(sum);


		
		sum = 0; i = 0;
		
		while(i<=100) {
			
			i++;
			
			if(i%2==0) {
				
				sum += i;
				
			} else if (i%3==0) {
				
				sum += i;
				
			}
			
		}
		
		System.out.println(sum);
		
		
		
		sum = 0; i = 0;
		
		do {
			
			i++;
			
				if(i%2==0) {
				
						sum += i;
				
				} else if (i%3==0) {
				
						sum += i;
				
				}
				
				
		} while(i<=100);
		
		System.out.println(sum);
		
	}

}
