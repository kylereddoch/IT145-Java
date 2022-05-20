import java.util.Scanner;

public class Relational {
    public static void main (String [] args) {
        int userTest = 0;

        Scanner input = new Scanner(System.in);
        userTest = input.nextInt(); // Program will be tested with values: -9, -10, -11, -12.

        if (userTest >= -10) {
            System.out.println("greater than or equal to -10");
        }
        else {
            System.out.println("less than -10");
        }
    }
}