package chap7;
// instanceof 연산자: 단항연산자.
// 	객체와 참조변수의 관계를 리턴
public class InstanceOfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent2 p = new Child2();		//	Parent2 p = new Parent2(); 로 하면 두번째 if문부터 나옴
		if(p instanceof Child2) {
			System.out.println("p 참조변수 객체는 Child2 객체임");
			Child2 c = (Child2)p;
			System.out.println(c.x);
		}
		if(p instanceof Parent2) {
			System.out.println("p 참조변수 객체는 Parent2 객체임");
			System.out.println(p.x);
		}
		if(p instanceof Object) {
			System.out.println("p 참조변수 객체는 Object 객체임");
			Object o = p;
//			System.out.println(o.x);	 
//		  	오브젝트에는 x가 없음. 자신의 참조변수 타입의 멤버만큼만 호출 가능
		}
	}

}
