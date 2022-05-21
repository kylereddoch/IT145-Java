import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userText;
        // Add more variables as needed
        int numPun = 0; //number of punctiation and spaces

        userText = scnr.nextLine();  // Gets entire line, including spaces.

        for (int i = 0; i < userText.length(); i++){
            char current = userText.charAt(i);
            if (current  != ' ' && current  != ',' && current  != '.' && current  != '!'){
                numPun++;
            }
        }

        System.out.println(numPun);

    }
}
