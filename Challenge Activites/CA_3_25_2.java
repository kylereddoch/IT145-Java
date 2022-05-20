import java.util.Scanner;
public class NestedLoops {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int numRows;
        int numColumns;
        int currentRow;
        int currentColumn;
        char currentColumnLetter;

        numRows = scnr.nextInt();
        numColumns = scnr.nextInt();

        for(currentRow = 1; currentRow <= numRows; currentRow++){
            // Set the starting column letter
            currentColumnLetter = 'A';


            for(currentColumn = 0; currentColumn < numColumns; currentColumn++){
                System.out.print(currentRow);
                System.out.print(currentColumnLetter + " ");


                currentColumnLetter++;
            }
        }

        System.out.println("");
    }
}