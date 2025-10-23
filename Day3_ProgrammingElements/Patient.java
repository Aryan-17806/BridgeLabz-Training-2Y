public class Patient {
    static String hospitalName = "CityCare Hospital";
    static int totalPatients = 0;
    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            System.out.println("Patient ID: " + patientID + ", Name: " + name +
                               ", Age: " + age + ", Ailment: " + ailment +
                               ", Hospital: " + hospitalName);
        } else {
            System.out.println("Not a Patient instance.");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Emma", 35, "Flu", 301);
        Patient p2 = new Patient("Liam", 42, "Fracture", 302);
        p1.displayPatientDetails(p1);
        p2.displayPatientDetails(p2);
        Patient.getTotalPatients();
    }
}
