import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter a number : ");

        for (int i = 0; i < 5; i++) {
            int n = input.nextInt();
            if (n % 2 != 0) {
                count++;
            }
        }
        input.close();

        System.out.println(count);
    }
}
