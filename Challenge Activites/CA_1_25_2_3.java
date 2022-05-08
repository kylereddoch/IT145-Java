import java.util.Scanner;

public class MathFunctions {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        double x;
        double y;
        double z;

        x = scnr.nextDouble();
        y = scnr.nextDouble();

        z = Math.sqrt(Math.pow(y, 3.0) / Math.abs(x));

        System.out.printf("%.1f\n", z); // This will output z with 1 decimal place.
    }
}
