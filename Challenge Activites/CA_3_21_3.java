import java.util.Scanner;

public class InsectGrowth {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int numInsects;

        numInsects = scnr.nextInt(); // Must be >= 1

        while (numInsects < 200) {
            System.out.print(numInsects + " ");
            numInsects = numInsects * 2;
        }

        System.out.println("");

    }
}