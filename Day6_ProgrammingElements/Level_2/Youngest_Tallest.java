import java.util.Scanner;

public class Youngest_Tallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i+1) + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of friend " + (i+1) + ": ");
            heights[i] = input.nextInt();
        }

        System.out.println("Youngest friend index = " + findYoungest(ages));
        System.out.println("Tallest friend index = " + findTallest(heights));

        input.close();
    }

    private static int findYoungest(int[] arr) {
        int minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) minIdx = i;
        }
        return minIdx + 1;
    }

    private static int findTallest(int[] arr) {
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIdx]) maxIdx = i;
        }
        return maxIdx + 1;
    }
}
