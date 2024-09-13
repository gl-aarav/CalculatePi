/* Aarav Goyal
 * 9-11-2024
 * CalculatePi.java
 * This is approximates pi two different ways. It prints each result to 2, then
 * 6 decimal places. Each result is compared to 3.141592 and the difference is
 * printed.
 * Working on: Using printf and the Format class to format the decimals.
 * Declare and initalizing the variables (D&I). A final constant.
 * 
 * Pseudocode == the plan
 * 
 * class header
 * 		D&T a final constant for PI
 * 
 * main header
 * 		make an instance of the class
 * 		use the instance to call firstApprox
 * 		use the instance to call secondApprox
 * 
 * first Approx header
 * 		declare approx1 as a float
 * 		initilize approx1 to 0.0f
 *		D&I diff1, set to -100.0f
 * 		set diff1 to difference of approx1 and PI
 * 		print three blank lines, then the intro sent using PI
 * 		print approx1 to 2 places, then 6, then diff1 to 6 places
 * 
 * secondApprox header
 * 		D&I approx2 as a float, initilize approx2 to 0.0f
 * 		D&I diff2, set to -100.0f
 * 
 * 		set approx2 to (4+100)*8 + 62000 all divided by 20000
 * 		set diff2 to difference between approx2 and PI
 * 		print approx2 to 2 places, then 6, then diff2 to 6 places
 */
 
 public class CalculatePi
 {
	 final float PI=3.141592f;		//this is a final constant
	 public static void main (String[] Args)
	 {
		CalculatePi calcPi = new CalculatePi();
		calcPi.firstApprox();
		calcPi.secondApprox();
	}
	
	
	
	public void firstApprox(){
		//use psuedocode to complete this section
		float approx1;
		approx1 = 22/7f;
		float diff1 = -100.0f;
		diff1 = -approx1 + PI;
		System.out.println("\n\n\n");
		
		System.out.println("I am approximating pi (a bit more than 3.141592).\n");
		System.out.printf("The calculation 22/7 yields %.2f or more specifically %.6f shown to 6 places.\n", approx1, approx1);
		System.out.println("It is " + Format.left(diff1,9,6) + " different from 3.141592.");
		System.out.printf("It is %.6f different from 3.141592.\n\n\n",diff1);
		
		
	}	
	public void secondApprox(){
		float approx2 = 0.0f;
		approx2 = ((4+100)*8 + 62000)/20000f;
		float  diff2 = -100.0f;
		diff2 = approx2 - PI;
		diff2 = approx2 - PI;
		System.out.printf("The calculation (4+100)*8 + 62000 all divided by 20000 yields %.2f or more\nspecifically %.6f shown to 6 places.", approx2, approx2);
		System.out.print(" It is " + Format.left(diff2,9,6) + " different from 3.141592.\n");
		System.out.printf("It is %.6f different from 3.141592.\n\n\n\n",diff2);
		
		
	}	
 }
