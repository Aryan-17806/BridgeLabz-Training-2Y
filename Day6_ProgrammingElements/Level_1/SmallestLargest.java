import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        getSmallestLargest(a, b, c);
        input.close();
    }

    private static void getSmallestLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest  = Math.max(a, Math.max(b, c));

        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }
}
