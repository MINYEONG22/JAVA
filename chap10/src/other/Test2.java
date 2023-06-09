package other;
import java.util.Scanner;

/*
국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를  입력받은 후, 총점, 평균을 구하고 이들 모두에 대한 
막대그래프를 아래 조건에 맞게 그릴 수 있는 프로그램을 작성하시오.
(1) 국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를 점수를 입력받은 후, 
   이에 대한 총점, 평균, 최대 점수, 최소 점수를 구한다. 
(2) 평균은 정수로 출력해야하며, 소수점은 모두 버린다. 
(3) 위에서 구한 점수들을 출력 후에는 이들 값을 기준으로모두 막대그래프로 표현한다.
과목별 점수와, 평균, 최대점수, 최소점수가 그래프를 그려야할 대상이며 막대그래프는 10 점 당 '*' 하나로 
대표하며, 10 의 단위이하의 자리숫자는 고려하지 않는다. 
[결과]
국어 영어 수학 물리 화학 사회 컴퓨터 점수를(1 - 100) 입력하세요
70 80 90 100 80 75 60
총합 :555
평균 :79
최대 :100
최소 :60
100	 	 	 	*	 	 	 	*	 	 
 90	 	 	*	*	 	 	 	*	 	 
 80	 	*	*	*	*	 	 	*	 	 
 70	*	*	*	*	*	*	 	*	 	*
 60	*	*	*	*	*	*	*	*	*	*
 50	*	*	*	*	*	*	*	*	*	*
 40	*	*	*	*	*	*	*	*	*	*
 30	*	*	*	*	*	*	*	*	*	*
 20	*	*	*	*	*	*	*	*	*	*
 10	*	*	*	*	*	*	*	*	*	*
	국어	영어	수학	물리	화학	사회	컴퓨터	최대	최소	평균	
*/
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 영어 수학 물리 화학 사회 컴퓨터 점수를(1 - 100) 입력하세요");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int phy = scan.nextInt();
		int che = scan.nextInt();
		int soc = scan.nextInt();
		int com = scan.nextInt();
		

//		// 중에 가장 작은 값
		int arr[] = {kor,eng,math,phy,che,soc,com};
		int sum = 0;
		int max = arr[0];	// 최대값
		int min = arr[0];	// 최소값
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(max < arr[i]) {	// 최대값 구하기
				max = arr[i];
			}
			if(min >= arr[i]) {	// 최소값 구하기
				min = arr[i];
			}
		}
		System.out.println("총점: " + sum);
		System.out.println("합계: " + (int)sum/7);
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
		
	
	
		
	}
}