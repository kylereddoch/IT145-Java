import java.util.Scanner;

public class NumberDifference {
    public static void main (String [] args) {
        int totalDifference;
        int numDifference;

        Scanner scnr = new Scanner(System.in);
        numDifference = scnr.nextInt(); // Program will be tested with values: -14, -15, -16, -17.

        if (numDifference != -16) {
            totalDifference = -10;
        }
        else {
            totalDifference = numDifference;
        }

        System.out.println(totalDifference);
    }
}