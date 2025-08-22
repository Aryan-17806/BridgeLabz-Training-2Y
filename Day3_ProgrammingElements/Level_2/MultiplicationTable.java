import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        for(int i = 6 ; i <= 9 ;i++) System.out.println(n + " * " + i + " = "+ i*n);
    }
}
