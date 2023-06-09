package chap12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*	Map = Dictionary
 * 	Map 인터페이스: (key, value)로 한 쌍인 객체들의 모임
 * 				   └ Map.Entry 형인 객체
 * 	메서드 종류
 * 	- put(key,value) : map 객체에 데이터 추가														- 추가와 수정 put으로
 *  - get(key) : map 객체의 key 값에 해당하는 value값 리턴											┐
 *  - keySet() : map 객체의 key 값들 리턴 => 리턴타입 Set : key값은 중복이 안 되니까						│
 *  - values() :  map 객체의 value 값들 리턴 => 리턴타입 Collection : 중복이 될 수도 있고, 순서 모르고...	│
 *  		- value 값으로 key 선택은 불가														│   조회 방법
 *  - Set<Map.Entry> entrySet() : (key,value)의 한 쌍인 객체들 리턴								│
 *  							 Map.Entry ┌ getKey() 	: key값								│
 *  									   └ getValue()	: value 값							┘
 *  - remove(key) : map 객체의 key 값에 해당하는 value값 제거. value값 리턴
 */
public class MapEx1 {

	public static void main(String[] args) {
		String[] names = {"홍길동","김삿갓","이몽룡","임꺽정","김삿갓"};
		int[] nums = {1234,4567,2350,9870,3456};
		Map<String,Integer> map = new HashMap<>();
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
				  //  key	, value
		// key값이 이미 있으면 value 값을 바꿈
		}
		System.out.println(map);
		// 순서 정렬x 
		System.out.println("김삿갓의 전화번호: "+map.get("김삿갓"));	// get에 key값을 넣어주면 key에 해당하는 value 값을 출력해줌
		System.out.println("홍길동의 전화번호: "+map.get("홍길동"));		
		System.out.println("김길순의 전화번호: "+map.get("김길순"));	// key값이 없으면 null로 반환
		System.out.println("map의 key값들: "+map.keySet());
		System.out.println("map의 value들: "+map.values());
	
		// key(): map의 key값들만 리턴
		Set<String> keys = map.keySet();
		// key 중복이 안 돼서 Set으로 받음
		for(String k : keys) {
		//	System.out.println(k);
			System.out.println(k+":"+map.get(k));	// key를 넣으면 value값이 나옴
		}
		// values() : map의 value 값들만 리턴 = 중복 가능,순서 모름
		Collection<Integer> values = map.values();
		for(Integer v : values) {
			System.out.println(v); 		// 값을 이용해서 key값을 알지 못함 
		}
		
		// entrySet() : (key,value) 쌍인 객체들 리턴
		//				(key,value)의 자료형: Map.Entry
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> e : entry) {
			System.out.println(e);
			System.out.println(e.getKey()+ ":" + e.getValue());
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		System.out.println("map 객체 요소의 갯수: "+ map.size());
		// 홍길동의 전화번호 제거하기
		Integer tel = map.remove("홍길동");			// key 값을 넣으면 해당 key의 value값 제거
		System.out.println(tel + " 전화번호 제거");
		System.out.println("map 객체 요소의 갯수: "+ map.size());
		map.remove("김삿갓");							// key 값을 넣으면 해당 key의 value값 제거
		System.out.println("map 객체 요소의 갯수: "+ map.size());
		System.out.println(map);
	}
}
