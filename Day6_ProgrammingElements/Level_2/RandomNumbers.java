import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many random 4-digit numbers: ");
        int size = input.nextInt();

        int[] numbers = getArr(size);

        System.out.print("Generated numbers: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        double[] stats = AvgMinMax(numbers);
        System.out.println("Average = " + stats[0]);
        System.out.println("Min     = " + stats[1]);
        System.out.println("Max     = " + stats[2]);

        input.close();
    }

    private static int[] getArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    private static double[] AvgMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }

        double avg = (double) sum / numbers.length;
        return new double[] { avg, min, max };
    }
}
