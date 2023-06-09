package chap3;

import java.util.Scanner;

/*
 *	조건연산자(삼항연산자) : 조건문으로 변경이 가능한 구문 
 *	(조건문)?참:거짓
 *
 *	조건문: 조건문의 결과가 boolean인 문장
 * 
 */
public class OpEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("점수를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		
		System.out.println("방식1-----------------------");
		System.out.println(score+"점은 " + ((score >= 60)?"합격":"불합격"));
//		System.out.println(score+"점은 " + (score >= 60)?"합격":"불합격");		이건 오류
		
		
		System.out.println("방식2-----------------------");
		String result = (score >= 60)?"합격":"불합격";
		System.out.println(score+"점은 "+result);
		
		
		/*
		 * 70점 이상은 통과, 
		 * 60점 이상 70점 이하: 재시험 대상,
		 * 60점 미만: 탈락
		 *  
		 * 출력하기
		 */
		
		System.out.println("응용3-----------------------");
		result = (score>=70)?"통과":(score>=60)?"재시험대상":"탈락";
		System.out.println(score+"점은 "+ result);
		
		
	}

}
