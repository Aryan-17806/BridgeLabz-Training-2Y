import java.util.Scanner;

public class NumberChecker5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Perfect? " + isPerfect(n));
        System.out.println("Abundant? " + isAbundant(n));
        System.out.println("Deficient? " + isDeficient(n));
        System.out.println("Strong? " + isStrong(n));

        sc.close();
    }

    static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) sum += i;
        return sum;
    }

    static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n;
    }

    static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n;
    }

    static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n;
    }

    static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += fact(d);
            temp /= 10;
        }
        return sum == n;
    }

    static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
}
