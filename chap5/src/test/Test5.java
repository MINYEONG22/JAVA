package test;

import java.util.Scanner;

/*
동전의 종류와 동전의 갯수 지정하여, 지정된 갯수만큼만 동전 변경하기
500,100,50,10,5,1원짜리 동전이 각각 5개씩 있다고 가정할때,
입력된 금액을 동전으로 바꿔주고, 남은 동전을 출력하기
[결과] 
금액을 입력하세요
36000
동전이 부족합니다.
[결과] 
금액을 입력하세요
3010
500원:5
100원:5
50원:0
10원:1
5원:0
1원:0
남은 동전 500원:0개
남은 동전 100원:0개
남은 동전 50원:5개
남은 동전 10원:4개
남은 동전 5원:5개
남은 동전 1원:5개
*/
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);	
	System.out.println("금액을 입력하세요.");
	
	
	int coin[] = {500, 100, 50, 10, 5, 1};
	int cut[] = {5, 5, 5, 5, 5, 5};
	
	int money = scan.nextInt();
	int maxmon = 0;				//바꿔줄 수 있는 최대 금액
		
		
	}

}
