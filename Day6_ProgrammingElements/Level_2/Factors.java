import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int[] factors = getFactors(n);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Sum of factors = " + getSum(factors));
        System.out.println("Product of factors = " + getProduct(factors));
        System.out.println("Sum of squares of factors = " + getSumOfSquares(factors));

        input.close();
    }

    private static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] arr = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) arr[idx++] = i;
        }
        return arr;
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    private static int getProduct(int[] arr) {
        int prod = 1;
        for (int x : arr) prod *= x;
        return prod;
    }

    private static int getSumOfSquares(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += Math.pow(x, 2);
        return sum;
    }
}
