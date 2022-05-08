import java.util.Scanner;

public class QuitScreen {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char letterToQuit;
        int  numPresses;

        letterToQuit = scnr.next().charAt(0);
        numPresses = scnr.nextInt();

        System.out.println("Press the " + letterToQuit + " key" + " " + numPresses + " times to quit.");

    }
}
