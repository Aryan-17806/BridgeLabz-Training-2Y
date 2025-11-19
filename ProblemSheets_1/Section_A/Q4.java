import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int secondLast = (n / 10) % 10;
        System.out.println(secondLast);
        input.close();
    }
}