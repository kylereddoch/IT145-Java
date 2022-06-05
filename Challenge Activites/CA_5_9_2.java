// ===== Code from file BaseItem.java =====
public class BaseItem {
    protected String lastName;

    public void setLastName(String providedName) {
        lastName = providedName;
    }

    // FIXME: Define printItem() method

    public void printItem() {
        System.out.print("Last name: ");
        System.out.println(lastName);
    }

}
// ===== end =====

// ===== Code from file DerivedItem.java =====
public class DerivedItem extends BaseItem {
    private String firstName;

    public void setFirstName(String providedName) {
        firstName = providedName;
    }

    @Override
    public void printItem() {
        System.out.print("First and last name: ");
        System.out.println(firstName + " " + lastName);
    }
}
// ===== end =====

// ===== Code from file ItemInventory.java =====
import java.util.ArrayList;

public class ItemInventory {
    public static void main(String[] args) {
        BaseItem baseItemPtr;
        DerivedItem derivedItemPtr;
        ArrayList<BaseItem> itemList = new ArrayList<BaseItem>();
        int i;

        baseItemPtr = new BaseItem();
        baseItemPtr.setLastName("Smith");

        derivedItemPtr = new DerivedItem();
        derivedItemPtr.setLastName("Jones");
        derivedItemPtr.setFirstName("Bill");

        itemList.add(baseItemPtr);
        itemList.add(derivedItemPtr);

        for (i = 0; i < itemList.size(); ++i) {
            itemList.get(i).printItem();
        }
    }
}
// ===== end =====