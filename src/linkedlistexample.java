
import java.util.*;

public class linkedlistexample {

	public static void main1(String[] args) {
		String[] things = {"apples", "noobs", "pwnge", "bacon", "goATS"};
		List<String> list1 = new LinkedList<String>();		
		for (String x : things) {
			list1.add(x);
		}
		
		System.out.println("");
		
		String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
		List<String> list2 = new LinkedList<String>();		
		for (String y : things2) {
			list2.add(y);
		}
		
		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		removestuff(list1, 2, 5);
		printMe(list1);
		reverseMe(list1);	
	}
	
	public static void printMe(List<String> l) {
		for (String x : l) {
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
	
	public static void removestuff(List<String> l, int start, int end) {
		l.subList(start, end).clear(); // clear items from start index to end index
	}

	public static void reverseMe(List<String> l) {
		ListIterator<String> bobby = l.listIterator(l.size());
		while (bobby.hasPrevious()) {
			System.out.printf("%s ", bobby.previous());			
		}
		System.out.println();		
	}
}
