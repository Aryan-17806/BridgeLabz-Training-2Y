import java.util.Scanner;

public class GreatestFactor_forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int greatestFactor = 1;

        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor besides itself: " + greatestFactor);

        input.close();
    }    
}
