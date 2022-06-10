import java.util.Scanner;

public class TeenagerDetector {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        boolean isTeenager;
        int kidAge;

        kidAge = scnr.nextInt();

        if ((kidAge > 12) && (kidAge < 20)) {
            isTeenager = true;
        }

        else {
            isTeenager = false;
        }

        if (isTeenager) {
            System.out.println("Teen");
        }
        else {
            System.out.println("Not teen");
        }
    }
}