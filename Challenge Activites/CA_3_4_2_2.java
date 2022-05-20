import java.util.Scanner;

public class NumberChecker {
    public static void main (String [] args) {
        int userNum;

        Scanner scnr = new Scanner(System.in);
        userNum = scnr.nextInt(); // Program will be tested with values: -13, -14, -15, -16.

        if (userNum > -15) {
            System.out.println("greater than -15");
        }
        else {
            System.out.println("-15 or less");
        }
    }
}