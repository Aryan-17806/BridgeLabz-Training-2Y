package sheet_1;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n % 2 == 0){
            System.out.println("Is Even :"+true);
        }
        else{
            System.out.println("Is Even :"+false);
        }
        input.close();
    }
}
