import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int[] arr = getDigits(num);

        System.out.println("Count of digits = " + arr.length);
        System.out.print("Digits: ");
        for (int d : arr) System.out.print(d + " ");
        System.out.println();

        System.out.println("Duck number? " + isDuck(arr));
        System.out.println("Armstrong number? " + isArmstrong(num, arr));

        int[] max2 = findLargestTwo(arr);
        System.out.println("Largest = " + max2[0] + ", Second Largest = " + max2[1]);

        int[] min2 = findSmallestTwo(arr);
        System.out.println("Smallest = " + min2[0] + ", Second Smallest = " + min2[1]);

        input.close();
    }

    private static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    private static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    private static boolean isArmstrong(int num, int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == num;
    }

    private static int[] findLargestTwo(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : arr) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    private static int[] findSmallestTwo(int[] arr) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : arr) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }
}
