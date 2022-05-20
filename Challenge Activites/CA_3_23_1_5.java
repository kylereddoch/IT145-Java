import java.util.Scanner;

public class ForLoops {
    public static void main (String [] args) {
        int startNumber;
        int endNumber;
        int i;

        Scanner input = new Scanner(System.in);
        startNumber = input.nextInt();
        endNumber = input.nextInt();

        for (i = startNumber; i <= endNumber; ++i) {
            System.out.print(i + " ");
        }
    }
}