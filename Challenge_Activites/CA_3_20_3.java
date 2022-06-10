import java.util.Scanner;

public class DivideByTwoLoop {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;

        userNum = scnr.nextInt();

        while (userNum >= 2) {
            userNum = userNum / 2;
            System.out.print(userNum + " ");
        }

        System.out.println("");
    }
}