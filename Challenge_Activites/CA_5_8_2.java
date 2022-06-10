// ===== Code from file InventoryTag.java =====
public class InventoryTag {
    private int quantityRemaining;

    public InventoryTag() {
        quantityRemaining = 0;
    }

    public int getQuantityRemaining() {
        return quantityRemaining;
    }

    public void addInventory(int numItems) {
        if (numItems > 10) {
            quantityRemaining = quantityRemaining + numItems;
        }
    }
}
// ===== end =====

// ===== Code from file CallInventoryTag.java =====
import java.util.Scanner;

public class CallInventoryTag {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        InventoryTag redSweater = new InventoryTag();
        int sweaterShipment;
        int sweaterInventoryBefore;

        sweaterInventoryBefore = redSweater.getQuantityRemaining();
        sweaterShipment = scnr.nextInt();

        System.out.println("Beginning tests.");

        // FIXME add unit test for addInventory

        redSweater.addInventory(sweaterShipment);
        if (redSweater.getQuantityRemaining() != sweaterShipment) {
            System.out.println("   UNIT TEST FAILED: addInventory()");
        }

        System.out.println("Tests complete.");
    }
}
// ===== end =====