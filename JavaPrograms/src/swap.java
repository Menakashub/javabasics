
public class swap {

	public static void main(String[] args) {
		int a=10;int b=20;
		System.out.println("Before swapping" +a+ " " +b);
		
		//logic 1-using Third variable
		/*
		 * int t=a; a=b; b=t; System.out.println("After swap" +a+" "+b);
		 */
		
		//logic2 -without third variable
		a=a+b; //30
		b=a-b;//10
		a=a-b;
		System.out.println("After swap" +a+ " " +b);
		
		

	}

}
