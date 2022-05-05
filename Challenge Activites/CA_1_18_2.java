import java.util.Scanner;

public class ComputingFinalResult {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int finalResult;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();

        finalResult = (num1 + num2) / 3;

        System.out.print("Final result: ");
        System.out.println(finalResult);
    }
}