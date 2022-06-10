import java.util.Scanner;
public class OutputCombinations {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char a;
        char b;
        char c;

        a = scnr.next().charAt(0);
        b = scnr.next().charAt(0);
        c = scnr.next().charAt(0);

        System.out.print("" + a + b + c + " " + a + c + b + " " +  b + a + c + " " + b + c + a + " " + c + a + b + " " + c + b + a);

        System.out.println("");
    }
}
