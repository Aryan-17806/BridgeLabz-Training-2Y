import java.util.*;

public class NumberChecker7 {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();

        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("All unique? " + areUnique(otps));
    }

    static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    static boolean areUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) set.add(n);
        return set.size() == arr.length;
    }
}
