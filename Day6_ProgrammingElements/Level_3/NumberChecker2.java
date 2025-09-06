import java.util.Scanner;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int[] arr = getDigits(n);

        System.out.println("Sum of digits = " + sumDigits(arr));
        System.out.println("Sum of squares = " + sumSqua(arr));
        System.out.println("Harshad number? " + isHarshad(n, arr));

        int[][] freq = getFreq(arr);
        System.out.println("Digit frequencies:");
        for (int[] row : freq) {
            System.out.println(row[0] + " -> " + row[1]);
        }
        input.close();
    }

    private static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    private static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    private static int sumSqua(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    private static boolean isHarshad(int num, int[] digits) {
        int sum = sumDigits(digits);
        return num % sum == 0;
    }

    private static int[][] getFreq(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}
