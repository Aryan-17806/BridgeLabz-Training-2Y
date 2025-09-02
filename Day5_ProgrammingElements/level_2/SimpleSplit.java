import java.util.Scanner;

public class SimpleSplit {

        public static int findLength(String str) {
            return str.length();
        }

    public static String[] customSplit(String str) {
        int n = findLength(str);

        int words = 1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') words++;
        }

        String[] result = new String[words];
        String temp = "";
        int index = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                result[index++] = temp;
                temp = "";
            } else {
                temp += ch;
            }
        }
        result[index] = temp;
        return result;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] s1 = customSplit(text);
        String[] s2 = text.split(" ");

        System.out.println("Custom Split:");
        for (String w : s1) System.out.println(w);

        System.out.println("Built-in Split:");
        for (String w : s2) System.out.println(w);

        System.out.println(compareArrays(s1, s2));
        input.close();
    }
}
