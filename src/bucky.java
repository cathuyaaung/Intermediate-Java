
public class bucky {

	public static void main(String[] args) {
		
		String[] words = {"funk", "chunk", "furry", "beaconator"};
		

		for(String w: words){
			System.out.print(w);
			// startsWith
			if (w.startsWith("fu")) {
				System.out.print(" starts with fu");
			}
			// endsWith			
			if (w.endsWith("unk")) {
				System.out.print(" ends with unk");
			}
			
			System.out.println();			
		}

		
	}
	
}
