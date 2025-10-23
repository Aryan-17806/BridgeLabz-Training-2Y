public class Vehicle {
    static double registrationFee = 500.0; 
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("New Registration Fee: $" + registrationFee);
    }

    public void displayVehicleDetails(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType +
                               ", Reg No: " + registrationNumber + ", Fee: $" + registrationFee);
        } else {
            System.out.println("Not a Vehicle instance.");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car", "CAR-1001");
        Vehicle v2 = new Vehicle("Bob", "Bike", "BIKE-2022");
        v1.displayVehicleDetails(v1);
        v2.displayVehicleDetails(v2);
        Vehicle.updateRegistrationFee(600);
    }
}
