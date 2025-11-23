import java.util.Scanner;

public class Q9 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countE = 0;
        int countO = 0;

        System.out.println("Enter a number : ");

        for (int i = 0; i < 5; i++) {
            int n = input.nextInt();
            if (n % 2 != 0) {
                countO++;
            }
            else{
                countE++;
            }
        }
        input.close();

        System.out.println("Even count are : "+countE);
        System.out.println("odd count are : "+countO);
    }
}
