import java.util.Scanner;

public class DisplayTheCharacterType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = input.nextLine().toLowerCase();
        input.close();

        int countV = 0;
        int countC = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countV++;
                    System.out.println(ch + " is a vowel");
                }
                else {
                    countC++;
                    System.out.println(ch +" is a consonant");
                }
            }
            else{
                System.out.println(ch + " is not a Letter");
            }
        }

        System.out.println("Vowels: " + countV);
        System.out.println("Consonants: " + countC);
    }

}
