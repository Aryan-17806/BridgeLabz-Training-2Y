import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = input.nextInt();
            System.out.println("Can vote? " + canStudentVote(ages[i]));
        }

        input.close();
    }

    private static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
}
