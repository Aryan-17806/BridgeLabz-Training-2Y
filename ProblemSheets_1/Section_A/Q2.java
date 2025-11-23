
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n % 2 == 0){
            System.out.println("Is odd :"+false);
        }
        else{
            System.out.println("Is odd :"+true);
        }
        input.close();
    }
}