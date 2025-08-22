import java.util.Scanner;

public class Sum_of_n_natural_numbers_for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n >= 0) {
            int formulaSum = n * (n + 1) / 2;

            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            System.out.println("Formula sum = " + formulaSum);
            System.out.println("For loop sum = " + loopSum);
        } else {
            System.out.println("Not a natural number.");
        }

        input.close();
    }
}
