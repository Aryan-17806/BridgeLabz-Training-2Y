import java.util.Random;
import java.util.Scanner;

public class StudentCanVote {

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkAge(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false"; 
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; 
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void print(String[][] arr) {
        System.out.println("Age Can Vote?");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "  " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int [] ages = generateAges(n);
        String[][] str = checkAge(ages);

        print(str);
        input.close();
    }
}
