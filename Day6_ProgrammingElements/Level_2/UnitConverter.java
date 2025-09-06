import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter km: ");
        double km = input.nextDouble();
        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");

        System.out.print("Enter miles: ");
        double miles = input.nextDouble();
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");

        System.out.print("Enter meters: ");
        double meters = input.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");

        input.close();
    }

    private static double convertKmToMiles(double km) { return km * 0.621371; }

    private static double convertMilesToKm(double miles) { return miles * 1.60934; }
    
    private static double convertMetersToFeet(double m) { return m * 3.28084; }
    
    private static double convertFeetToMeters(double f) { return f * 0.3048; }
}
