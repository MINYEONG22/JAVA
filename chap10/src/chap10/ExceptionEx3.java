package chap10;
/*
 *	finally 블럭 : try 블럭에서 정상처리가 되던, 예외가 발생하던 모두 실행이 되는 블럭.
 *				 중간에 return(메서드 종료)이 실행돼도, finally 블럭의 문장은 실행!
 *
 *	정상처리: 12356
 *	2/0 오류: 1456
 *	정상처리: try 부분에 return : 1235
 *	 : return 메서드 끝내라. => 123만 나와야하는데, finally가 있으니까 finally까지는 하고, finally 밖에 6은 출력 x, catch도 x
 *	2/0 catch return 오류: 145
 *	
 *	finally는 무조건, 꼭 하고 가라. 정상이어도 에러여도 실행.
 *
 */
public class ExceptionEx3 {

	public static void main(String[] args) {

		try {
			System.out.print(1);
			System.out.print(2/0);
			System.out.print(3);
//			return;								// 리턴이 여기도 있고
		} catch (Exception e) {
			System.out.print(4);
			return;								// 여기도 있으면,
		} finally {
			System.out.print(5);
		}
		System.out.println(6);					// 실행될 확률이 0% 오류
		
	}

}
