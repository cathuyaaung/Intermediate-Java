
public class recursion {

	
	public static void main(String[] args) {

		// factorials
		// 5 factorials 5 x 4 x 3 x 2 x 1
		
		System.out.println(fact(5));
		
	}

	public static long fact(long n) {	
		if (n<=1) {
			System.out.printf("%d\n", n);
			return 1;
		}			
		System.out.printf("%d * ", n);
		return n * fact(n-1);
	}
	
	/*
	 * 5! = (5 * 4!)) = 5 * 24 = 120
	 * 			(4 * 3!) = 4 * 6 = 24
	 * 				(3 * 2!) = 3 * 2 = 6
	 * 					(2 * 1!) = 2 * 1 = 2
	 * 
	 * 
	 * 
	 * 
	 */
	
	
}
