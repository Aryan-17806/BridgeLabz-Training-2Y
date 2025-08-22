import java.util.Scanner;

public class Power_of_aNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int P = input.nextInt();
        int result = 1;

        if (n >= 0 && P >= 0) {
            for (int i = 1; i <= P; i++) {
                result *= n;
            }
            System.out.println(n + "^" + P + " = " + result);
        } else {
            System.out.println("Invalid input.");
        }
        input.close();
    }
}
