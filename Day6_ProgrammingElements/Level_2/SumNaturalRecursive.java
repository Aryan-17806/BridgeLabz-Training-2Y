import java.util.Scanner;

public class SumNaturalRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
        } else {
            int sumRec = recursiveSum(n);
            int sumFormula = formulaSum(n);

            System.out.println("Recursive sum = " + sumRec);
            System.out.println("Formula sum   = " + sumFormula);
            System.out.println("Both results are equal? " + (sumRec == sumFormula));
        }
        input.close();
    }

    private static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    private static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
}
