import java.util.Scanner;

public class CalcPyramidVolume {

    public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight) {

        double baseArea = baseLength * baseWidth;
        double pyramidVolume = (baseArea * pyramidHeight) / 3.0;
        return pyramidVolume;
    }

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        double userLength;
        double userWidth;
        double userHeight;

        userLength = scnr.nextDouble();
        userWidth = scnr.nextDouble();
        userHeight = scnr.nextDouble();

        System.out.println("Volume: " + pyramidVolume(userLength, userWidth, userHeight));
    }
}