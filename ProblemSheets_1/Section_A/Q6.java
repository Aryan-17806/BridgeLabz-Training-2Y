import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        input.close();

        if (M != 0 && N % M == 0) {
            System.out.println(N + " is an exact multiple of " + M);
        } else {
            System.out.println(N + " is NOT an exact multiple of " + M);
        }
    }
}
