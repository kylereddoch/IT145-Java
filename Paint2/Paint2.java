package Paint2;

import java.util.Scanner;
import java.lang.Math;

/**
 * Program calculates the amount of paint needed, in gallons, to paint a wall. It also calculates the amount of cans needed by the user to paint the wall.
 * @author Kyle Reddoch
 * @version 1.0
 * @since 06/15/2022
 * Professor: Ahlam Alhweiti
 * Class: IT-145 (Southern New Hampshire University)
 */

public class Paint2 {

    /**
     * Asks user for wall height and width and calculates the area of the wall.
     * @param args Command line arguments
     * 
     */
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0; // initializes wall height
        double wallWidth = 0.0; // initializes wall width
        double wallArea = 0.0; // initializes wall area
        double gallonsPaintNeeded = 0.0; // initalizes gallons needed to paint wall
        double cansNeeded; // resulting number of cans needed to paint wall

        final double squareFeetPerGallons = 350.0; // number of square feet per gallon of paint
        final double gallonsPerCan = 1.0; // number of gallons per can of paint

        // Prompt user to input wall's height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();


        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:  " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall, rounded up to nearest integer
        // Complete this code block

        /**
         * Chosen method to calculate the number of paint cans needed to paint the wall:
         * Math.ceil() - Returns the smallest (closest to negative infinity) double value that is greater than or equal to
         * the argument and is equal to a mathematical integer.
         * @see "https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#method.summary"
         */

        cansNeeded = Math.ceil(gallonsPaintNeeded / gallonsPerCan);
        // I added this little touch to make the output look better. That way we don't need to have "(s)" after can even for just 1 can. :)
        if (cansNeeded == 1) {
            System.out.println("Cans needed: " + cansNeeded + " can");
        } else {
            System.out.println("Cans needed: " + cansNeeded + " cans");
        }
    }
}