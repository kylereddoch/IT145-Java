import java.util.Scanner;

public class ForLoops {
    public static void main (String [] args) {
        int lastNumber;
        int i;

        Scanner input = new Scanner(System.in);
        lastNumber = input.nextInt();

        for (i = 1; i <= lastNumber; ++i ) {
            System.out.print(i + " ");
        }
    }
}