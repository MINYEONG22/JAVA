package chap11;

import java.util.Arrays;
import java.util.Comparator;

/*
 *	Arrays 클래스: 배열의 복사, 비교, 정렬 기능을 포함하고 있는 클래스
 * 
 */
public class ArraysEx1 {
	public static void main(String[] args) {
		String[] arr1 = {"홍길동","이몽룡","성춘향","향단이"};
		for(String s : arr1) {
			System.out.print(s+",");
		}
		System.out.println();
		
		//arr1 배열의 값을 김삿갓으로 바꾸기
		Arrays.fill(arr1,"김삿갓");
		for(String s : arr1) {
			System.out.print(s+",");
		}
		System.out.println();
		
		//arr1 배열의 index 1, 2 값을 춘향전으로 바꾸기
		Arrays.fill(arr1,1,3,"춘향전");	//arr1의 index 1부터 3 앞까지 "춘향전"
		for(String s : arr1) {
			System.out.print(s+",");
		}
		System.out.println();
		
		//arr1 배열 정렬하기 - 오름차순
		Arrays.sort(arr1);
		for(String s : arr1) {
			System.out.print(s+",");
		}
		System.out.println();
		
		//arr1 배열 정렬하기 - 내림차순(역순)
		Arrays.sort(arr1, Comparator.reverseOrder());
		for(String s : arr1) {
			System.out.print(s+",");
		}
		System.out.println();
		
	}
}
