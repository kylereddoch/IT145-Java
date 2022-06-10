/*
 * Author: Kyle Reddoch
 * Professor: Ahlam Alhweiti
 * Class: IT-145 (Southern New Hampshire University)
 * Date: 06/10/2022 
 */

package Paint1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // While loop to continue to ask for input until user input greater than 0
        while (wallHeight == 0.0) {
	        try {
		        // Implement a do-while loop to ensure input is valid
		        // Prompt user to input wall's height
		        System.out.println("Enter wall height (feet): ");
		        wallHeight = scnr.nextDouble();
		        
		        // if/else to make sure the input is greater than 0
		        if (wallHeight <= 0) {
		        	System.out.println("Input must be greater than 0, pleast try again.");
		        }
		        else {
		        	continue;
		        }
	        }
	        
	        //catch for input mis match handling. prompts user again if input no integer
		    catch (InputMismatchException ime) {
	        	System.out.println("Invalid input! Input must be a numerical value, please try again.");
	        	scnr.nextLine();
		    }
        }
        
        // While loop to continue to ask for input until user input greater than 0
	    while (wallWidth == 0.0) {    
	        try {
		        // Implement a do-while loop to ensure input is valid
		        // Prompt user to input wall's width
		    	System.out.println("Enter wall width (feet): ");
		    	wallWidth = scnr.nextDouble();
		    	
		    	// if/else to make sure the input is greater than 0
		        if (wallWidth <= 0) {
		        	System.out.println("Input must be greater than 0, pleast try again.");
		        }
		        else {
		        	continue;
		        }
	        }
	        
	      //catch for input mis match handling. prompts user again if input no integer
		    catch (InputMismatchException ime) {
	        	System.out.println("Invalid input! Input must be a numerical value, please try again.");
	        	scnr.nextLine();
		    }
	    }
	    
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        
        return;
    }
}