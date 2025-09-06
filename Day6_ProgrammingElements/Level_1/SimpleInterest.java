import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle :");
        int p = input.nextInt();
        System.out.print("Enter rate :");
        int r = input.nextInt();
        System.out.print("Enter time in year :");
        int t = input.nextInt();
        input.close();
        int ans = simple_Interest(p,r,t);
        System.out.println("The Simple Interest is " + ans +" for Principal "+ p + " Rate of Interest " + r + " and Time " + t);
        
            }
        
            private static int simple_Interest(int p, int r, int t) {
                return (p*r*t)/100;
            }
}
