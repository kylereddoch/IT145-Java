// DO NOT COPY THIS INTO LAB
package OnlineShoppingCart;

import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        String productName;
        int productPrice = 0;
        int productQuantity = 0;
        int cartTotal = 0;

        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // Get item 1 details from user, create itemToPurchase object
        System.out.println("Item 1");
        System.out.println("Enter the item name: ");
        productName = scnr.nextLine();

        System.out.println("Enter the item price: ");
        productPrice = scnr.nextInt();

        System.out.println("Enter the item quantity: ");
        productQuantity = scnr.nextInt();
        System.out.println("");

        item1.setName(productName);
        item1.setPrice(productPrice);
        item1.setQuantity(productQuantity);


        // Get item 2 details from user, create itemToPurchase object
        System.out.println("Item 2");
        System.out.println("Enter the item name: ");
        scnr.nextLine();
        productName = scnr.nextLine();

        System.out.println("Enter the item price: ");
        productPrice = scnr.nextInt();

        System.out.println("Enter the item quantity: ");
        productQuantity = scnr.nextInt();
        System.out.println("");


        item2.setName(productName);
        item2.setPrice(productPrice);
        item2.setQuantity(productQuantity);


        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = " + "$" + (item1.getQuantity() * item1.getPrice()));
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = " + "$" + (item2.getQuantity() * item2.getPrice()));
        System.out.println("");

        cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());

        System.out.println("Total: $" + cartTotal);

        // Add costs of two items and print total

        // cartTotal = item one price + item two price
        // Totoal Cost
        // item one information
        // item two information
        // Total output

        return;
    }
}