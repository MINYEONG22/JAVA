package test2;

import java.util.Arrays;

/*
command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
int num1 = Integer.parseInt(args[0])
   [결과]
   10과 20 의 공약수 : 1,2,5,10,
 */
public class Test3 {

		public static void main(String[] args) {
		      // TODO Auto-generated method stub

		      int num = Integer.parseInt(args[0]);
		      int index = 0;
		      int index2 = 0;
		      
		      
		      int arr[] = new int [10];
		      int arr1[] = new int [10];
		      
		      for (int i=1; i<=20; i++) {
		         for(int j=1; j<=20; j++) {
		            
		            if(i*j==10) {
		               
		               arr[index++] = i;
		            }
		            
		            
		            if(i*j==20) {
		               
		               arr1[index2++] =i;

		            }
		            
		         }
		         
		      }
		      
		      arr = Arrays.copyOf(arr, arr.length - index);
		      arr1 = Arrays.copyOf(arr1, arr1.length - index);

		      for(int a : arr) {
		         for(int b : arr1) {
		            if(a == b)
		               System.out.println(a);
		         }
		      }

	}

}
