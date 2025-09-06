import java.util.Scanner;

public class ArrayCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = input.nextInt();

            if (isPositive(arr[i])) {
                System.out.println(arr[i] + " is Positive and " + (isEven(arr[i]) ? "Even" : "Odd"));
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        int cmp = compare(arr[0], arr[arr.length - 1]);
        if (cmp == 0) System.out.println("First and last are equal");
        else if (cmp > 0) System.out.println("First > Last");
        else System.out.println("First < Last");

        input.close();
    }

    private static boolean isPositive(int n) { return n >= 0; }
   
    private static boolean isEven(int n) { return n % 2 == 0; }
   
    private static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }
}
