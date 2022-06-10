import java.util.Scanner;

public class TicketCounter {
    public static void main (String [] args) {
        int awardPoints;
        int userTickets;

        Scanner scnr = new Scanner(System.in);
        userTickets = scnr.nextInt(); // Program will be tested with values: 5, 6, 7, 8.

        if (userTickets == 6) {
            awardPoints = 1;
        }
        else {
            awardPoints = userTickets;
        }

        System.out.println(awardPoints);
    }
}