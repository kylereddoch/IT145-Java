import java.util.Scanner;

public class GrocerySorter {
    public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER};

    public static void main (String [] args) {
        GroceryItem userItem;

        userItem = GroceryItem.GR_APPLES;

        if ((userItem == GroceryItem.GR_APPLES) || (userItem == GroceryItem.GR_BANANAS)) {
            System.out.println("Fruit");
        }
        else {
            System.out.println("Drink");
        }

    }
}