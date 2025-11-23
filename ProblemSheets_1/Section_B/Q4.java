import java.util.Scanner;

public class Q4 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int count = 0, num = 1;
        while (count < n) {
            num++;
            if (isPrime(num))
                count++;
        }

        System.out.println(n + "th Prime number = " + num);

        input.close();
    }

    public static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
