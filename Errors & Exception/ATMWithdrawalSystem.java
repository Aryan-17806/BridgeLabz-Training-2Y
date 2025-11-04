class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class ATM {
    private double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Available balance: ₹" + balance);
        } else if (amount <= 0) {
            throw new InsufficientFundsException("Invalid withdrawal amount! Please enter a positive value.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Amount withdrawn: ₹" + amount);
            System.out.println("Remaining balance: ₹" + balance);
        }
    }
}

public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        ATM atm = new ATM(10000);
        try {
            System.out.println("Attempting to withdraw ₹12000...");
            atm.withdraw(12000);
        } 
        catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nAttempting to withdraw ₹5000...");
        try {
            atm.withdraw(5000);  
        } 
        catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
