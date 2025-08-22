import java.util.Scanner;

public class check_if_a_number_is_divisible_by_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n % 5 == 0) System.out.print(n+ " Is the number which is divisible by 5");
        else System.out.print(n + " Is not the number which is divisible by 5");
        input.close();
    }
}
