import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        boolean isPrime = true;
        if (n <= 1) isPrime = false;
        else{
            for(int i = 2 ; i  < n/2 ; i ++){
                if (n%i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) System.out.println("Prime number");
        else System.out.println("Not a Prime number");
    }
}
