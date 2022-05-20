import java.util.Scanner;

public class ConvertToGreek {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        char origLetter;

        origLetter = scnr.next().charAt(0);

        switch (origLetter) {
            case 'a':
            case 'A':
                System.out.println("Alpha");
                break;

            case 'b':
            case 'B':
                System.out.println("Beta");
                break;

            default:
                System.out.println("Unknown");
                break;
        }

    }
}