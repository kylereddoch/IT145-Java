import java.util.Scanner;

public class OutsideTemperatureFormatting {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      double outsideTemperature;

      outsideTemperature = scnr.nextDouble();

      System.out.printf("%.2f\n", outsideTemperature);

   }
}