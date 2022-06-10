// ===== Code from file CablePlan.java =====
public class CablePlan {
    private int numDays;

    // FIXME: Define setNumDays() method, using "this" implicit parameter.
    public void setNumDays(int numDays) {

        this.numDays = numDays;

    }

    public int getNumDays() {
        return numDays;
    }
}
// ===== end =====

// ===== Code from file CallCablePlan.java =====
import java.util.Scanner;

public class CallCablePlan {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        CablePlan house1Plan = new CablePlan();
        int userNum;

        userNum = scnr.nextInt();
        house1Plan.setNumDays(userNum);
        System.out.println(house1Plan.getNumDays());
    }
}
// ===== end =====
