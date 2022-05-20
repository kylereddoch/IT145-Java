import java.util.Scanner;

public class AgeChecker {
    public static void main (String [] args) {
        int userAge;

        Scanner scnr = new Scanner(System.in);
        userAge = scnr.nextInt(); // Program will be tested with values: 19, 20, 21, 22.

        if (userAge > 20) {
            System.out.println("greater than 20");
        }
        else {
            System.out.println("20 or less");
        }
    }
}