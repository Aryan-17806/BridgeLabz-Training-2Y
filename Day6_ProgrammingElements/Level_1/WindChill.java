import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature (F): ");
        double t = input.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double v = input.nextDouble();

        getWindChill(t, v);
        input.close();
    }

    private static void getWindChill(double t, double v) {
        double windChill = 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);

        System.out.printf("Wind Chill Temperature = %.2f°F%n", windChill);
    }
}
