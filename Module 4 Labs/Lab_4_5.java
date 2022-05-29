import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        final int NUM_ELEMENTS = 5;            
        double [] userVals = new double[NUM_ELEMENTS]; 
        int i;                                         // Declaring variable i to use in for loop
        double sumVal;                                // Declaring sum variable to be used when calculating sum
        double maxVal;                                // Declaring maxVal variable to calculate max weight
  
        for (i = 0; i < userVals.length; ++i) {     // for loop that prompts and grabs user input to be used in array
            userVals[i] = scnr.nextDouble();
            System.out.println("Enter weight " + (i + 1) + ": ");
        }
     
        System.out.println();                       // Creating new lines to match output of the template in zybooks
        System.out.print("You entered: ");
  
        for (i = 0; i < userVals.length; ++i) {    // for loop that prints the users input
           System.out.print(userVals[i] + " ");
        }
                                            // for loop that calculates sum of users input "Total weight"
        sumVal = 0.0;
        for (i = 0; i < userVals.length; ++i) {
           sumVal = sumVal + userVals[i];
        }
  
        System.out.println();                    // Prints the total weight to match zybooks template
        System.out.print("Total weight: " + sumVal);
  
        System.out.println();                   // Calculates and Prints Average weight to match zybooks template
        System.out.print("Average weight: " + (sumVal / NUM_ELEMENTS));
  
        System.out.println();                  // Print statement for whitespace to match zybooks template
  
        maxVal = userVals[0];                 // Determine max weight, userVal[0] is the max so far
        for (i = 0; i < userVals.length; ++i) { // for loop and if statement to calculate max weight
           if (userVals[i] > maxVal) {
              maxVal = userVals[i];
           }
        }
  
        System.out.print("Max weight: " + maxVal);     // Prints max weight to match output of zybooks template
        System.out.println();                          // Print statement to match whitespace of zybooks template
      
      return;
   }
}
