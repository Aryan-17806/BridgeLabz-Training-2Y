import java.util.Scanner;

public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int[] dig = getDigits(n);
        int[] rev = reverseArray(dig);

        System.out.println("Palindrome? " + isPalindrome(dig));
        System.out.println("Duck number? " + isDuck(dig));
        System.out.println("Digits equal after reverse? " + arraysEqual(dig, rev));

        input.close();
    }

    private static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    private static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    private static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    private static boolean isPalindrome(int[] digits) {
        int n = digits.length;
        for (int i = 0; i < n / 2; i++) {
            if (digits[i] != digits[n - 1 - i]) return false;
        }
        return true;
    }

    private static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }
}
