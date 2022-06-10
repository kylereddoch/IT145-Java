import java.util.Scanner;

public class UnitTesting {
    // Method returns origNum cubed
    public static int cubeNum(int origNum) {
        return origNum * origNum * origNum;
    }

    public static void main (String [] args) {

        System.out.println("Testing started");
        System.out.println("2, expecting 8, got: " + cubeNum(2));

        System.out.println("3, expecting 27, got: " + cubeNum(3));
        System.out.println("-1, expecting -1, got: " + cubeNum(-1));

        System.out.println("Testing completed");
    }
}