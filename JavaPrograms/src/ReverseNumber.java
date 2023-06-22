import java.util.Iterator;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		//method 1
		int rev=0;
		/*
		 * while(num!=0) { rev=rev*10 + num%10; num= num/10; }
		
		System.out.println("Reversed number is " +rev); */
		//method 2 Using String Buffer class
		StringBuffer strrev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		strrev=sb.reverse();
		System.out.println("Reversed String using SB class is " + strrev);
		
		
		
		

	}

}
