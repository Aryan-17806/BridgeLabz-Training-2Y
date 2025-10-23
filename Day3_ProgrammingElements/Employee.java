public class Employee {
    static String companyName = "Tech Solutions Ltd.";
    private String name;
    private final int id;
    private String designation;
    static int totalEmployees = 0;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            System.out.println("Employee Name: " + name + ", ID: " + id + ", Designation: " + designation);
        } else {
            System.out.println("Not an Employee instance.");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 101, "Manager");
        Employee e2 = new Employee("Bob", 102, "Developer");
        e1.displayEmployeeDetails(e1);
        e2.displayEmployeeDetails(e2);
        Employee.displayTotalEmployees();
    }
}
