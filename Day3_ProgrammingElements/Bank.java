import java.util.Scanner;

class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void showDetails(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            System.out.println("Bank: " + bankName);
            System.out.println("Account No: " + acc.accountNumber);
            System.out.println("Holder: " + acc.accountHolderName);
            System.out.println("Balance: " + acc.balance);
            System.out.println("-------------------");
        } else {
            System.out.println("Invalid object!");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many accounts you want to create? ");
        int n = input.nextInt();
        input.nextLine();

        BankAccount[] B1 = new BankAccount[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for account " + (i + 1));

            System.out.print("Account Number: ");
            int num = input.nextInt();
            input.nextLine();

            System.out.print("Account Holder Name: ");
            String name = input.nextLine();

            System.out.print("Initial Balance: ");
            double bal = input.nextDouble();

            B1[i] = new BankAccount(num, name, bal);
        }

        System.out.println("\n--- Account Details ---");
        for (BankAccount a : B1) {
            a.showDetails(a);
        }

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        input.close();
    }
}
