import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Integer n2 = Integer.valueOf(n);

        System.out.println(" Primitive to Wrapper Conversion");
        System.out.println("Primitive value: " + n);
        System.out.println("Wrapper object value: " + n2);
        input.close();
    }
}
