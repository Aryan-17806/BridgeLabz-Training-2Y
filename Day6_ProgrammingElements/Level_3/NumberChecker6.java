import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes: " + productOfCubes(factors));

        sc.close();
    }

    static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) f[idx++] = i;
        return f;
    }

    static int greatestFactor(int[] f) {
        return f[f.length - 1];
    }

    static int sumOfFactors(int[] f) {
        int sum = 0;
        for (int i : f) sum += i;
        return sum;
    }

    static long productOfFactors(int[] f) {
        long p = 1;
        for (int i : f) p *= i;
        return p;
    }

    static double productOfCubes(int[] f) {
        double prod = 1;
        for (int i : f) prod *= Math.pow(i, 3);
        return prod;
    }
}
