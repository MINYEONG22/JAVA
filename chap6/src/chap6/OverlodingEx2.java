package chap6;
/*
 * 	오버로딩 메서드의 선택 기준 (우선순위)
 *  1. 호출 시 입력 된 인자값의 자료형과, 메서드의  매개변수로 정의된 자료형이 동일한 경우.
 *  2. 1의 조건이 없는 경우, 최소 개수로 자동형변환이 가능한 메서드를 선택.
 *  	=> 동일한 조건의 메서드가 여러 개 있으면 오류가 발생.
 * 
 */
class Math4 {
	int add(int a, int b) {
		System.out.print("1: ");
		return a+b;
	}
	// int int 형변환이 필요한데, 2번도 가능하고, 3번도 가능해서 어디로 들어가야할지 확실하지 않으면 에러
	// => 확실한 하나를 더 만들던가, 2번이나 3번 중에 하나를 지우던가
	long add(long a, int b) {
		System.out.print("2: ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("3: ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("4: ");
		return a+b;
	}
}
public class OverlodingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Math4 m = new Math4();
		
		System.out.println(m.add(10, 10));			
		System.out.println(m.add(10L, 10));			//접미사 붙여줘야함. 다른 메소드 출력될 수 있음
		System.out.println(m.add(10, 10L));			
		System.out.println(m.add(10L, 10L));
		
		// 자동형변환 가능.
		// long -> int 형변환은 안 됨.
		
	}

}
