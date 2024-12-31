import java.util.Scanner;
import java.util.ArrayList;

class Item {
    String itemName;
    int quantity;
    double price;

    // Constructor
    public Item(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to calculate total price for the item
    public double getTotalPrice() {
        return quantity * price;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println(itemName + " (Qty: " + quantity + ") - " + "Price: " + price + " Total: " + getTotalPrice());
    }
}

public class OnlineBillingSystem {
    static ArrayList<Item> itemsList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Method to add an item
    public static void addItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price per unit: ");
        double price = scanner.nextDouble();

        // Creating Item object and adding it to the list
        itemsList.add(new Item(name, quantity, price));
        scanner.nextLine();  // Clear the buffer
        System.out.println("Item added successfully.\n");
    }

    // Method to display the bill
    public static void generateBill() {
        System.out.println("\n--- BILL ---");
        double totalAmount = 0.0;

        // Display all the items and calculate total
        for (Item item : itemsList) {
            item.displayItem();
            totalAmount += item.getTotalPrice();
        }

        System.out.println("\nTotal Amount: " + totalAmount);
        System.out.println("Thank you for shopping!");
    }

    // Main menu for user interaction
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nOnline Billing System");
            System.out.println("1. Add Item");
            System.out.println("2. Generate Bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    generateBill();
                    return; // Exit the program after bill generation
                case 3:
                    System.out.println("Exiting...");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
