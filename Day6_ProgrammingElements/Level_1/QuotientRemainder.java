import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = input.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        getRemainder(dividend, divisor);
        input.close();
    }

    private static void getRemainder(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
