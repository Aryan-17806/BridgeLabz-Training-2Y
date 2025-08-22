import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        String op = input.next();

        switch (op) {
            case "+":
                System.out.println("Result = " + (n1 + n2));
                break;
            case "-":
                System.out.println("Result = " + (n1 - n2));
                break;
            case "*":
                System.out.println("Result = " + (n1 * n2));
                break;
            case "/":
                if (n2 != 0) {
                    System.out.println("Result = " + (n1 / n2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        input.close();
    }
}
