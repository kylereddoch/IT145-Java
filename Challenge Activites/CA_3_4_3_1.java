import java.util.Scanner;

public class Relational {
    public static void main (String [] args) {
        int numCents = 0;

        Scanner input = new Scanner(System.in);
        numCents = input.nextInt(); // Program will be tested with values: 98, 99, 100, 101, 102.

        if (numCents >= 100) {
            System.out.println("Dollar or more");
        }
        else {
            System.out.println("Less than a dollar");
        }
    }
}