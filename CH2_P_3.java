package CreatingJavaProgramsCH2.CH2_Projects;
/*
 * Initial Creation: 10/13/2014
 * Recommendations: for CHAR_SIZE, use odd numbers only to ensure scalable growth and equal sides
 * 
 * Write a program the produces the following output:
 * 
// *  +---------+
// *  |    *    |
// *  |   /*\   |
// *  |  //*\\  |
// *  | ///*\\\ |
// *  | \\\*/// |
// *  |  \\*//  |
// *  |   \*/   |
// *  |    *    |
// *  +---------+
// *  | \\\*/// |
// *  |  \\*//  |
// *  |   \*/   |
// *  |    *    |
// *  |    *    |
// *  |   /*\   |
// *  |  //*\\  |
// *  | ///*\\\ |
// *  +---------+   
 
public class CH2_P_3 {
	
	public static void makeBand(int char_size){
		System.out.print("+");
		
		for (int i = 1; i <= char_size; i++) {
			System.out.print("-");
		}
		System.out.print("+");
	}
	
	public static void topHalf(int width) {
		// *  +---------+
		// *  |    *    |
		// *  |   /*\   |
		// *  |  //*\\  |
		// *  | ///*\\\ |
		int count = 0;
	 
		for (int i = 1; i <= width/2; i++) { //top half
			System.out.print("|");
			count = (i * -1) + (width/2 + 1);             //spaces
		
			for (int j = 1; j <= count; j++){ 
				System.out.print(" ");	
			}
			
			count = (i * 1) - 1;             //slashes
			for (int j = 1; j<=count; j++) {
				System.out.print("/");
			}
			System.out.print("*");
			                               //slashes
			for (int j = 1; j<=count; j++) {
				System.out.print("\\");
			}
			
			count = (i * -1) + (width/2 + 1);  //spaces
			for (int j = 1; j <= count; j++){
				System.out.print(" ");	
			}
			System.out.print("|");
			System.out.println();
		}
		
	}
	
	public static void bottomHalf(int width) {
		// *  | \\\*/// |
		// *  |  \\*//  |
		// *  |   \*/   |
		// *  |    *    |
		int count = 1;
		
		for (int i = 1; i <= width/2; i++) { //top half
			System.out.print("|");
			count = i;                         //spaces
			for (int j = 1; j <= count; j++){ 
				System.out.print(" ");	
			}
			
			count = (i * -1) + (width/2);             //slashes
		//	System.out.print("count: "+count);
			for (int j = 1; j<=count; j++) {
				System.out.print("\\");
			}
			System.out.print("*");
			                               //slashes
			for (int j = 1; j<=count; j++) {
				System.out.print("/");
			}
			
			count = i;                           //spaces
			for (int j = 1; j <= count; j++){
				System.out.print(" ");	
			}
			System.out.print("|");
			System.out.println();
		}
	}

	
	public static void main(String args[]) {
		final int CHAR_SIZE = 13; //width
		final int WIDTH = CHAR_SIZE - 1;
	
		makeBand(CHAR_SIZE);
		
		System.out.println();
		
		topHalf(WIDTH);
		
		bottomHalf(WIDTH);
		
		makeBand(CHAR_SIZE);
		
		System.out.println();
		
		bottomHalf(WIDTH);
		
		topHalf(WIDTH);
		
		makeBand(CHAR_SIZE);
		

		
	}
}
