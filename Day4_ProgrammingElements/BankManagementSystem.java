import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private int accountNumber;
    private double balance;
    private Bank bank;

    public Account(int accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void showAccountDetails() {
        System.out.println("Account No: " + accountNumber + ", Bank: " + bank.getBankName() + ", Balance: $" + balance);
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void viewBalance() {
        if (accounts.isEmpty()) {
            System.out.println(name + " has no accounts.");
        } else {
            System.out.println("Accounts for " + name + ":");
            for (Account acc : accounts) {
                acc.showAccountDetails();
            }
        }
    }
}

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public Account openAccount(Customer c, int accNo) {
        Account acc = new Account(accNo, this);
        c.addAccount(acc);
        return acc;
    }

    public void showBankDetails() {
        System.out.println("\nBank: " + bankName);
        if (customers.isEmpty()) {
            System.out.println("No customers yet.");
        } else {
            for (Customer c : customers) {
                c.viewBalance();
            }
        }
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Bank name: ");
        String bankName = input.nextLine();
        Bank bank = new Bank(bankName);

        System.out.print("Enter number of customers: ");
        int numCustomers = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numCustomers; i++) {
            System.out.print("Enter name of Customer " + (i + 1) + ": ");
            String custName = input.nextLine();
            Customer c = new Customer(custName);
            bank.addCustomer(c);

            System.out.print("How many accounts for " + custName + "? ");
            int numAcc = input.nextInt();
            for (int j = 0; j < numAcc; j++) {
                System.out.print("Enter Account Number: ");
                int accNo = input.nextInt();
                Account acc = bank.openAccount(c, accNo);
                System.out.print("Initial Deposit: ");
                double deposit = input.nextDouble();
                acc.deposit(deposit);
            }
            input.nextLine();
        }

        bank.showBankDetails();
        input.close();
    }
}
