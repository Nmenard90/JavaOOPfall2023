class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    // Constructor to initialize savingsBalance
    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    // Calculate monthly interest and add it to the balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Deposit money into the account (do not accept negative amount)
    public void depositAmount(double amount) {
        if (amount > 0) {
            savingsBalance += amount;
        }
    }

    // Withdraw money from the account (do not accept negative amount)
    public void withdrawAmount(double amount) {
        if (amount > 0 && amount <= savingsBalance) {
            savingsBalance -= amount;
        }
    }

    // Modify annual interest rate (static)
    public static void modifyInterestRate(double rate) {
        if (rate >= 2.0 && rate <= 5.0) {
            annualInterestRate = rate / 100; // Convert to decimal
        }
    }

    // Get string representation of SavingsAccount object
    @Override
    public String toString() {
        return "Balance: $" + String.format("%.2f", savingsBalance);
    }
}

public class Program8 {
    public static void main(String[] args) {
        // Instantiate two SavingsAccount objects with initial balances
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set the annual interest rate to 4%
        SavingsAccount.modifyInterestRate(4.0);

        // Calculate and print monthly balances for 12 months
        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + month + ":");
            System.out.println("Saver1 " + saver1);
            System.out.println("Saver2 " + saver2);
        }

        // Deposit $1500 to saver1's account and withdraw $550 from saver2's account
        saver1.depositAmount(1500.00);
        saver2.withdrawAmount(550.00);

        // Set the annual interest rate to 5%
        SavingsAccount.modifyInterestRate(5.0);

        // Calculate and print next month's balances
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Next Month:");
        System.out.println("Saver1 " + saver1);
        System.out.println("Saver2 " + saver2);
    }
}
