/**
 * @author AviralJanveja
 * Try other possibilities and variations for this.
 * Experiment with it ! 
 * It displays a diamond shaped output.
 */
public class NestedLoop_Diamond {

	public static void main(String[] args) {
		
		int i, j; 
		
		for(i=1;i<=10;i++) {
			
			for(j=1;j<=10-i;j++)
				System.out.print(" ");
			for(j=1;j<=i*2-1;j++)
				System.out.print("*");
			
			System.out.println();
			}
		
		
		 
		for(i=10-1;i>0;i--) {
			
			for(j=1;j<=10-i;j++)
				System.out.print(" ");
			for(j=1;j<=i*2-1;j++)
				System.out.print("*");
			
			System.out.println();
		}
		
		
	}
	
	
}


