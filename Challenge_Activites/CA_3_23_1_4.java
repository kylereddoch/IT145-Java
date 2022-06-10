import java.util.Scanner;

public class ForLoops {
    public static void main (String [] args) {
        int userNum;
        int i;

        Scanner input = new Scanner(System.in);
        userNum = input.nextInt();

        for (i = userNum; i <= 0; ++i) {
            System.out.print(i + " ");
        }
    }
}