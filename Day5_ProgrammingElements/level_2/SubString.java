import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        input.close(); 

        System.out.println("All substrings are:");
        sub_String(str);
    }

    private static void sub_String(String str) {
        for (int i = 0; i < str.length(); i++) {
            String temp = "";  
            for (int j = i; j < str.length(); j++) {
                temp += str.charAt(j);
                System.out.println(temp);
            }
        }
    }
}
