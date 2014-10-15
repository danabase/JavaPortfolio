package CreatingJavaProgramsCH2.CH2_Projects;
/*
 * Documentation Date: 10/10/2014
 * 
 * Write a program that produces the following gifure as its output.
 * use a class constant to make it possible to change the size of the figure (this example uses size 4)
 * 
 * 10/10/2014: next time: implement the constant, and have all the "magic numbers" derive from that constant
 * 
 * 
 *                     ||    x 4
 *                     ||
 *                     ||                                           
 *                     ||  
 *                  __/||\__
  *              __/:::||:::\__ x 3  
  *           __/::::::||::::::\__  x 6
  *        __/:::::::::||:::::::::\__   x 9
 *         |""""""""""""""""""""""""|   x 24 
 *         \_/\/\/\/\/\/\/\/\/\/\/\_/   x 10 pointy cones
 *           \_/\/\/\/\/\/\/\/\/\_/     x 8  pointy cones
 *             \_/\/\/\/\/\/\/\_/       x 6  pointy cones           
 *               \_/\/\/\/\/\_/         x 4  pointy cones  
 *                     ||
 *                     ||
 *                     ||                x 4                                   
 *                     ||
 *                  |%%||%%|            x 16
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%|
 *                  |%%||%%| 
 **                 __/||\__                 //replica of top
  *              __/:::||:::\__  
  *           __/::::::||::::::\__
  *        __/:::::::::||:::::::::\__
 *         |""""""""""""""""""""""""|         x 26 spaces on widest part   (13 each side)          
 *                                           
 *                                           
 *                                           
 */
		

public class CH2_P_6 {
	
	public static void simple4(int SIZE) {
		for (int i = 1; i <= SIZE; i++) {
			for (int j = 1; j <= 13; j++) {
				System.out.print(" ");
			}
			System.out.print("||");
			System.out.println();
			
		}
		
	}
	
	public static void topHalf(int SIZE) {
		int left = 0;
		int centr = 0;

		
		for (int i = 1; i <= SIZE; i++) {
            //Left spaces
				left = (i * -3) + 13;
				
				for (int j = 1; j <= left; j++) {
				System.out.print(" ");
				}
				
				System.out.print("__/");
				             //center
				centr = (i * 3) - 3; 
				
				for (int j = 1; j <= centr; j++) {
				System.out.print(":");
				}
				
				System.out.print("||");
				
				for (int j = 1; j <= centr; j++) {
				System.out.print(":");
				}
				
				System.out.print("\\__");
				
				
				
				System.out.println();
				}
				
				System.out.print("|");
				for (int i = 1; i <=(26); i++) {
				System.out.print("\"");
				}
				System.out.print("|");
				System.out.println();
		
	}
	
	public static void makeCones(int SIZE) {
		int left = 0;
		int cone = 0;
		
		for (int i = 1; i <=SIZE;i++){  //send in the cones
			left = (i * 2) - 1;
			
			for (int j = 1; j <= left; j++){
				System.out.print(" ");
			}
			
			
			System.out.print("\\_/");
			cone = i * -2 + 12;
			
			for (int j = 1; j <= cone; j++){
				System.out.print("\\/");
			}
			System.out.print("\\_/");
			System.out.println();
		}
		
		
	}
	
	public static void spine(int SIZE) {
		for (int i = 1; i <= 16; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(" ");
			}
			System.out.print("|%%||%%|");
			System.out.println();
		}
		
	}
	public static void main(String args[]) {
		
		final int SIZE = 4;
		
		
		simple4(SIZE);
		
		topHalf(SIZE);
		

		makeCones(SIZE);
		
		
		
		simple4(SIZE);
		
		spine(SIZE);
		
		topHalf(SIZE);
		
	}
	
	

}
