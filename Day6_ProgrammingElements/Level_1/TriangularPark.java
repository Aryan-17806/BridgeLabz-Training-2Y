import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of the triangular park (in meters): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        int rounds = Parimeter(a, b, c);

        System.out.println("Rounds required to complete 5 km = " + rounds);
        input.close();
    }

    private static int Parimeter(double a, double b, double c) {
        double n = a + b + c;
        int rounds = (int) Math.ceil(5000.0 / n);
        return rounds;
    }
}
