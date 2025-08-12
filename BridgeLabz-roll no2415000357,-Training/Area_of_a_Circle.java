import java.util.Scanner;

public class Area_of_a_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        input.close();
        double Area = 3.1415 * radius * radius;
        System.out.println(Area);
    }
}
