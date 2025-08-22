import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int org = n,digsum = 0;
        while(org != 0){
            int dig = org % 10;
            digsum += dig;
            org /= 10;
        }
        if (n % digsum == 0) System.out.println(n + " is a Harshad Number");
        else System.out.println("Not a Harshad Number");

    }
}
