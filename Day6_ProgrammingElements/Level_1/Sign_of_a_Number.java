import java.util.Scanner;

public class Sign_of_a_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        sign(n);
        input.close();
    }

    private static void sign(int n) {
        if (n < 0) {
            System.out.println("Sign = -1 (Negative)");
        } else if (n > 0) {
            System.out.println("Sign = 1 (Positive)");
        } else {
            System.out.println("Sign = 0 (Zero)");
        }
    }
}
