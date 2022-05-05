import java.util.Scanner;

public class ComputingTotalCost {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numDrinks;
        int numTacos;
        int totalCost;

        numDrinks = scnr.nextInt();
        numTacos  = scnr.nextInt();

        totalCost = (2 * numDrinks) + (3 * numTacos);

        System.out.print("Total cost: ");
        System.out.println(totalCost);
    }
}