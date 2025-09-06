import java.util.Scanner;

public class UnitConverter3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = input.nextDouble();
        System.out.println(f + " F = " + convertFtoC(f) + " C");

        System.out.print("Enter Celsius: ");
        double c = input.nextDouble();
        System.out.println(c + " C = " + convertCtoF(c) + " F");

        System.out.print("Enter pounds: ");
        double p = input.nextDouble();
        System.out.println(p + " pounds = " + convertPoundsToKg(p) + " kg");

        System.out.print("Enter kilograms: ");
        double k = input.nextDouble();
        System.out.println(k + " kg = " + convertKgToPounds(k) + " pounds");

        System.out.print("Enter gallons: ");
        double g = input.nextDouble();
        System.out.println(g + " gallons = " + convertGallonsToLiters(g) + " liters");

        System.out.print("Enter liters: ");
        double l = input.nextDouble();
        System.out.println(l + " liters = " + convertLitersToGallons(l) + " gallons");

        input.close();
    }

    private static double convertFtoC(double f) { return (f - 32) * 5 / 9; }

    private static double convertCtoF(double c) { return (c * 9 / 5) + 32; }

    private static double convertPoundsToKg(double p) { return p * 0.453592; }

    private static double convertKgToPounds(double k) { return k * 2.20462; }

    private static double convertGallonsToLiters(double g) { return g * 3.78541; }

    private static double convertLitersToGallons(double l) { return l * 0.264172; }
}
