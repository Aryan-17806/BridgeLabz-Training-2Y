import java.util.Random;

public class FootballHeights {
    public static void main(String[] args) {
        int[] arr = new int[11];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 150 + random.nextInt(101);
        }

        System.out.print("Heights: ");
        for (int h : arr) System.out.print(h + " ");
        System.out.println();

        System.out.println("Shortest = " + getShortest(arr));
        System.out.println("Tallest  = " + getTallest(arr));
        System.out.println("Mean     = " + getMean(arr));
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    private static double getMean(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }

    private static int getShortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    private static int getTallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }
}
