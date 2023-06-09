package chap4;
/*
 
 	break: switch, 반복문에서 밖으로 제어를 이동
 	continue: 뒤쪽 실행 안 하고 반복문의 처음으로 제어를 이동
 
 */
public class LoopEx4 {

	public static void main(String[] args) {
		 for(int i=2; i<=9; i++) {
			 System.out.println("\n"+i+"단");
			 for(int j=2; j<=9; j++) {
//				 if(j==5) break;		// j가 5가 되면 멈춰
				 if(j==5) continue;		// 끝까지 안 가고 여기서 위로 올라가,
				 						// System.out.println(i+"x"+j+"="+(i*j)); 이거 실행 안 하고 바로 올라가서 
				 						// 출력 안 되고 6으로 넘어감
				 System.out.println(i+"x"+j+"="+(i*j));
			 }
		 }
	}
}
