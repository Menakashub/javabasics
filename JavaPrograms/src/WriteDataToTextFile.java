import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter wr= new FileWriter("C:\\Users\\Menakas\\OneDrive\\Desktop\\WriteText.txt");
		BufferedWriter 	bf= new BufferedWriter(wr);	
		bf.write("Hi , This is Menaka ,Writing from Eclipse");
		System.out.println("finished");
		bf.close();
	}
 
}
