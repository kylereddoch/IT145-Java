import java.util.Scanner;

public class CalcMiles {

    public static double mphAndMinutesToMiles(double milesPerHour, double minutesTraveled) {
        double hoursTraveled = minutesTraveled / 60;
        double milesTraveled = hoursTraveled * milesPerHour;
        return milesTraveled;
    }

    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        double milesPerHour;
        double minutesTraveled;

        milesPerHour = scnr.nextDouble();
        minutesTraveled = scnr.nextDouble();

        System.out.println("Miles: " + mphAndMinutesToMiles(milesPerHour, minutesTraveled));
    }
}