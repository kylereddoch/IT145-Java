import java.util.Scanner;
import java.util.Random;

public class RandomGenerateNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int seedVal;

        seedVal = scnr.nextInt();
        randGen.setSeed(seedVal);

        System.out.println(randGen.nextInt(50) + 100);
        System.out.println(randGen.nextInt(50) + 100);

    }
}