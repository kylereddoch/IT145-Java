import java.util.Scanner;

public class PopcornTimer {
    public static void printPopcornTime(int bagOunces) {


        if (bagOunces < 2) {
            System.out.println("Too small");
        }
        else if (bagOunces > 10) {
            System.out.println("Too large");
        }
        else {
            System.out.println((6 * bagOunces) + " seconds");
        }

    }

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userOunces;

        userOunces = scnr.nextInt();
        printPopcornTime(userOunces);
    }
}