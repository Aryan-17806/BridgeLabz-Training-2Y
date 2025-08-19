// Program 2: Area of a Triangle in Square cm and Square inches
import java.util.Scanner;
public class TriangleAreaConversion {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq cm is " + areaCm2 + " and in sq in is " + areaIn2);
        input.close();
    }
}
