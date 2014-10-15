package CreatingJavaProgramsCH2.CH2_Projects;

public class CH2_P_5 {
	/*
	 *  Documentation Date: 10/10/2014 
	 *  10/10/2014: fixed printTop so triangle fits on the band evenly
	 */
	 public static void printTop(){
		 final int SIZE = 5;
		
		 for (int j = SIZE - 1; j >=0; j--) {
			 for (int i = 1; i <= (j+1); i++) { //L space generator
				 System.out.print(" ");
			 }
			 for (int i = 1; i <= SIZE - j; i++){ // L slash generator
				 System.out.print("/");
			 }
			 for (int i = 1; i <=2; i++) { //star generator
				 System.out.print("*");
			 }
			 for (int i = 1; i <= SIZE - j; i++) { //R slash generator
				 System.out.print("\\");
			 }
			 System.out.println(); 
		 }	
		
	 }
	 public static void makeBand(){
		final int SIZE = 6;
		 
		 System.out.print("+");
		 
		 for (int i = 1; i <= SIZE ; i++) {
			System.out.print("=*");
		 }
		 
		 System.out.print("+");
		 System.out.println();
	 }
	 
	 
	 public static void makeBody() {
		 
		 makeBand();
		 topDiamond();
    	 bottomDiamond();
    	 makeBand();
    	 bottomDiamond();
    	 topDiamond();
		 makeBand(); 
		  
	 }
	 
	 public static void topDiamond(){
			
			final int ITER_NUM = 2;
			int cnt = ITER_NUM - 1;
				
				for (int i = ITER_NUM; i >=0; i--, cnt++) { //overall itration
					System.out.print("|");
					for (int j = 1; j <= i; j++) { //dot generator
						System.out.print(".");
					}
					for (int j = 1; j <=cnt; j++) {
						System.out.print("/\\");
					}
					for (int j = 1; j <= i; j++) { //dot generator
						System.out.print(".");
					}
					for (int j = 1; j <= i; j++) { //dot generator
						System.out.print(".");
					}
					for (int j = 1; j <=cnt; j++) {
						System.out.print("/\\");
					}
					for (int j = 1; j <= i; j++) { //dot generator
						System.out.print(".");
					}
					System.out.print("|");
					System.out.println();
				}
				cnt = 1;
				
		}
	 public static void bottomDiamond() {
		   final int SIZE = 3;	
		   int cnt = 0;
			
			 
			for (int j = SIZE; j > 0; j--) {	
				System.out.print("|");
			 	
				 for (int i = 0; i < cnt; i++) {
					 System.out.print(".");	 
				 }
				 
				 for (int i = 1; i <=j; i++) {
					System.out.print("\\/");
				 }
				 for (int i = 0; i <cnt; i++) {
					 System.out.print(".");
				 }
				 
				 for (int i = 0; i < cnt; i++) {
					 System.out.print(".");	 
				 }
				 
				 for (int i = 1; i <=j; i++) {
					System.out.print("\\/");
				 }
				 for (int i = 0; i <cnt; i++) {
					 System.out.print(".");
				 }
				 cnt++;
				System.out.print("|");
				System.out.println();
			 }
		}

     public static void main(String args[]) {
    	 printTop();
    	 makeBody();
    	 
    	 printTop();
     }
}
