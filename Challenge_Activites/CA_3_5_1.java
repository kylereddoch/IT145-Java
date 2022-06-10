import java.util.Scanner;

public class AgeChecker {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userAge;

        userAge = scnr.nextInt();

        if((userAge >= 18) && (userAge <= 25)){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Ineligible");
        }
    }
}