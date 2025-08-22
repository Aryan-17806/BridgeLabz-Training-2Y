import java.util.Scanner;

public class check_if_the_first_is_the_smallest_of_the_3numbers {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        input.close();
        boolean isSmallest = (n1 <= n2 && n1 <= n3);
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
