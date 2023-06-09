package test;
/*
[결과] 
 HTML=>홍길동
 CSS=>김삿갓
 JavaScript=>이몽룡
 JAVA=>성춘향
 JSP=>임꺽정
 스프링=>향단이
*/
public class Test3 {

	public static void main(String[] args) {
		String s1 = "HTML -   CSS -    JavaScript -   JAVA -  JSP - 스프링";
		String s2 = "홍길동,김삿갓 ,이몽룡 ,성춘향 ,임꺽정 ,향단이";
		
		String[] arr1 = s1.split("-");		// 분리할 때 공백도 그대로 들어감
		String[] arr2 = s2.split(",");
		
		for(int i = 0; i<arr1.length; i++) {
//			System.out.println(arr1[i] +"=>"+ arr2[i]);    // 이렇게 하면 공백도 다 추가 됨
			System.out.printf("%s=>%s\n",arr1[i].trim(),arr2[i].trim());		//방법1
		}
	
		System.out.println("===============");
// 		\\s* : 공백 0개 이상 => 정규식: 문자의 특성을 기호 표시
		
		arr1 = s1.split("\\s*-\\s*");		// - 를 중심으로 공백이 있으면 다, 없애줘
		for(int i = 0; i<arr1.length; i++) {
			
			System.out.printf("%s=>%s\n",arr1[i],arr2[i]);				//방법2
		}
		
	}

}
