package chap5;
/*
 * 
 *	command 라인에서 숫자를 입력받아 숫자의 자리수의 합을 출력하기 
 * 
 * 
 */
public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length == 0 ) {
			
			System.out.println("숫자를 파라미터로 입력하세요.");
			return;
			
		}
		
		
		/*
		 * String[] args = {"123","456"}
		 * 
		 */
		
		int sum = 0;
		
			
		for(int i=0; i<args[0].length(); i++) {
						//0번지의 값: 123이라는 문자열 값, args[0].length() : 3, 3보다 작은동안 ++
						//1번지: 456 이라는 문자열 값	
				
			char ch = args[0].charAt(i);	//String 문자열중에 한 개만 받아서 char로 바꿔줌 
											// args[0].charAt(0) => '1'
											// args[0].charAt(1) => '2'
											// args[0].charAt(2) => '3'
			
			
			if (ch >= '0' && ch<= '9') {	// args[0].charAt(i) 가 0보다 크거나 같고, 9보다 작거나 같으면
				
					
				sum +=ch-'0';				// 값을 ch-'0'의 값을 sum에 더해줘라. ascii 값 사용
											// 1+2+3		
			}
				
		}
		
		
		for(int i=0; i<args[1].length(); i++) {
			//0번지의 값: 123이라는 문자열 값, args[0].length() : 3, 3보다 작은동안 ++
			//1번지: 456 이라는 문자열 값	
			
				char ch = args[1].charAt(i);	//String 문자열중에 한 개만 받아서 char로 바꿔줌 
												// args[0].charAt(0) => '1'
												// args[0].charAt(1) => '2'
												// args[0].charAt(2) => '3'
				
				
				if (ch >= '0' && ch<= '9') {	// args[0].charAt(i) 가 0보다 크거나 같고, 9보다 작거나 같으면
					
						
					sum +=ch-'0';				// 값을 ch-'0'의 값을 sum에 더해줘라. ascii 값 사용
												// 1+2+3		
				}
					
		}
		
		
		System.out.println(args + "의 자리수의 합:" + sum);
			
		
		
		System.out.println();
		System.out.println("중첩 반복분으로 처리하기");	
	
		sum = 0;
		
		for(String a : args) {			
			// 첫번째 args : "123"
			// 두번째 args : "456"
			for(int i=0; i<args[1].length(); i++) {
							
				char ch = a.charAt(i);	
	
				if (ch >= '0' && ch<= '9') {	
				
					sum +=ch-'0';				// 1+2+3
												// +4+5+6
	
				}
			
			}

		}
		
		System.out.println("args 숫자의 자리수 합: " + sum);
		
		
		
	}
}
