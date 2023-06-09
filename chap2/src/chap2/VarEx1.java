package chap2;

public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; 					// 변수를 선언한다. int(정수), 변수 사용 전에 반드시 선언 필요. => 메모리를 할당해줌.
									// int니까 4 byte, 정수 값만 넣을 수 있음 , 소숫점이하(실수)는 float나 double로
		
		num = 100;					// 변수의 초기화, 선언된 변수에 값을 넣어줌.(초기화)  
		System.out.println(num);	// 콘솔 출력. num이 저장하고 있는 값 100을 출력해라.
		
		// 변수의 선원과 초기화를 동시에 함.
	
		byte b1 = 10;
		short s1 = 20;
		int i1 = 30;
		long  l1 = 40;
		
		
		//b1, s1, i1, l1 의 값 콘솔에 출력하기
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		
		
		b1 = 100;
		
		System.out.println(b1);
		
		// b1 = 300; 1byte -128~127까지(256)만 넣을 수 있음
		
		b1 = 127;
		
		System.out.println(b1);
		
		b1=(byte)128; 				//byte로 넣으면 에러 사라짐
		System.out.println(b1);
		
		
		b1=(byte)300; 				//byte로 넣으면 에러 사라짐 -128~127 에서 돌아...
		System.out.println(b1);
		
		
		/*2023-02-06 문제 test*/
		
		System.out.println("----------2023-02-06-test-----------");
		
		  float f1 = 1; 			//float 서식문자 f, e
		  float f2 = 1.0f; 
		  float f3 = '1'; 			// 문자를 넣음	  
		  
		  System.out.println(f1);
		  System.out.println(f2);
		  System.out.println(f3);
		  
		  
		  System.out.println("----------------------");
		  
		  	char       a='a';   
//		    char       b="a";     	 // char '' 사용해야함, 문자 한 개
			System.out.println(a);

		    String     c="a";   
//		    String     d='a'; 		 // " " 사용해야함, 문자열
		    System.out.println(c);
		    
//		    char       e='ab'; 		 // 1개의 문자만 사용 가능
		    String     f="ab"; 
//		    char       g = '';		 // 1개의 문자 이상 사용
		    String     h = ""; 		 // 0개 이상의 문자 사용
		    System.out.println(f);
		    System.out.println(h);
		    
		    
//		    byte   var1 = 128; 		 // 127까지 넣을 수 있음
			short  var2 = 128; 
//			int    var3 = 28L;		 // L은 long에 붙이는 접미사
			long   var4 = 128L;
			System.out.println(var2);
			System.out.println(var4);
			
			
			float  var5 = 1.2f;		 // f를 붙여주지 않게 된다면 컴퓨터는 이 data를 double로 인식
									 // 4바이트가 초과되는 영역은 잘림
			double var6 = 1.2; 
		    float  var9 = '1';	
		    
		    System.out.println(var5);
			System.out.println(var6);
			System.out.println(var9);		// ''로 문자열을 넣음
	
		    // long에 붙이는 접미사 L , float에 붙이는 접미사 F
		    
		    
		 
		    
	}

}
