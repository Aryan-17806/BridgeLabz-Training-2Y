import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee: " + name + " (" + position + ")");
    }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showDepartmentDetails() {
        System.out.println("\nDepartment: " + deptName);
        if (employees.isEmpty()) {
            System.out.println("No employees in this department.");
        } else {
            for (Employee e : employees) {
                e.showEmployeeDetails();
            }
        }
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showCompanyDetails() {
        System.out.println("\nCompany: " + companyName);
        for (Department d : departments) {
            d.showDepartmentDetails();
        }
    }

    // Demonstrating composition
    public void closeCompany() {
        System.out.println("\nClosing company " + companyName + "...");
        departments.clear();
        System.out.println("All departments and employees have been removed.");
    }
}

public class CompanyManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Company name: ");
        String companyName = input.nextLine();
        Company company = new Company(companyName);

        System.out.print("Enter number of departments: ");
        int numDepartments = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numDepartments; i++) {
            System.out.print("Enter Department name " + (i + 1) + ": ");
            String deptName = input.nextLine();
            Department dept = new Department(deptName);
            company.addDepartment(dept);

            System.out.print("Enter number of employees in " + deptName + ": ");
            int numEmployees = input.nextInt();
            input.nextLine();

            for (int j = 0; j < numEmployees; j++) {
                System.out.print("Employee Name: ");
                String empName = input.nextLine();
                System.out.print("Position: ");
                String position = input.nextLine();
                Employee emp = new Employee(empName, position);
                dept.addEmployee(emp);
            }
        }

        company.showCompanyDetails();

        System.out.print("Do you want to close the company? (yes/no): ");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            company.closeCompany();
        }

        input.close();
    }
}
