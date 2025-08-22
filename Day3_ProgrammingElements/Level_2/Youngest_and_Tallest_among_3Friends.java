import java.util.Scanner;

public class Youngest_and_Tallest_among_3Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        int heightAmar = input.nextInt();
        int heightAkbar = input.nextInt();
        int heightAnthony = input.nextInt();

        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Amar is youngest");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Akbar is youngest");
        } else {
            System.out.println("Anthony is youngest");
        }

        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Amar is tallest");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Akbar is tallest");
        } else {
            System.out.println("Anthony is tallest");
        }

        input.close();
    }
}
