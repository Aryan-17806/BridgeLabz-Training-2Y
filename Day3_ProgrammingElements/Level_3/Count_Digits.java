import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;  
            
        }
        System.out.println("Number of digits = "+count);

    }
}
