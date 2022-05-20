import java.util.Scanner;

public class SafetyFeatures {
    public static void main (String [] args) {
        int carYear;

        Scanner input = new Scanner(System.in);
        carYear = input.nextInt();

        if (carYear < 1967) {
            System.out.println("Probably has few safety features.");
        }

        if (carYear > 1971) {
            System.out.println("Probably has seat belts.");
        }

        if (carYear > 1992) {
            System.out.println("Probably has electronic stability control.");
        }

        if (carYear > 2002) {
            System.out.println("Probably has tire-pressure monitor.");
        }

    }
}