import java.util.Scanner;

public class RegularPolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double side = input.nextDouble();
        if (n < 3) {
            System.out.println("A polygon must have at least 3 sides.");
        }
        double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.printf("The area of the regular polygon is: %.4f\n", area);
        
        input.close();
    }
}
