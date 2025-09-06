import java.util.Scanner;

public class maximumNumberOfHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number Of Students :");
        int numberOfStudents = input.nextInt();
        maxhandshakes(numberOfStudents);
                input.close();
            }
        
            private static void maxhandshakes(int n) {
                System.out.println((n * (n - 1)) / 2);
            }
    
}
