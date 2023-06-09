package test2;
/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
    int num = Integer.parseInt(args[0]);
  [결과]
  10의 약수 : 1,2,5,10,
*/


public class Test2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

   int num = Integer.parseInt(args[0]);

   int index = 0;   

   int arr[] = new int[4];
   
   
   if(args.length == 0) {
	   
	   System.out.println("Command 라인에 파라미터 입력하세요.");
	   return;
   }
   
   
   
   
   for(int i=1; i<=num; i++) {
      for(int j=1; j<=num; j++) {
         if(i*j == num) {
            
            arr[index++] = i;
         }
      }
   }
      
   for(int a=0; a<arr.length; a++) System.out.print(arr[a]+",");
   System.out.println();
   
   // for(int a : arr) System.out.print(a+",");
   // arr 길이 만큼 index가 돌면서 배열의 값 출력   

   
   
   for(String a:args) {
	
	   System.out.println(num+"의 약수");
	   for (int i=1; i<=num; i++) {
			if (num % i == 0)
				System.out.print(i + ",");
	   }
   }
   
               
            
      
   
      
      
      
   }

}