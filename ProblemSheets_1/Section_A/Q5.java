import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = (a % 10) + (b % 10);
        System.out.println(sum);
        input.close();

    }
}
