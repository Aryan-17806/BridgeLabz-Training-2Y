import java.util.Scanner;

public class FibonacciProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        if (n == 0) {
            System.out.println("0th Fibonacci = 0");
        } else if (n == 1) {
            System.out.println("1st Fibonacci = 1");
        } else {
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(n + "th Fibonacci = " + c);
        }

        input.close();
    }
}
