import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85", "B", "100", "abc"};

        for (String grade : grades) {
            try {
                int numericGrade = Integer.parseInt(grade);
                System.out.println("Parsed grade: " + numericGrade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}
