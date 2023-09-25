/*
 * Title: Fermat's Last Theorem - Near Miss
 * Java File Name contains the code: SmallestMiss
 * 
 * Programmers Names: 
 * 1. Bharath Srinivasan(BharathSrinivasan@lewisu.edu)
 * 2. K A R Aditya Varma Penumatcha(KARAdityaVarmaPenu@lewisu.edu)
 * 
 * Course: FA23-CPSC-60500-001
 * 
 * September 24, 2023
 * 
 * Explanation:
 * 	1. User input for the K value, if user will give input less than 10 then it will ask user to give the input again for k.
 *  2. User input for the n value, if user will give input less than 3 and greater than 11, it will ask user to give input again for n.
 *  3. Applied nested for loop to compute all the combinations of x and y.
 *     3.1 x^n + y^n is calculated
 *     3.2 Value for z is computed
 *     3.3 Near miss calculated with respect to z and z+1, ((x^n + y^n)-z^n) ((z+1)^n-(x^n + y^n)), which ever will be less that will count as near miss
 *     3.4 Next Relative miss is calculated
 *     3.5 Next Smallest Miss is found out. in every iteration whenever Relative Miss will be less it will be called Smallest Miss
 *  
 * 
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class SmallestMiss {
	
	//Main Function to compute the results

	public static void main(String[] args) 
	{ 
		long x=0;
	    long y = 0;
	    long z = 0;
	    int k = 0;
	    int n = 0;
	    
	    Scanner userinput = new Scanner(System.in);
	    //do while loop for the inputs, if inputs will not be in the correct range userinput will be prompted again for K.
	    do {
	    	System.out.println("Enter Upper limit for K (K>=10) :: ");
		    k = userinput.nextInt();
	    }while(k<10);
	    
	  //do while loop for the inputs, if inputs will not be in the correct range userinput will be prompted again for n.
	    do {
	    	System.out.println("Enter value for n  it must be greater than 2 and less than 12 :: ");
		    n = userinput.nextInt();
	    }while(n<3 || n>11);
	    
	    
	    
	    double smallestmiss = 99999999.99; 
	    
	    //nested for loop will execute all the possible combinations of x and y
	    for (x = 10; x<=k; x++) 
	    {
	    	for (y = 10; y<=k; y++)
	    	{	
	        	System.out.print("Value of x = " + x + "\n");
	        	System.out.print("Value of y = " + y + "\n");
	        	System.out.print("Value of n = " + n + "\n");
	        	
	        //x^n + y^n
	        long xnplusyn = (long)((Math.pow (x, n))+(Math.pow (y, n)));
	        System.out.println("x^"+n+" + y^"+n+" = "+xnplusyn);
	        
	        //To make the equation in the form of fermat's equation as mentioned in instructions we are taking nth root
	        z = (int) Math.pow (xnplusyn, 1.0/n);
	        System.out.println("The value of z = "+z);
	        
	        //if we subtract z power n from sum of x power of n and y of power of n we get the near miss value
	        long nearmissz = (long)(xnplusyn - Math.pow (z, n));
	        System.out.println("Near miss with z^n = "+nearmissz);
	        
	        long nearmisszplusone = (long)(Math.pow (z+1, n) - xnplusyn);
	        
	        System.out.println("Near miss with (z+1)^n = "+nearmisszplusone);
	        
	        long nearmiss = 0;
	        //this if else statement find out the near miss which will be smallest, it can be near miss with respect to z^n or (z+1)^n
	        if(nearmissz<nearmisszplusone)
	        {
	        	nearmiss = nearmissz;
	        }
	        else
	        {
	        	nearmiss = nearmisszplusone;
	        }
	        
	        //By following the instructions how can we find the relative miss, applying same thing here to find out the relative miss
	        double relativemiss = 100. * nearmiss / xnplusyn;
	        System.out.println("\nNear Miss = "+nearmiss+" \nRelative Miss = "+relativemiss);
	        
	        
	        //to find out the smallest possible miss, comparing relative miss with smallest miss
	        if(relativemiss<smallestmiss)
	        {
	        	smallestmiss=relativemiss;
	        }
	        System.out.println("Smallest Miss = "+smallestmiss);
	        System.out.println("\n ===================================================\n");
	           
	        }
	    }
	}
}


