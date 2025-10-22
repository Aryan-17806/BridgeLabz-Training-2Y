import java.util.Scanner;

public class TrigonometricCalculator {

    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);

        double sin = Math.sin(angleRadians);
        double cos = Math.cos(angleRadians);
        double tan = Math.tan(angleRadians);

        return new double[] { sin, cos, tan };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.printf("Sine(%.2f°)   = %.6f\n", angle, results[0]);
        System.out.printf("Cosine(%.2f°) = %.6f\n", angle, results[1]);
        System.out.printf("Tangent(%.2f°)= %.6f\n", angle, results[2]);

        if (Math.abs(results[1]) < 1e-10) {
            System.out.println("Warning: Tangent is undefined at this angle (cosine is near zero).");
        }
        input.close();
    }
}
