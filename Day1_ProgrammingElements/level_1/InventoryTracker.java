import java.util.Scanner;

class Item {
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayItemDetails(int quantity) {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.printf("Price     : $%.2f\n", price);
        System.out.println("Quantity  : " + quantity);
        System.out.printf("Total Cost: RS%.2f\n", calculateTotalCost(quantity));
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        String itemCode = input.nextLine();

        System.out.print("Enter Item Name: ");
        String itemName = input.nextLine();

        System.out.print("Enter Price per Unit: ");
        double price = input.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        Item item = new Item(itemCode, itemName, price);
        item.displayItemDetails(quantity);

        input.close();
    }
}
