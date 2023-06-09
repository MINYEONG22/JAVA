package chap6;
/*
 *	매개변수 예제
 *	 - 기본형 매개변수
 *	 - 참조형 매개변수
 * 
 */
class Value {
	int val;
}

public class ParameterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v = new Value();
		v.val = 100;
		change1(v.val);
		System.out.println("change1 이후: "+v.val);
		change2(v);
		System.out.println("change2 이후: "+v.val);
	}
	
	
	static void change1(int val) {	// 기본형 변수라 main에 영향 없음 || 지역변수라 메서드가 종료되면 같이 사라짐 200 사라지고 100찍힘
		// TODO Auto-generated method stub
		val += 100;
		System.out.println("change1() 메서드: "+val);
	}
	static void change2(Value v) {	// 참조형 변수라 Value v 자체를 바꿔줘서 main에 영향 있음
		// TODO Auto-generated method stub
		v.val += 100;
		System.out.println("change2() 메서드: "+v.val);
	}


}
