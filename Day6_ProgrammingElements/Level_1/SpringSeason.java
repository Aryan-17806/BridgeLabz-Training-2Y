import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();

        boolean isSpring = false;

        Season(month, day, isSpring);
        input.close();
    }

    private static void Season(int month, int day, boolean isSpring) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            isSpring = true;
        }

        System.out.println("Is Spring Season? " + isSpring);
    }
}
