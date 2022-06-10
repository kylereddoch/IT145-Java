import java.util.Scanner;

public class ShampooMethod {

    public static void printShampooInstructions(int numCycles) {
        if (numCycles < 1) {
            System.out.println("Too few.");
        }
        else if (numCycles > 4) {
            System.out.println("Too many.");
        }
        else {
            for(int i = 1; i <= numCycles; i++){
                System.out.println(i + ": Lather and rinse.");
            }
            System.out.println("Done.");
        }

    }

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userCycles;

        userCycles = scnr.nextInt();
        printShampooInstructions(userCycles);
    }
}