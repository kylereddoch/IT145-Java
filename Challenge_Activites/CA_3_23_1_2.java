import java.util.Scanner;

public class ForLoops {
    public static void main (String [] args) {
        int firstNumber;
        int i;

        Scanner input = new Scanner(System.in);
        firstNumber = input.nextInt();

        for (i = firstNumber; i > 0; --i) {
            System.out.println(i);
        }
    }
}