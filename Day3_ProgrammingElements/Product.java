public class Product {
    static double discount = 10.0; 
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    public void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            System.out.println("Product: " + productName + ", ID: " + productID +
                               ", Price: $" + price + ", Qty: " + quantity +
                               ", Discount: " + discount + "%");
        } else {
            System.out.println("Not a Product instance.");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200, 1, 501);
        Product p2 = new Product("Mouse", 25, 2, 502);
        p1.displayProductDetails(p1);
        p2.displayProductDetails(p2);
        Product.updateDiscount(15);
    }
}
