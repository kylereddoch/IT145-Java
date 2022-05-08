import java.util.Scanner;

public class CoordinateGeometry {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        double pointsDistance;
        double xDist;
        double yDist;

        pointsDistance = 0.0;
        xDist = 0.0;
        yDist = 0.0;

        x1 = scnr.nextDouble();
        y1 = scnr.nextDouble();
        x2 = scnr.nextDouble();
        y2 = scnr.nextDouble();

        pointsDistance = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));

        System.out.println(pointsDistance);
    }
}