import java.util.Scanner;

public class Relational {
    public static void main (String [] args) {
        int userLevel = 0;
        int userPoints = 0;

        Scanner input = new Scanner(System.in);
        userLevel = input.nextInt(); // Program will be tested with values: 15, 20, 24, 25, 26, 30

        if (userLevel >= 25) {
            userPoints = 10;
        }
        else {
            userPoints = 0;
        }

        System.out.println(userPoints);
    }
}