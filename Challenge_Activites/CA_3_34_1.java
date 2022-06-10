import java.util.Scanner;

public class CountToLimit {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int countLimit;
        int printVal;

        // Get user input
        countLimit = scnr.nextInt();

        printVal = 0;
        do {
            System.out.print(printVal + " ");
            printVal = printVal + 1;
        } while (printVal <= countLimit);
        System.out.println("");
    }
}