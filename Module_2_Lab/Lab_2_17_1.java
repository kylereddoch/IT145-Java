import java.util.Scanner;

public class LabProgram {

    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double drivenMiles) {
        double totalCost = (drivenMiles / milesPerGallon) * dollarsPerGallon;
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double milesPerGallon;
        double dollarsPerGallon;

        milesPerGallon = scnr.nextDouble();
        dollarsPerGallon = scnr.nextDouble();

        System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 10));
        System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 50));
        System.out.printf("%.2f\n", drivingCost(milesPerGallon, dollarsPerGallon, 400));
    }
}
