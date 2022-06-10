import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput = "";
      boolean inputDone = false; 

      while (!inputDone) {
         System.out.print("Enter input string: \n");
         userInput = scnr.nextLine();

         if (userInput.equals("q")){
            inputDone = true;
            break;
         }

         if(userInput.indexOf(",") == -1){ //if comma is not found in the user input
         System.out.println("Error: No comma in string");
         continue;
         }


          else {
            String[] userArray = userInput.split(",");
            System.out.println("First word: " + userArray[0].trim());
            System.out.println("Second word: " + userArray[1].trim());
            System.out.println();
            System.out.println();
        }
      }


      return;
   }
}