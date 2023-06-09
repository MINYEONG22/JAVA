package chap4;
/*
 *	switch(조건값)
 *
 * 	조건값으로 사용 가능 한 자료형
 * 	- (o) : byte, short, int, char, String 만 가능함.
 *  - (x) : float, double, long 안 됨. 
 */
public class SwitchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String v = ""+1;		//정수형을 문자열로 바꿔주려고, 자리를 만들어줌 ""
		
		switch (v) {
		
				case "1" : System.out.println(v);
						   break;
				
				default : System.out.println(v+10);;
				
		}
		
		
		
	}

}
