import java.util.*;

public class NumberChecker9 {
    static String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        printCalendar(m, y);
        sc.close();
    }

    static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    static void printCalendar(int m, int y) {
        if (m == 2 && isLeap(y)) days[m-1] = 29;
        System.out.println("\nCalendar for " + months[m-1] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int startDay = new GregorianCalendar(y, m-1, 1).get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < startDay; i++) System.out.print("    ");
        for (int d = 1; d <= days[m-1]; d++) {
            System.out.printf("%3d ", d);
            if ((d + startDay - 1) % 7 == 0) System.out.println();
        }
    }
}
