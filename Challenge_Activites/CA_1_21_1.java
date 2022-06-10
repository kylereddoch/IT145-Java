import java.util.Scanner;
public class GravityCalculation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double G = 6.673e-11;
        double M = 5.98e24;
        double accelGravity;
        double distCenter;

        distCenter = scnr.nextDouble();

        accelGravity = (G * M) / (distCenter * distCenter);

        System.out.println(accelGravity);
    }
}