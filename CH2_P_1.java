package CreatingJavaProgramsCH2.CH2_Projects;
/*
 * Documentation Date: 10/10/2014
 * 
 * Write a program that produces the following output:
 * 
 * ****** //////////// ******
   *****  //////////\\  *****
   ****   ////////\\\\   ****
   ***    //////\\\\\\    ***
   **     ////\\\\\\\\     **
   *      //\\\\\\\\\\      *
          \\\\\\\\\\\\
 * 
 * 
 */
public class CH2_P_1 {
public static void main(String args[]) {
		
		int spc = 1;
		final int SIZE = 12;
		int r = SIZE/2;
		int s = 0;
		int x = 1;

		for (int i = r; i >=1; i--) { //line level
			for (int j = 1; j <= i; j++) { //L star flag
				System.out.print("*");
			}
			for (int j = 1; j <= x; j++) { //space maker
				
				System.out.print(" "); 
			}
			
			for (int j = 1; j <= r; j++) {
				System.out.print("//");
			}
		
			for (int j = 0; j < s; j++){
				System.out.print("\\");
			}
			
			for (int j = 1; j <= spc; j++) { //R star flag
				System.out.print(" ");
			}
				
			for (int j = 1; j <= i; j++) { 
				System.out.print("*");
			}
			
			++spc;
			r-=1;
			s+=2;
			x++;
			System.out.println();
		}
		for (int i = 1; i < spc+1; i++) {
			System.out.print(" ");
		}
		for (int i = 1; i <= SIZE; i++) {
			System.out.print("\\");
		}
	}
}
