import java.util.Scanner;

public class CombiningStrings {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        String secretID;
        String firstName;
        String lastName;

        firstName = scnr.next();
        lastName = scnr.next();

        secretID = firstName.concat(" " + lastName);

        System.out.println(secretID);
    }
}