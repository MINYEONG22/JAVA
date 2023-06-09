package chap12;

import java.util.Comparator;
import java.util.TreeMap;
/*
 *  TreeMap 예제: Key 순으로 정렬 됨
 */
public class MapEx3 {
	public static void main(String[] args) {
//		TreeMap<Integer, String> scores = new TreeMap<>();	// Tree 점수 순 정렬
		TreeMap<Integer, String> scores = new TreeMap<>(Comparator.reverseOrder());  // 역순
		scores.put(87, "홍길동");
		scores.put(98, "이몽룡");
		scores.put(75, "임꺽정");
		scores.put(94, "김삿갓");
		scores.put(80, "성춘향");
		scores.put(88, "향단이");
		System.out.println(scores);	
		System.out.println("첫번째 key 값: " + scores.firstKey());
		System.out.println("첫번째 entry 값: " + scores.firstEntry());		// (key, value)
		// 가장 높은 점수를 받은 사람의 이름 출력하기
		System.out.println("가장 높은 점수를 받은 사람(방법1): "+scores.get(scores.firstKey()));
		System.out.println("가장 높은 점수를 받은 사람(방법2): "+scores.firstEntry().getValue());
		System.out.println("마지막 key 값: " + scores.lastKey());
		System.out.println("마지막 entry 값: " + scores.lastEntry());		// (key, value)
		System.out.println("94점 앞 점수");
		System.out.println(scores.lowerEntry(94));	// 역순이라 반대로 나옴 -> 94쪽 앞에 있는 거 가지고 와라 (94점은 포함하지 않음)
		System.out.println("94점 뒤 점수");
		System.out.println(scores.higherEntry(94)); // 역순이라 반대로 나옴 -> 94쪽 뒤에 있는 거 가지고 와라 (94점은 포함하지 않음)
		System.out.println("94점을 포함한 앞 점수");
		System.out.println(scores.floorEntry(94));	    // 94보다 작은 근사정수 (94점 포함)
		System.out.println("94점을 포함한 뒤 점수");
		System.out.println(scores.ceilingEntry(94));	// 94보다 큰 근사정수 (94점 포함)
	}
}
