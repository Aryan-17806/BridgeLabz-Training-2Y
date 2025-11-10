import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

public class order {
    public static void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random random = new Random();
        int result = random.nextInt(3);

        if (result == 0) {
            throw new OutOfStockException("Product is out of stock.");
        } else if (result == 1) {
            throw new PaymentFailedException("Payment failed. Please try again.");
        } else {
            System.out.println("Order placed successfully!");
        }
    }

    public static void main(String[] args) {
        try {
            placeOrder();
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
