import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println(countUniqueDigits(n));
    }
    public static int countUniqueDigits(int n) {
        boolean[] seen = new boolean[10];
        n = Math.abs(n);
    
        if (n == 0) return 1;
    
        while (n > 0) {
            seen[n % 10] = true;
            n /= 10;
        }
    
        int count = 0;
        for (boolean b : seen) if (b) count++;
        return count;
    }
    
}
