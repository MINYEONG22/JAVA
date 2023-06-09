package test;

public class Test6_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] num= new int[3];
		
		for(int i=0;i<1000;i++) {
			
			int f = (int)(Math.random() * arr.length);
			int t = (int)(Math.random() * arr.length);
			
			int tmp = arr[f];
			arr[f] = arr[t];
			arr[t] = tmp;
			
		}
		
		for(int i=0;i<num.length;i++) {
			
			num[i] = arr[i];
			
			
		}
		
		//정렬
		/*
		for(int i=0;i<num.length;i++) { 
			for(int j=0;j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		*/
//		Arrays.sort(num);
		for(int n : num) {
			
			System.out.print(n);
			
		}	
		
		System.out.println();
	}

}
