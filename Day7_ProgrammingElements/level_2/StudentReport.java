import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayReport() {
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.printf("Marks      : %.2f\n", marks);
        System.out.println("Grade      : " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = input.nextInt();

        System.out.print("Enter marks obtained: ");
        double marks = input.nextDouble();

        Student student = new Student(name, rollNumber, marks);
        student.displayReport();

        input.close();
    }
}
