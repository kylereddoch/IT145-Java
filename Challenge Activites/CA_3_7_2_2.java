import java.util.Scanner;

public class UserNums {
    public static void main (String [] args) {
        int userNum1;
        int userNum2;

        Scanner input = new Scanner(System.in);
        userNum1 = input.nextInt();
        userNum2 = input.nextInt();

        if (userNum1 < 0) {
            System.out.println("userNum1 is negative.");
        }

        if (userNum2 > 10) {
            userNum2 = 2;
        }

        else {
            System.out.println("userNum2 is less than or equal to 10.");
        }

        System.out.println("userNum2 is " + userNum2);
    }
}