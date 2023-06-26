import java.util.Iterator;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		/*
		 * String s = "Welcome to java"; String word[]=s.split(" "); String
		 * reversestring=""; for(String w:word) { String reverseword=""; for(int
		 * i=w.length()-1;i>=0;i--) { reverseword=reverseword+w.charAt(i); }
		 * reversestring=reversestring+reverseword+" "; }
		 * System.out.println(reversestring);
		 */
		//Approach 2
		String s="Welcome to Java";
		String word[] = s.split("\\s");
		String reversestring="";
		for(String w: word) {
			StringBuilder b= new StringBuilder(w);
			b.reverse();
			reversestring=reversestring+b.toString()+ " ";
		}
		System.out.println(reversestring);
	}
}
		
		
