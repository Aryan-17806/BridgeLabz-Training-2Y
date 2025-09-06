import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots (degree < 0)");
        } else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } else {
            System.out.println("Two roots: " + roots[0] + " and " + roots[1]);
        }

        input.close();
    }

    private static double[] findRoots(double a, double b, double c) {
        double n = Math.pow(b, 2) - 4 * a * c;

        if (n < 0) {
            return new double[0];
        } else if (n == 0) {
            return new double[] { -b / (2 * a) };
        } else {
            double degree = Math.sqrt(n);
            double r1 = (-b + degree) / (2 * a);
            double r2 = (-b - degree) / (2 * a);
            return new double[] { r1, r2 };
        }
    }
}
