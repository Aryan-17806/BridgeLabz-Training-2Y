import java.util.Scanner;

public class UnitConverter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = input.nextDouble();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        System.out.print("Enter meters: ");
        double meters = input.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");

        System.out.print("Enter inches (again): ");
        double in = input.nextDouble();
        System.out.println(in + " inches = " + convertInchesToCm(in) + " cm");

        input.close();
    }

    private static double convertYardsToFeet(double y) { return y * 3; }
    
    private static double convertFeetToYards(double f) { return f * 0.333333; }
    
    private static double convertMetersToInches(double m) { return m * 39.3701; }
    
    private static double convertInchesToMeters(double i) { return i * 0.0254; }
    
    private static double convertInchesToCm(double i) { return i * 2.54; }
}
