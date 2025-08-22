import java.util.*;
//1³ + 5³ + 3³ = 1 + 125 + 27 = 153
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int sum = 0,count = 0,temp = n;

        while (temp != 0){
            temp /= 10;
            count++;
        }
        temp = n;
        while(temp != 0){
            int dig = temp % 10 ;
            sum += Math.pow(dig, count);
            temp /= 10;
        }
        if(n == sum) System.out.println("Armstrong Number");
        else System.out.println("Not a Armstrong Number");

    }
}
