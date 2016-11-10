
import java.util.*;

public class convertlisttoarray {

	public static void main(String[] args) {
		
		String[] stuff = {"apples", "noobs", "pwnge", "bacon", "goats"};
		LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(stuff));
		
		list1.add("pumpkin");
		list1.addFirst("number one");
		
		stuff = list1.toArray(new String[list1.size()]);
		
		for (String string : list1) {
			System.out.printf("%s ", string);
		}
		
	}
	
}
