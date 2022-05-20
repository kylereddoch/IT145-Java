import java.lang.Math;
import java.util.Scanner;
public class SensorThreshold {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double targetValue;
        double sensorReading;

        targetValue = scnr.nextDouble();
        sensorReading = scnr.nextDouble();

        if (Math.abs(sensorReading - targetValue) < 0.0001) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}