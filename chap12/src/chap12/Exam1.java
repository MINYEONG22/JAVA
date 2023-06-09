package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 *	화면에서 홀수 개의 정수를 입력 받아 입력 받은 숫자의 평균값과 중간값 출력하기 
 *	999 숫자가 입력된 경우 입력 종료.
 *	평균: 종합/요소의 갯수
 *	중간값: 정렬을 해서 가운데에 있는 값  size/2
 *	
 */
public class Exam1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	//	List<Integer> list = new ArrayList<>();
		List<Integer> list = new Vector<>();
	// List는 인터페이스, 인터페이스는 구현클래스(ArrayList, Vector)필요. => 상속 관계로 보면 됨
												// add, element 
		System.out.println("홀수 개의 점수를 입력하세요(종료:999)");
		
		int avg = 0;
		int sum = 0;
		int ind = 0;
		while(true) {
			int num = scan.nextInt();
			if(num == 999) {
				break;
			}
			list.add(num);			// 요소 추가
			sum += num;				// 총점
		}
		if(list.size()%2 ==0) {
			System.out.println("한 번 더 입력하세요.");
			int num	= scan.nextInt();
			list.add(num);
			sum += num;	
		}
		Collections.sort(list);		// 정렬
		avg = sum/list.size();		// 평균
		ind = list.size()/2;
		
		System.out.println(list);
		System.out.println("평균: "+(double)avg);
		System.out.println("중간값: "+list.get(ind));	//get으로 가지고 오기
		
	}
}
