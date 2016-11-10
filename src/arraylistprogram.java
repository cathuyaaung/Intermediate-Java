import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class arraylistprogram {
	public static void main(String[] args) {

		String[] a = {"eggs", "lasers", "hats", "pants", "socks", "pie"};	
		List<String> l1 = new ArrayList<String>();		
		// add array items to list	
		for(String x: a){
			l1.add(x);
		}
		
		String[] computerparts = {"eggs", "lasers", "monitor", "power cable", "memory", "hard disk"};
		List<String> l2 = new ArrayList<String>();
		//add array items to list	
		for(String x: computerparts){
			l2.add(x);
		}
		
		// print l1, l2
		for(String x: l1){
			System.out.print(x+" ");
		}		
		System.out.println();
		for (int i = 0; i < l2.size(); i++) {
			System.out.print(l2.get(i)+" ");			
		}
		System.out.println();
		editlist(l1,l2);
		// print l1
		for(String x: l1){
			System.out.print(x+" ");
		}			
	}
	
	public static void editlist(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator(); // loops through list 1
		while (it.hasNext()) { // if there's next item in list 1
			if (l2.contains(it.next())) { // if item in list 1 exist in list 2
				it.remove(); // remove it from list 1
			}
		}
	}
	
}
