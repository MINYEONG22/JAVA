package chap12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *	1. 대한민국 = 서울, 캐나다 = 오타와, 영국 = 런던 값을 저장하는 HashMap 객체에 저장하기 
 *  2. 화면에서 나라이름을 입력 받아 해당 수도를 출력하기
 *  3. 만약 등록된 나라가 아니면 입력된 나라의 수도를 입력 받아 map에 등록하기.
 *  4. 종료 시 map에 등록 된 내용을 출력하기 
 */
public class Exam5 {
	public static void main(String[] args) {

		Map<String, String> city = new HashMap<>();
		city.put("대한민국", "서울");
		city.put("캐나다", "오타와");
		city.put("영국", "런던");
		city.put("필라핀", "마닐라");
		city.put("일본", "도쿄");
//		city.put("태국", "방콕");
//		city.put("베트남", "하노이");
//		city.put("네팔", "카트만두");
//		city.put("라오스", "비엔티안(태국)");
//		city.put("몰디브", "말레");
//		city.put("말레이시아", "쿠알라룸푸르·푸트라자야");
//		city.put("몽골", "울란바토르");
//		city.put("미얀마", "네피도");
//		city.put("우즈베키스탄", "타슈켄트");
//		city.put("중국", "베이징");
		
		System.out.println("나라 이름을 입력하세요.");
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			String cou = scan.next();
			if(cou.equals("종료")) {	
				System.out.println("종료되었습니다."); 
		/*방법1*/	System.out.println(city); break;
		
			} else if(city.get(cou) == null) {
				System.out.println("등록 된 나라가 아닙니다. 수도를 등록해주세요.");
				String cap = scan.next();
				city.put(cou, cap);
				continue;
			} else {
				System.out.println(city.get(cou)); 
			}
		}
		/*방법2*/for(String k: city.keySet()) {
					System.out.println(k+":"+city.get(k));
				}	
		/*방법3*/for(Map.Entry<String, String> m : city.entrySet()) {
				System.out.println(m.getKey() +"-" + m.getValue());
		}
	}
}
