import java.util.Scanner;

public class RedBalloon {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        boolean isRed;
        boolean isBalloon;

        isRed = scnr.nextBoolean();
        isBalloon = scnr.nextBoolean();

        if ((isBalloon == true) && (isRed == false)) {
            System.out.println("Balloon");
        }
        else if ((isBalloon == true) && (isRed == true)) {
            System.out.println("Red balloon");
        }
        else {
            System.out.println("Not a balloon");
        }

    }
}