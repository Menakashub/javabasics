
public class numberspattern {
	public static void main(String args[]) {
		int row;
		int colAt;
		int colsttar;
		for(row=1;row<=3;row++) {
			for(colAt=2;colAt>=row;colAt--) {
				System.out.println("@");
			}
			for(colsttar=1;colsttar<=row;colsttar++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		
	}	

}
