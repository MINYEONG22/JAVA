package chap2;

/*
 * 문자형: char 기본자료형. 한 개의 문자. ''로 표현
 * 문자열형: String 참조자료형. 문자 0개 이상 - 빈 문자열도 가능, ""로 표현
 * 특수문자: \
 * 
 * 
*/
public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		char ch1 = ''; 	//문자는 한 개 필요, 오류 발생
		
//		char ch1 = "";  ""는 문자열을 의미. 오류 발생 - ""는 String 객체만 가능
		
		char ch1 = 'A';
		System.out.println(ch1);		//A
		
		char ch2 = (char)65;
		System.out.println(ch2); 		//A
		
		char ch3 = 65;
		System.out.println(ch3); 		//A
		
		
		/*
		   1byte: 8bit
		   128가지 + 1 
		    7bit + check bite => 8bit로 하자...
			
		   128  64  32  16  8   4   2   1
			0	1	0	0	0	0	0	1	: a 65
		    0	1	0	0	0	0	1	0	: b 66
			0	1	0	0	0	0	1	1	: c 67
			
		*/
		
		System.out.println('B'-'A'); 	//1
		
		
		
		// 특수문자
		
		char single = '\'';		// '는 문자를 의미하는 특수문자이지만 \를 앞에 넣어주면 순수한 문자로 봄
		System.out.println(single);
			
		System.out.println("서울\t대전\t대구\t부산"); 					//	\t : tap(탭)
		System.out.println("안녕하세요.\n이 부분은 다음줄에 출력됩니다.");		//	\n : 다음 줄로
		System.out.println("\uD64D\uAE38\uB3D9");					// 	유니코드 uft-8 16bit => 2byte 문자 표시
																  	//	\ u
		
		System.out.println("c:\test");								// \문자를 찍고 싶을 때는? 
		System.out.println("c:\\test");								// \\ 두 번 쳐주면 \라고하는 특수기호를 없애줌
																	// 특수문자 \t 특수기호를 없애줌 
		
	
		
//		변수선언
		
//		int true = 100;		true 예약어라서 오류
		int True = 100; 	// 가능
		
		
		char $harp = '#'; 	// 가능
//		int 7up = 7;		// 숫자 시작 불가능 
		
		
		int 숫자 = 0; 		// java에선 한글 변수명 사용할 수 있고, 가능하지만 쓰지 마 - web에서 문제 생김
		
		
		
		
		
		/*
	    5. 다음결과가 나오도록 Test2 프로그램 수정하기
	    [결과]
	    c=30
	    ch=C
	    f=1.5
	    l=27000000000
	    result=true 
	    */
	    
	    System.out.println("--------------------------------");
	    
	    byte a = 10;
	    byte b = 20;
	    
	    System.out.println(a);
	    System.out.println(b);
	    
	    byte c = (byte)(a+b);
//	    byte c = a+b  				int보다 작은자료형 연산의 결과는 int 
	    							// int+float = float, 
									// int+int = int
									// byte+byte = int
	    
	    System.out.println("c = " + c);
	    
	    
	    
	    System.out.println("--------------------------------");
	   
	    char ch = 'A';
	    ch = (char)'A'+2;		// C
	    ch1 = (char)(ch+2); 	// C+2 = E
	    System.out.println("ch = " + ch);
	    System.out.println("ch1 = " + ch1);
	    
	    
	    
	    System.out.println("--------------------------------");
	
	    float f = 3/2F;							// float f = 3f/2;
	    System.out.println("f =" + f);
	   
	    
	    System.out.println("--------------------------------");
	    
	    long l = 3000*3000*3000L;				// int*int = int, 근데 int*int*int 가 int형의 범위를 넘어서 long타입 L 붙여줌
	    										// 하나만 붙여줘도 됨
	    System.out.println("l = " + l);    

	    
	    
	    System.out.println("--------------------------------");
	    

	    
	    float f2 = 0.1f;
	    double d = 0.1f;
	    boolean result = d == f2;
	   
	    
	    System.out.println("result="+result); 
	   
	    System.out.printf("%.20f\n", f2);				
	    System.out.printf("%.20f\n", d);


		
	}

}





