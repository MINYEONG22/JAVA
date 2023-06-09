package test;

public class Test4_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 배열 선언, 생성
				Integer[] num = new Integer[10];
				//2. 임의의 수 10개 배열 저장
				for (int i = 0; i < num.length; i++) {			
					num[i] = (int) (Math.random() * 100) + 1;
				}
				
				
				//3. 정렬, 내림차순
				
				for (int i = 0; i < num.length; i++) {
					boolean sorted = true;
					for (int j = 0; j < num.length - 1 - i; j++) {
						//swap 알고리즘. 
						if (num[j] < num[j + 1]) { //내림차순 정렬
							int temp = num[j];
							num[j] = num[j + 1];
							num[j + 1] = temp;
							sorted = false; //순서가 변경된 경우
						}
					}
					if(sorted) break;
				}
		
//				Arrays.sort(num);  //num 배열을 오름차순 정렬
				//num 배열을 내림차순 정렬 불가.기본자료형은 안됨. 
				// int num[] => Integer num[] 형으로 변경
				
//				Arrays.sort(num,Comparator.reverseOrder());   
				
				//4. 출력
				for (int i = 0; i < num.length; i++) {
					System.out.print(num[i]+ ((i==num.length-1)?"":","));
				}
		
	}

}
