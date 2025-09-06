import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] people = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            people[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) of person " + (i+1) + ": ");
            
            people[i][1] = input.nextDouble();
            
            people[i][2] = calculateBMI(people[i][0], people[i][1]);
            
            status[i] = getStatus(people[i][2]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d -> Weight: %.1f kg, Height: %.1f cm, BMI: %.2f, Status: %s%n",
                i+1, people[i][0], people[i][1], people[i][2], status[i]);
        }

        input.close();
    }

    private static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    private static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}
