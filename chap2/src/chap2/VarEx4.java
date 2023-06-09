package chap2;


/*
 *	형 변환 연산자 
 * 
 * 	기본자료형 중 boolean을 제외한 7개의 자료형은 서로 변환이 가능.
 * 		- boolean은 형 변환이 안 됨
 * 
 * 	■ 자동형변환
 * 		- 작은 자료형에서 큰 자료형으로 변환: 형변환 연산자 생략 가능
 * 
 * 	■ 명시적형변환
 * 		- 큰 자료형이 작은 자료형으로 변환될 땐, 형변환 연산자 생략 불가능
 * 
 * 	byte(1), short(2), int(4), long(8), float(4/10의 38승까지 표현할 수 있어서 long이 8byte지만,
 * 											  값의 크기로는 float가 더 큰 자료형), double(16)
 * 		     char
 * 
 */

public class VarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long l = 100;
		float f = l;				
		
		System.out.println(f);
		
		
		//리터럴에 사용되는 접미사
		
		/*
		 *	L,l : long 타입의 리터럴값 
		 * 	F,f : float 타입의 리터럴값
		 *  D,d : double 타입의 리터럴값
		 * 
		 */
		
		long l1 = 1000;				// long l1 = (long)1000;  (long)이 생략 되어 있음
		long l2 = 1000L;			// long 타입의 1000
		
//		float f1 = 10.5;			// 실수타입의 리터럴의 기본 자료형은 double 임. 
/*수정*/	float f1 = (float)10.5;		// 형변환을 해서 오류 해결
		float f2 = 10.5f;			// f(접미사)라는 float 타입의 리터럴값을 추가해서 오류 해결
		
		double d1 = 10.5; 			// d라는 리터럴값 생략. 기본이 double
		
		//ip 주소(IPv4): 32bit 4개로 분리함. 
		//		 IPv6 : 128bit 같이 사용함. IPv4는 부족해... 같이 겸용해서 사용 중.  
		
		
	}

}
