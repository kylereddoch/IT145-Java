import java.util.Scanner;

public class CourseGradePrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int [] courseGrades = new int[NUM_VALS];
      int i;

      for (i = 0; i < courseGrades.length; ++i) {
         courseGrades[i] = scnr.nextInt();
      }

      for (i = 0; i < NUM_VALS; i++) {
         System.out.print(courseGrades[i] + " ");
      }
      
      System.out.println("");

      for (i = NUM_VALS - 1; i >= 0; i--) {
         System.out.print(courseGrades[i] + " ");
      }

      System.out.println(""); 

   }
}