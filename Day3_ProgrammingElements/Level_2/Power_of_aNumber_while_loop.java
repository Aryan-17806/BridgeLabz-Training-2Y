import java.util.Scanner;

public class Power_of_aNumber_while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int P = input.nextInt();
        int r = 1;
        int count = 0;

        if (n >= 0 && P >= 0) {
            while (count < P) {
                r *= n;
                count++;
            }
            System.out.println(n + "^" + P + " = " + r);
        } else {
            System.out.println("Invalid input.");
        }
        input.close();
    }
}
