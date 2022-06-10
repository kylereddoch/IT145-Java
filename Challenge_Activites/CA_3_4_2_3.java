import java.util.Scanner;

public class AgeChecker {
    public static void main (String [] args) {
        int userAge;

        Scanner scnr = new Scanner(System.in);
        userAge = scnr.nextInt(); // Program will be tested with values: 18, 19, 20, 21.

        if (userAge >= 20) {
            System.out.println("I am an adult");
        }
        else {
            System.out.println("I am a teenager");
        }
    }
}