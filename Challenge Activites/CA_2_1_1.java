import java.util.Scanner;
public class HourToMinConv {
    public static double getMinutesAsHours(double origMinutes) {

        double hours = origMinutes / 60;
        return hours;

    }

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        double minutes;

        minutes = scnr.nextDouble();

        // Will be run with 210.0, 3600.0, and 0.0.
        System.out.println(getMinutesAsHours(minutes));
    }
}
