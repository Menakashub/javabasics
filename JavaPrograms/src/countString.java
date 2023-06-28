import java.util.Scanner;

public class countString {

	public static void main(String[] args) {
		/*
		 * int count =1; Scanner s = new Scanner(System.in);
		 * System.out.println("Enter your string");//welcome to java ans should be 3
		 * String word=s.nextLine(); for(int i=0;i<word.length();i++) {
		 * if(word.charAt(i)==' ') { count++; } } System.out.println("Count is "+count);
		 */
		//count character occurence in String
		String s ="Java Programming Java OOPS";
		int totalcount=s.length();
		int afterremove=		s.replace("a", "").length();
		int ans =totalcount-afterremove;
		System.out.println("Ans is "+ans);



	}
}