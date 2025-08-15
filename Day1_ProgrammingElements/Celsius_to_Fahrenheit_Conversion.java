import java.util.Scanner;

public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Celsius = input.nextInt();
        input.close();
        int Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println(Fahrenheit);
    }
    
}
