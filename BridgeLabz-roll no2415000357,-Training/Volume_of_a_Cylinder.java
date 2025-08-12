import java.util.Scanner;

public class Volume_of_a_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        int height = input.nextInt();
        input.close();
        double Volume = 3.1415 * radius*radius * height;
        System.out.println(Volume);
    }
    
}
