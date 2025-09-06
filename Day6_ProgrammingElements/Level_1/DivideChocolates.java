import java.util.Scanner;

public class DivideChocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int n = input.nextInt();
        System.out.print("Enter number of children: ");
        int child = input.nextInt();

        Chocolate(n, child);
        input.close();
    }

    private static void Chocolate(int n, int child) {
        int each = n / child;
        int remaining = n % child;

        System.out.println("Each child gets " + each + " chocolates");
        System.out.println("Remaining chocolates = " + remaining);
    }
}
