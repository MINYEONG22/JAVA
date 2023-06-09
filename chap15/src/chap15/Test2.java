package chap15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        List<Integer> numList = new ArrayList<Integer>();
        System.out.print("정수 입력 (종료:0)");
        while(true) {
            int num = scan.nextInt();
            if(num == 0) break;
            numList.add(num);
        }
        /** 오름차순 정렬 */
        numList.sort(Comparator.naturalOrder());
        
        /** 짝수 */
        List<Integer> list = 
              IntStream.rangeClosed(numList.get(0), numList.get(numList.size()-1))
              /** 조건 */
              .filter(el -> el%2 == 0 && numList.contains(el))
//              .filter(el -> el == numList.get(0) || el == numList.get(1) || el == numList.get(2))
              // int를 Integer로 변경
              .boxed()
              .collect(Collectors.toList());
        
        // 이중콜롬(::) 의미
        // names.forEach(x -> System.out.println(x));
          // names.forEach(System.out::println);
        Integer sum1 = list.stream().reduce(0, Integer::sum);
        System.out.println("짝수 리스트: " + list);
        System.out.println("짝수 합계: " + sum1);
        
        /** 홀수 */
        List<Integer> list2 = 
              IntStream.rangeClosed(numList.get(0), numList.get(numList.size()-1))
              /** 조건 */
              .filter(el -> el%2 != 0 && numList.contains(el))
              // int를 Integer로 변경
              .boxed()
              .collect(Collectors.toList());
        Integer sum2 = list2.stream().reduce(0, Integer::sum);
        System.out.println("홀수 리스트: " + list2);
        System.out.println("홀수 합계: " + sum2);
	}
}
