package CreatingJavaProgramsCH2.CH2_Projects;

public class CH2_P_2 {
/*
 * Documentation: 10/10/2014
 * 
 * Write a program that produces the following output:
 * 
 * +------+
 * |  ^^  |
 * | ^  ^ |
 * |^    ^|
 * |  ^^  |
 * | ^  ^ |
 * |^    ^|
 * +------+
 * |v    v|
 * | v  v |
 * |  vv  |
 * |v    v|
 * | v  v |
 * |  vv  |
 * +------+
 */
	
	public static void makeLine(int SIZE) {
		System.out.print("+");
		for (int i = 1; i <=SIZE; i++) {
			System.out.print("-");
		}
		System.out.print("+");
		System.out.println();
	}
	
	public static void makeBody(int SIZE){
		
		int centr = 0;
		int left = 3;
		int right = 3;
		for (int n = 1; n <= 2; n++) {
			
			for (int i = 1; i <= SIZE/2; i++) {
				
				System.out.print("|");

				for (int j = 1; j <=left; j++) { //L
					System.out.print(" ");
					left--;
				}
				
				System.out.print("^"); //carrot 1
				centr = (i * 2) - 2; //calculate the sequence for center spaces
				
				for (int j = 1; j <= centr; j++) { //center spaces
					System.out.print(" ");
					
				}
				System.out.print("^"); //carrot2
				
				for (int j = 1; j <=right; j++){ //R
					System.out.print(" ");
					right--;
				}
		
				System.out.print("|");
				System.out.println();
			}
			 centr = 0;
			 left = 3;
			 right = 3;
		
		}
		
	}
	
	
	public static void bodyRev(int SIZE) {
		int left = 3; 
		int centr = 0;
		int right = 3;
		for (int i = 1; i <= 2; i++) { //2 iterations
			for (int j = 1; j <= SIZE/2; j++) { //opening pipe
				System.out.print("|");
				left = (j * 1) - 1;
				for (int k = 1; k <=left; k++) { //L
					
					System.out.print(" ");
					
				}
				System.out.print("v"); //first V
				
				centr = (j * -2) + 6;  //calculate center space formula
				
				for (int k = 1; k <= centr; k++) {
					System.out.print(" ");
				}
				
				System.out.print("v");//second v
				                        //R
				right = (j * 1) - 1; 
				for (int k = 1; k <= right; k++) {
					System.out.print(" ");
				}
				
				System.out.print("|"); //closing pipe
				System.out.println();
				
			}
			
		}
	}
	
	
	
	public static void main(String args[]) {
		
		final int SIZE = 6;
		
		                             //print the top
		makeLine(SIZE);
		                           //print the body
		makeBody(SIZE);
		                         //print the middle
		makeLine(SIZE);
		
		bodyRev(SIZE);          //print body reverse
		
		makeLine(SIZE);        //print bottom
		
		
		
	}
}
