/**
 * @author AviralJanveja
 * Search an array using for-each style loop.
 * The for-each style for is an excellent choice for this application because searching an unsorted
 * array involves examining each element in sequence.
 * Of course if the array was sorted, a binary search could be used.
 * Which would require a different style loop.
 */
public class Array_Search {

	public static void main(String[] args) 
		throws java.io.IOException { // See the Do_While_Menu program. 
			
		
		int nums[] = {6,8,3,7,5,6,1,4}; 
		int val = 1;
		boolean found = false;
		// To get the input from user directly.
		
		// use for-each for to search nums for val. 
		for (int x: nums) {
			if (x == val) {
				found = true;
				break;
			}
		}
		
		if(found)
			System.out.println("Value found.");
		else 
			System.out.println("Value not found.");

	}
	
	
}
