import java.util.Scanner;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = getRate(carModel);
    }

    double getRate(String model) {
        if (model.equalsIgnoreCase("Sedan")) {
            return 505.0;
        } else if (model.equalsIgnoreCase("SUV")) {
            return 860.0;
        } else if (model.equalsIgnoreCase("Hatchback")) {
            return 450.0;
        } else if (model.equalsIgnoreCase("Luxury")) {
            return 1200.0;
        } else {
            return 600.0;  
        }
    }

    double calculateTotalCost() {
        return costPerDay * rentalDays;
    }

    void showRentalInfo() {
        System.out.println("\n--- Rental Summary ---");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Cost per Day  : RS" + costPerDay);
        System.out.println("Total Cost    : RS" + calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Car Model (Sedan, SUV, Hatchback, Luxury): ");
        String model = sc.nextLine();

        System.out.print("Enter Number of Rental Days: ");
        int days = sc.nextInt();

        CarRental rental = new CarRental(name, model, days);

        rental.showRentalInfo();

        sc.close();
    }
}
