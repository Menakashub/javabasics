import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListAndSet {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("grape");
		list.add("Apple");
		for (String value : list) {
			System.out.println(value);
		}
		Collections.sort(list);
	}

}
