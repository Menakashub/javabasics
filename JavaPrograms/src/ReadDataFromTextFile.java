import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		//method 1 -using FileReader,BufferReader
		/*
		 * FileReader fr= new
		 * FileReader("C:\\Users\\Menakas\\OneDrive\\Desktop\\Read.txt"); BufferedReader
		 * br= new BufferedReader(fr); String s; while((s=br.readLine())!=null) {
		 * System.out.println(s); }
		 */
		//method 2 - file
		File file = new File("C:\\Users\\Menakas\\OneDrive\\Desktop\\Read.txt");
		Scanner sc = new Scanner(file);
		/*
		 * while(sc.hasNext()) { System.out.println(sc.nextLine()); }
		 */
		// method 3 - delimiti
		
		  sc.useDelimiter("//Z"); System.out.println(sc.next());
		 
		
	}
}
