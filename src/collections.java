
import java.util.*;

public class collections {

	public static void main1(String[] args) {

		String[] a = {"eggs", "lasers", "hats", "pants", "socks", "pie"};	
		List<String> l1 = new ArrayList<String>();		
		// add array items to list	
		for(String x: a){
			l1.add(x);
		}
		
		String[] computerparts = {"monitor", "power cable", "memory", "hard disk"};
		List<String> l2 = new ArrayList<String>();
		//add array items to list	
		for(String x: computerparts){
			l2.add(x);
		}
		
		// print
		for(String x: l1){
			System.out.println(x);
		}
		
		for (int i = 0; i < l2.size(); i++) {
			System.out.println(l2.get(i));			
		}
		
	}
	
}
