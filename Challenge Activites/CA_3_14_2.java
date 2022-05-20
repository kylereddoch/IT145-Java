import java.util.Scanner;

public class CharMatching {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        char firstLetter;

        userInput = scnr.nextLine();
        firstLetter = scnr.nextLine().charAt(0);

        if (userInput.charAt(0) == firstLetter) {
            System.out.println("Found match: " + firstLetter);
        }
        else {
            System.out.println("No match: " + firstLetter);
        }

        return;
    }
}