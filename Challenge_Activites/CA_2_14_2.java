// ===== Code from file PhonePlan.java =====
public class PhonePlan {
    private int freeMinutes;
    private int freeMessages;

    public PhonePlan() {
        freeMinutes  = 0;
        freeMessages = 0;
    }

    // FIXME: Create a second constructor with numMinutes and numMessages parameters.

    public PhonePlan(int numMinutes, int numMessages) {
        freeMinutes  = numMinutes;
        freeMessages = numMessages;
    }

    public void print() {
        System.out.println("Minutes: " + freeMinutes + ", Messages: " + freeMessages);
    }
}
// ===== end =====

// ===== Code from file CallPhonePlan.java =====
public class CallPhonePlan {
    public static void main(String [] args) {
        PhonePlan user1Plan = new PhonePlan(); // Calls default constructor
        PhonePlan user2Plan = new PhonePlan(1000, 5000); // Calls newly-created constructor

        System.out.print("User1: ");
        user1Plan.print();

        System.out.print("User2: ");
        user2Plan.print();
    }
}
// ===== end =====