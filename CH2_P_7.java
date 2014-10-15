package CreatingJavaProgramsCH2.CH2_Projects;
/*
 * Initiated: 10/13/2014
 * Create the following output, complete with a class constant. The following output uses a size of 10
 * 
 * 
 *               +-----------------------------+    small dash: 29
 *              /                           __/	 *   side pipes: 5 (size/2)                                     
 *             /                        __/__//       right slash: 5
 *            /                     __/__/__///
 *           /                  __/__/__/__////
 *          /               __/__/__/__/__/////
 *         /            __/__/__/__/__/__//////
 *        /         __/__/__/__/__/__/__///////
 *       /     __ /__/__/__/__/__/__/__////////
 *      /   __/__/__/__/__/__/__/__/__/////////  
 *     /__/__/__/__/__/__/__/__/__/__//////////
 *    +-----------------------------+//////////
 *    |   Building Java Programs    |//////////
 *    |   Building Java Programs    |////////
 *    |   Building Java Programs    |//////
 *    |   Building Java Programs    |////
 *    |   Building Java Programs    |//                           
 *    +-----------------------------+
 */
public class CH2_P_7 {

	public static void makeBand(int dash, int size) {
		
		for (int i = 1; i<= size; i++){
			System.out.print(" ");
		}
		
		System.out.print("+");	
		
		for (int i = 1; i <=dash; i++) {
			System.out.print("-");
		}
		System.out.print("+");
	}
	
	public static void makeTop(int size, int smallDash){
		int count = 1;
		//first counter: 10 lines
		for (int i = 1; i <= size; i++){
				count = (i * -1) + (size + 1);
				//second counter: outer spaces from 9 - 1
				for (int j = 1; j <= count; j++){ 
					System.out.print(" ");
				}
				System.out.print("/");
			
			    //third counter: inner spaces
				//for (int j = 1; j <= size; j++) {
				count = (i * -3) + (smallDash+1);
				
				for (int j = 1; j <=count; j++){	
					System.out.print(" ");     //spaces inside perimeter	
				}		
				//fourth counter: tiles
				
				int count2 = ((size * 3) - count)/3; //calculate the number of iterations of "__/" 
				                                     //by subtracting the count from total char length (30), 
				                                     //divided by the number of spaces to make "__/"
				for (int j = 1; j <= count2; j++) {
					System.out.print("__/");
				}
				
				//fifth counter: slashes
				count = (i * 1) -1;
				for (int j = 1; j <= count; j++) {
					System.out.print("/");
				}
						
				
				
			System.out.println();
	 }
	}
	
    public static void makeBottom(int size){
    	int count = 1;
    	for (int i = 1; i <= size; i++){
			System.out.print("/");
		}
	    System.out.println();
	    for (int i = 1; i <=(size/2); i++) {
	    	System.out.print("|");
	    	for (int j = 1; j <=3; j++){System.out.print(" ");}
	    	System.out.print("Building Java Programs");
	    	for (int j = 1; j <=4; j++){System.out.print(" ");}
	    	System.out.print("|");
	    	
	    	count = (i * -2) + (size + 2);
	    	for (int j = 1; j <= count; j++){
	    		System.out.print("/");
	    	}
	    	
	    	System.out.println();
	    }
    }
	
	public static void main(String args[]) {
		final int size = 10;
		final int smallDash = (size * 3) - 1;
		
		makeBand(smallDash, size);
		System.out.println();
        makeTop(size,smallDash);
		makeBand(smallDash, 0);
		makeBottom(size);
	    makeBand(smallDash, 0);
	}

}
