import java.util.Scanner;

public class NumberChecker {
    public static void main (String [] args) {
        int userNum;

        Scanner input = new Scanner(System.in);
        userNum = input.nextInt();    // Program will be tested with values: 1, 2, 3, 4.

        if (userNum <= 2) {
            System.out.println("Num is less or equal to two");
        }
        else {
            System.out.println("Num is greater than two");
        }

    }
}