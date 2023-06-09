package test;
//다음 소스는 컴파일 오류가 발생한다. 결과가 "Tested" 가 출력되도록 프로그램을 수정하기

interface Beta {    }			// 인터페이스 - 상수, 추상메서드, default 메서드, static 메서드
								// 멤버가 없으면 허용의 의미.


class Alpha implements Beta {
	String testIt() {
		return "Tested";
	}
}
class Gamma implements Beta {
	String testIt1() {
		return "Gamma";
	}
}


public class Test2 {
	static Beta getIt() {
		return new Alpha();				//베타 getItdp 알파
	}
	public static void main(String[] args) {
		// b가 참조하고 있는 객체는 Alpha 객체인데, Alpha 객체를 Gamma 타입으로는 형변환 할 수 없음.
		// Alpha와 Gamma는 서로 상관이 없는 객체임.
		// return new Alpha();를 Gamma로 바꿔주면 Alpha에서 ClassCastException 예외 발생
		Beta b = getIt();
		
		Alpha a = (Alpha)b;					// 알파 타입으로 형변환 해줘야함
		System.out.println(a.testIt());		// 부모에서 자식클래스 참조할 때 형변환연산자 생략 불가.
		// 한 줄로
		System.out.println(((Alpha)b).testIt());		// b를 Alpha로 변환
		
		Gamma g = (Gamma)b;					//ClassCastException 예외 발생
		System.out.println(g.testIt1());
	}
}